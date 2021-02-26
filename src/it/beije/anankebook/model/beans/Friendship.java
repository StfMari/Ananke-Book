package it.beije.anankebook.model.beans;


public class Friendship {
	  Integer idFriendship;
	   String stateFrienship;
	   Integer idUserReceiver;
	   Integer idUserSender;
	public Integer getIdFriendship() {
		return idFriendship;
	}
	public void setIdFriendship(Integer idFriendship) {
		this.idFriendship = idFriendship;
	}
	public String getStateFrienship() {
		return stateFrienship;
	}
	public void setStateFrienship(String stateFrienship) {
		this.stateFrienship = stateFrienship;
	}
	public Integer getIdUserReceiver() {
		return idUserReceiver;
	}
	public void setIdUserReceiver(Integer idUserReceiver) {
		this.idUserReceiver = idUserReceiver;
	}
	public Integer getIdUserSender() {
		return idUserSender;
	}
	public void setIdUserSender(Integer idUserSender) {
		this.idUserSender = idUserSender;
	}
}
