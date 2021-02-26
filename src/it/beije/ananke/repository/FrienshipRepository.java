package it.beije.ananke.repository;

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
//	@Query(nativeQuery = true, value = "SELECT * FROM user WHERE user_id = :userId  AND state = :state")
//	public ArrayList<Friendship> findByUserIdAndState(@Param(value = "userId") Integer userId,@Param(value = "state") String state);
	
	
}