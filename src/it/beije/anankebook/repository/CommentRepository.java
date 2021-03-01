package it.beije.anankebook.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import it.beije.anankebook.model.beans.Post;
import it.beije.anankebook.model.beans.Friendship;
import it.beije.anankebook.model.beans.User;
import it.beije.anankebook.model.beans.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer>{	

	public List<Comment> findByPostId(Integer postId);
	
	//metodo che tira fuori i commenti per un singolo post, e con la data e ora che soddisfa dei parametri

}