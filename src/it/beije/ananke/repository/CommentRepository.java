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
import it.beije.anankebook.model.beans.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer>{	

	
	
	
//	@Query(nativeQuery = true, value = "SELECT * FROM Order_item WHERE order_id = :orderId  AND product_id = :productId")
//	public Comment findByOrderIdAndProductId(@Param(value = "orderId") Integer orderId,@Param(value = "productId") Integer productId);
//
//
//	@Query(nativeQuery = true, value = "SELECT * FROM Order_item AND Orders WHERE order_id = :orderId")
//	public ArrayList<Comment> findByOrderId(@Param(value = "orderId") Integer orderId);


}