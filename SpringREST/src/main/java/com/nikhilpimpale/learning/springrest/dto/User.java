package com.nikhilpimpale.learning.springrest.dto;

public class User {
	private long userId;
	private String userName;
	private String email;

	public User() {

	}

	public User(long newUserId, String newUserName) {
		this.userId = newUserId;
		this.userName = newUserName;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
