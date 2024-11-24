package com.pxc.todo_rest_jwt.model;

public class AccountDto {
	private String fullName;
	private String token;
	
	public AccountDto() {
	}

	public AccountDto(String fullName, String token) {
		this.fullName = fullName;
		this.token = token;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "AccountDto [fullName=" + fullName + ", token=" + token + "]";
	}
	
	

}
