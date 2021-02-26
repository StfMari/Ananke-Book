package it.beije.anankebook.model.beans;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="post")
public class Post {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	Integer id;
	
	@Column(name="user_id")
	Integer userId;
	
	@Column(name="title")
	String title;
	
	@Column(name="content")
	String content;
	
	@Column(name="date")
	LocalDate date;

	
	public Integer getId() {
		return id;
	}

	
	public void setId(Integer id) {
		this.id = id;
	}

	
	public Integer getUserId() {
		return userId;
	}

	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	
	public String getTitle() {
		return title;
	}

	
	public void setTitle(String title) {
		this.title = title;
	}

	
	public String getContent() {
		return content;
	}

	
	public void setContent(String content) {
		this.content = content;
	}

	
	public LocalDate getDate() {
		return date;
	}

	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
