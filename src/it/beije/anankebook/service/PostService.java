package it.beije.anankebook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.beije.anankebook.model.beans.Post;
import it.beije.anankebook.repository.PostRepository;


@Service
public class PostService {
	@Autowired
	private PostRepository postRepository;
	
	public void save(Post post) {
		postRepository.save(post);
	}

	public Post findById(Integer postId) {
		Optional<Post> post = postRepository.findById(postId);
		return post.get();
	}

	public List<Post> findAll() {
		return postRepository.findAll();
	}
	
}
