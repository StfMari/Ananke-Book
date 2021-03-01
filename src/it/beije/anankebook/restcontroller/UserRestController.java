package it.beije.anankebook.restcontroller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import it.beije.anankebook.repository.UserRepository;
import it.beije.anankebook.service.FriendshipService;
import it.beije.anankebook.service.UserService;
import it.beije.anankebook.service.UserService;
import it.beije.anankebook.model.beans.User;


@RestController
public class UserRestController {
	
	@Autowired
	private FriendshipService friendshipService; 
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/user/{userId}")
	public User getUserDetails(@PathVariable Integer userId) {
		System.out.println("Requested user id: " + userId);
		User user = userRepository.findById(userId).get();
		return user;
	}
	
	@PostMapping("/user")
	public User registerUser(@RequestBody User user) {
		System.out.println("User to register: " + user);
		userService.save(user);
		return user;
	}
	
	@PostMapping("/RequestFriends")
	public User requestFriends(@RequestBody User user, @PathVariable Integer Id, Model model, HttpSession session) {
		User u = (User) session.getAttribute("user");
		List<User> friends = userService.userFriendsList(friendshipService.requestList(u.getId()));
		model.addAttribute("friends", friends);
		return user;
	}
	
	
}
