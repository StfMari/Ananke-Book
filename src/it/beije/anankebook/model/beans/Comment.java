package it.beije.anankebook.model.beans;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comment")
public class Comment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	Integer id;
	
	@Column(name="post_id")
	Integer postId;
	
	//Colui che commenta
	@Column(name="user_id")
	Integer userId;
	
	@Column(name="content")
	String content;
	
	@Column(name="date")
	LocalDate commentDate;
	
	
	public Integer getId() {
		return id;
	}
	
	
	public void setId(Integer commentId) {
		this.id = commentId;
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


	@Override
	public String toString() {
		return "Comment [id=" + id + ", postId=" + postId + ", userId=" + userId + ", content=" + content
				+ ", commentDate=" + commentDate + "]";
	}
	
	
}
