package it.beije.anankebook.model.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import it.beije.anankebook.util.ReactionType;

@Entity
@Table(name="post_reaction")
public class PostReaction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	Integer id;
	
	@Column(name="post_id")
	Integer postId;
	
	@Column(name="user_id")
	Integer userId;
	
	@Column(name="reaction_type")
	ReactionType reactionType;
	
	
	public Integer getId() {
		return id;
	}
	
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public Integer getPostId() {
		return postId;
	}
	
	
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	
	
	public Integer getUserId() {
		return userId;
	}
	
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
	public ReactionType getReactionType() {
		return reactionType;
	}
	
	
	public void setReactionType(ReactionType reactionType) {
		this.reactionType = reactionType;
	}


	@Override
	public String toString() {
		return "PostReaction [id=" + id + ", postId=" + postId + ", userId=" + userId + ", reactionType=" + reactionType
				+ "]";
	}

	
}

