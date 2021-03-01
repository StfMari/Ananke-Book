package it.beije.anankebook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.beije.anankebook.model.beans.Friendship;
import it.beije.anankebook.util.Status;

@Repository
public interface FrienshipRepository extends JpaRepository<Friendship, Integer>{

	public List<Friendship> findByUserSenderId(Integer userSenderId);
	
	public Friendship findByUserSenderIdAndUserReceiverId(Integer userSenderId, Integer userReceiverId);
	
	public Friendship findByUserReceiverIdAndUserSenderId(Integer userReceiverId, Integer userSenderId);

	public List<Friendship> findByuserReceiverIdAndStatus(Integer userId, Status status);

	
}