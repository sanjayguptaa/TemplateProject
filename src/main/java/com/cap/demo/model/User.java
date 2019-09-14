package com.cap.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private Long userid;
	private String username;
	private String useremail;
	private String usernumb;
	private String role;

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUsercontnumb() {
		return usernumb;
	}

	public void setUsercontnumb(String usercontnumb) {
		this.usernumb = usercontnumb;
	}

	public String getUsernumb() {
		return usernumb;
	}

	public void setUsernumb(String usernumb) {
		this.usernumb = usernumb;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	
}
