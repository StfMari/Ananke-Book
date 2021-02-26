package it.beije.anankebook.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.beije.anankebook.model.beans.User;

@Controller
public class UserController {

	@Autowired
	private UserService userService; 
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam String email, @RequestParam String password, Model model, HttpSession session) {
		User user = userService.findByEmailAndPassword(email, password);
		if(user != null) {
			User userBean = (User)session.getAttribute("userBean");
			if (userBean == null) {
				session.setAttribute("userBean", user);
			}	
			//login
			return "";
		}
		//errore
		return "";
	}
	
	@RequestMapping(value = {"/","/login"}, method = RequestMethod.GET)
	public String login() {		
		return "login";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {		
		return "register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(User user) {
		userService.save(user);
		return"login";
	}
}
