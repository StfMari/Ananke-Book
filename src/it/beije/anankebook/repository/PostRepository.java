package it.beije.anankebook.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.beije.anankebook.model.beans.Post;
import it.beije.anankebook.model.beans.Friendship;
import it.beije.anankebook.model.beans.User;


@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{
	
	public Optional<Post> findById(Integer id);
	
	public Optional<Post> findByUserId(Integer userId);
	
	//cerca i più recenti. dato un certo timestamp, prendo tutti i post con data e ora successivi ad esso
	
}