package com.app.allyworld.AllyWebSite.enitity;

public class LoginCredentials {
	
	private String email;
	private String password;

	public LoginCredentials() {
		super();

	}

	public LoginCredentials(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	
	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
