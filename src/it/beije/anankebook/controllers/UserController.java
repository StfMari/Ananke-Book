package it.beije.anankebook.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.beije.anankebook.model.beans.Friendship;
import it.beije.anankebook.model.beans.User;
import it.beije.anankebook.services.FriendshipService;
import it.beije.anankebook.services.UserService;

import it.beije.anankebook.util.Views;
import it.beije.anankebook.util.Mappings;

@Controller
public class UserController {

	@Autowired
	private FriendshipService friendshipService; 
	@Autowired
	private UserService userService; 
	
	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public String getIndex() {		
		return Views.LOGIN;
	}
	
	@RequestMapping(value = "/" + Mappings.LOGIN, method = RequestMethod.POST)
	public String login(@RequestParam String email, @RequestParam String password, Model model, HttpSession session) {
		User user = userService.findByEmailAndPassword(email, password);
		if(user != null) {
			User userBean = (User)session.getAttribute("user");
			if (userBean == null) {
				session.setAttribute("user", user);
			}	
			//login
			return Views.HOMEPAGE;
		}
		//errore
		return Views.LOGIN;
	}
	
	@RequestMapping(value = {"/" + Mappings.LOGIN}, method = RequestMethod.GET)
	public String login() {		
		return Views.LOGIN;
	}
	
	@RequestMapping(value = "/" + Mappings.REGISTER, method = RequestMethod.GET)
	public String register() {		
		return Views.REGISTER;
	}
	
	@RequestMapping(value = "/" + Mappings.REGISTER, method = RequestMethod.POST)
	public String register(User user) {
		userService.save(user);
		return Views.LOGIN;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(User user) {
		userService.save(user);
		return "Home";
	}
	
	@RequestMapping(value = "/friends", method = RequestMethod.POST)
	public String friendList(@PathVariable Integer Id, Model model) {
		List<User> friends = userService.userFriendsList(friendshipService.friendshipList(Id));
		model.addAttribute("friends", friends);
		// oppure user.getId ma uso la session?
		return "FriendsList";
	}

	
}
