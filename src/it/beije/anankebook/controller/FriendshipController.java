package it.beije.anankebook.controller;

import org.springframework.stereotype.Controller;

import it.beije.anankebook.service.FriendshipService;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class FriendshipController {

	@Autowired
	private FriendshipService friendshipService;
	
	
	
}
