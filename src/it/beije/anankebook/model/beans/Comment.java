package it.beije.anankebook.model.beans;

import java.time.LocalDate;

public class Comment {
	Integer commentId;
	Integer postId;
	Integer userId; 				//Colui che commenta
	String content;
	LocalDate commentDate;
	public Integer getCommentId() {
		return commentId;
	}
	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDate getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(LocalDate commentDate) {
		this.commentDate = commentDate;
	}
}
