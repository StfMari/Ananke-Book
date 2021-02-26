package it.beije.anankebook.model.beans;

import it.beije.anankebook.util.ReactionType;

public class PostReaction {
	Integer reactionId;
	Integer postId;
	Integer userId;
	ReactionType reactionType;
	
	public Integer getReactionId() {
		return reactionId;
	}
	public void setReactionId(Integer reactionId) {
		this.reactionId = reactionId;
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
}
