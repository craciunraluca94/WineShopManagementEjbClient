package com.wineshop.dto;

import java.io.Serializable;

public class PlatformUserDTO implements Serializable {

	private static final long serialVersionUID = -6279031577179628264L;

	private int id;

	private String username;

	private String password;

	private String address;

	private String email;

	private String dtype;

	public String getDtype() {
		return dtype;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

	public PlatformUserDTO() {
	}

	public PlatformUserDTO(String username, String password, String address, String email) {
		super();
		this.username = username;
		this.password = password;
		this.address = address;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "PlatformUserDTO [id=" + id + ", username=" + username + ", password=" + password + ", address="
				+ address + ", email=" + email + " ]";
	}
}
