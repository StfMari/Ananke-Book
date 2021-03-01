package it.beije.anankebook.restcontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import it.beije.anankebook.repository.UserRepository;
import it.beije.anankebook.service.UserService;
import it.beije.anankebook.model.beans.User;


@RestController
public class UserRestController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/user/{userId}")
	public User getUserDetails(@PathVariable Integer userId) {
		System.out.println("Requested user id: " + userId);
		return userService.findById(userId);
		 
	}
	
	@PostMapping("/user")
	public User registerUser(@RequestBody User user) {
		System.out.println("User to register: " + user);
		userService.save(user);
		return user;
	}
	
}
