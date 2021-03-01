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

@Repository
public interface FrienshipRepository extends JpaRepository<Friendship, Integer>{

	public List<Friendship> findByUserSenderId(Integer userSenderId);
	
	public Friendship findByUserSenderIdAndUserReceiverId(Integer userSenderId, Integer userReceiverId);
	
	public Friendship findByUserReceiverIdAndUserSenderId(Integer userReceiverId, Integer userSenderId);
	
}