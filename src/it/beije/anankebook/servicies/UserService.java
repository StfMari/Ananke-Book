package it.beije.anankebook.servicies;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.beije.anankebook.model.beans.Friendship;
import it.beije.anankebook.model.beans.User;
import it.beije.anankebook.repository.FrienshipRepository;
import it.beije.anankebook.repository.UserRepository;
import it.beije.anankebook.util.Status;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private FrienshipRepository friendshipRepository;
	
	public void save(User user) {
		userRepository.save(user);
	}
	
	public User findByEmailAndPassword(String email, String password) {
		return userRepository.findByEmailAndPassword(email, password);
	}

	public List<Friendship> showFriends(Integer Id) {
		return friendshipRepository.findByuserReceiverIdAndStatus(Id, Status.ACCEPTED);
		
	}	
	
	public List<Friendship> showRequests(Integer Id) {
		return friendshipRepository.findByuserReceiverIdAndStatus(Id, Status.OPEN);
		
	}	

}
