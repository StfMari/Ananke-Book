package it.beije.anankebook.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import it.beije.anankebook.service.FriendshipService;

@RestController
public class FriendshipRestController {

	@Autowired
	private FriendshipService friendshipService;
	
	
}
