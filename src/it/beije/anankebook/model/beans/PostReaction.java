package it.beije.anankebook.model.beans;


public class PostReaction {
	Integer reactionId;
	Integer postId;
	Integer userId;
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
}
