package com.user.model;

public class Books {
	
	private String userMobile;
	private String userEmail;
	private String bookCategory;
	
	
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	public Books(String userMobile, String userEmail, String bookCategory) {
		super();
		this.userMobile = userMobile;
		this.userEmail = userEmail;
		this.bookCategory = bookCategory;
	}
	public Books() {
		super();
	}

	
	
}
