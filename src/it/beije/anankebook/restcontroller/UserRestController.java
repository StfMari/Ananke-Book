package it.beije.anankebook.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import it.beije.anankebook.repository.UserRepository;
import it.beije.anankebook.service.UserService;
import it.beije.anankebook.model.beans.User;


@RestController
public class UserRestController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserRepository userRepository;
	
//	@GetMapping("/user/{userId}")
//	public User getUserDetails(@PathVariable String username) {
//		System.out.println("Requested user username: " + username);
//		User selectedUser = userRepository.findByUsername(username);
//		if(selectedUser != null) {
//			return selectedUser;
//		}
//		return null;
//	}
	
	@PostMapping("/user")
	public User registerUser(@RequestBody User user) {
		System.out.println("User to register: " + user);
		userService.save(user);
		return user;
	}
	
}
