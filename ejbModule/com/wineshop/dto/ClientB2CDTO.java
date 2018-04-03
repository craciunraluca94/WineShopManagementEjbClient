package com.wineshop.dto;

import java.util.Date;

public class ClientB2CDTO extends PlatformUserDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3411531976401820605L;

	private String firstName;

	private String lastName;

	private Date registerDate;

	private String CNP;

	public ClientB2CDTO() {
	}
	
	public ClientB2CDTO(String firstName, String lastName, Date registerDate, String cNP,String username, String password, String address, String email) {
		super(username, password, address, email);		
		this.firstName = firstName;
		this.lastName = lastName;
		this.registerDate = registerDate;
		CNP = cNP;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public String getCNP() {
		return CNP;
	}

	public void setCNP(String cNP) {
		CNP = cNP;
	}

	@Override
	public String toString() {
		return "ClientB2CDTO [firstName=" + firstName + ", lastName=" + lastName + ", registerDate=" + registerDate
				+ ", CNP=" + CNP + "]";
	}	
}
