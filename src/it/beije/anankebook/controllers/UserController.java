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
import it.beije.anankebook.servicies.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService; 
	
	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public String getIndex() {		
		return "indexSocial";
	}
	
	@RequestMapping(value = "/logIn", method = RequestMethod.POST)
	public String login(@RequestParam String email, @RequestParam String password, Model model, HttpSession session) {
		User user = userService.findByEmailAndPassword(email, password);
		if(user != null) {
			User userBean = (User)session.getAttribute("userBean");
			if (userBean == null) {
				session.setAttribute("userBean", user);
			}	
			//login
			return "homePageSocial";
		}
		//errore
		return "logInSocial";
	}
	
	@RequestMapping(value = {"/logIn"}, method = RequestMethod.GET)
	public String login() {		
		return "logInSocial";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {		
		return "registerSocial";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(User user) {
		userService.save(user);
		return"logInSocial";
	}
}
