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
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private FriendshipRepository friendshipRepository;
	
	public void save(User user) {
		userRepository.save(user);
	}
	
	public User findByEmailAndPassword(String email, String password) {
		return userRepository.findByEmailAndPassword(email, password);
	}

	public List<User> userFriendsList(List<Friendship> list){
		List<User> friends = new ArrayList<>();
		for(Friendship f: list) {
			friends.add(userRepository.findById(f.getUserReceiverId()).get());
		}
		return friends;
	}

}
