package com.entity;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String username;
	private String password;
	private String name;
	private String phone;
	private String email;
	private String isVip;

	// Constructors

	/** default constructor */
	public User() {
	}

	public User(String username, String password, String name, String phone,
			String email) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	/** full constructor */
	public User(String username, String password, String name, String phone,
			String email, String isVip) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.isVip = isVip;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIsVip() {
		return this.isVip;
	}

	public void setIsVip(String isVip) {
		this.isVip = isVip;
	}

}