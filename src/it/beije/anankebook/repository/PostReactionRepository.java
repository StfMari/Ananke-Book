package it.beije.anankebook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.beije.anankebook.model.beans.PostReaction;

@Repository
public interface PostReactionRepository extends JpaRepository<PostReaction, Integer>{

	public List<PostReaction> findByPostId(Integer postId);
	
}
