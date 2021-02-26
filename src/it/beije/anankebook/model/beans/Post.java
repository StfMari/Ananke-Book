package it.beije.anankebook.model.beans;


import java.time.LocalDate;

public class Post {
Integer postId;
Integer userId;
String postTitle;
String postContent;
LocalDate postDate;

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
public String getPostTitle() {
	return postTitle;
}
public void setPostTitle(String postTitle) {
	this.postTitle = postTitle;
}
public String getPostContent() {
	return postContent;
}
public void setPostContent(String postContent) {
	this.postContent = postContent;
}
public LocalDate getPostDate() {
	return postDate;
}
public void setPostDate(LocalDate postDate) {
	this.postDate = postDate;
}

}
