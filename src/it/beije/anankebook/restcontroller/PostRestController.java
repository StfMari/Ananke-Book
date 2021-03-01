package it.beije.anankebook.restcontroller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.beije.anankebook.repository.PostRepository;
import it.beije.anankebook.services.PostService;
import it.beije.anankebook.model.beans.Post;
import it.beije.anankebook.model.beans.User;

@RestController
public class PostRestController {
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private PostRepository postRepository;

	@GetMapping("/post/{postId}")
	public Post getUserDetails(@PathVariable Integer postId) {
		System.out.println("Requested post id: " + postId);
		Post post = postRepository.findById(postId).get();
		return post;
	}
	
	@GetMapping("/feed")
	public List<Post> refreshFeed() {
		System.out.println("Loading feed...");
		List<Post> posts = postRepository.findAll();
		// aggiornare poi con una query che fa "order by date"
		Collections.sort(posts, (p1, p2) -> (p2.getId().compareTo(p1.getId())));
		System.out.println("Here comes the posts: " + posts);
		return posts;
	}
	
	@PutMapping("/publishpost") 
	public Post publishPost(@RequestBody Post post) {
		System.out.println("Uploading new post...");
		postService.save(post);
		return post;
	}
	
	
}
