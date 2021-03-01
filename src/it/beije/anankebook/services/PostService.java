package it.beije.anankebook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.beije.anankebook.model.beans.Post;
import it.beije.anankebook.repository.PostRepository;
import it.beije.anankebook.repository.UserRepository;

@Service
public class PostService {
	@Autowired
	private PostRepository postRepository;
	
	public void save(Post post) {
		postRepository.save(post);
	}
	
}
