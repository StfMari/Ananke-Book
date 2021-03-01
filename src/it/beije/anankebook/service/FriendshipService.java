package it.beije.anankebook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.beije.anankebook.model.beans.Friendship;
import it.beije.anankebook.model.beans.User;
import it.beije.anankebook.repository.FriendshipRepository;
import it.beije.anankebook.repository.UserRepository;
import it.beije.anankebook.util.Status;

@Service
public class FriendshipService {

	@Autowired
	private FriendshipRepository friendshipRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public List<Friendship> friendshipList(Integer id){
		return friendshipRepository.findByUserReceiverIdAndStatus(id, Status.ACCEPTED);
	}
	
	public List<Friendship> requestList(Integer Id) {
		return friendshipRepository.findByUserReceiverIdAndStatus(Id, Status.OPEN);
		
	}	
}
