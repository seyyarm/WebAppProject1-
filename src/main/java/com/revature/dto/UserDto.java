package com.revature.dto;

import java.util.Objects;

public class UserDto {
	
	protected Integer user_id;
	protected String username;
	protected String password;
	protected String email;
	public UserDto(Integer user_id, String username, String password, String email) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public UserDto() {
		super();
	}
	public UserDto(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, password, user_id, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDto other = (UserDto) obj;
		return Objects.equals(email, other.email) && Objects.equals(password, other.password)
				&& Objects.equals(user_id, other.user_id) && Objects.equals(username, other.username);
	}
	@Override
	public String toString() {
		return "UserDto [user_id=" + user_id + ", username=" + username + ", password=" + password + ", email=" + email
				+ "]";
	}
	
	
}
