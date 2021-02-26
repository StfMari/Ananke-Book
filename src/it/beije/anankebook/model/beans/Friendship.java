package it.beije.anankebook.model.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="friendship")
public class Friendship {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	Integer id;
	
	@Column(name="status")
	String status;
	
	@Column(name="user1_id")
	Integer userSenderId;
	
	@Column(name="user2_id")
	Integer userReceiverId;
	
	
	public Integer getId() {
		return id;
	}
	
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public String getStatus() {
		return status;
	}
	
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public Integer getUserSenderId() {
		return userSenderId;
	}
	
	
	public void setUserSenderId(Integer userSenderId) {
		this.userSenderId = userSenderId;
	}
	
	
	public Integer getUserReceiverId() {
		return userReceiverId;
	}
	
	
	public void setUserReceiverId(Integer userReceiverId) {
		this.userReceiverId = userReceiverId;
	}


	@Override
	public String toString() {
		return "Friendship [id=" + id + ", status=" + status + ", userSenderId=" + userSenderId + ", userReceiverId="
				+ userReceiverId + "]";
	}
	
}
