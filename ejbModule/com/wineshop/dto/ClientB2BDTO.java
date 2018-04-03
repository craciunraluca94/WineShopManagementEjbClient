package com.wineshop.dto;


public class ClientB2BDTO extends PlatformUserDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5954469924543359339L;

	private boolean visibility;

	private String companyName;

	private String CUI;

	private boolean subscribed;

	private boolean active;

	private int limitQuantity;

	public ClientB2BDTO() {
	}
	public ClientB2BDTO(boolean visibility, String companyName, String cUI, boolean subscribed, boolean active,
			int limitQuantity, String username, String password, String address, String email) {
		super(username, password, address, email);
		this.visibility = visibility;
		this.companyName = companyName;
		CUI = cUI;
		this.subscribed = subscribed;
		this.active = active;
		this.limitQuantity = limitQuantity;		
	}
	public boolean isVisibility() {
		return visibility;
	}

	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCUI() {
		return CUI;
	}

	public void setCUI(String cUI) {
		CUI = cUI;
	}

	public boolean isSubscribed() {
		return subscribed;
	}

	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getLimitQuantity() {
		return limitQuantity;
	}

	public void setLimitQuantity(int limitQuantity) {
		this.limitQuantity = limitQuantity;
	}
	@Override
	public String toString() {
		return "ClientB2BDTO [visibility=" + visibility + ", companyName=" + companyName + ", CUI=" + CUI
				+ ", subscribed=" + subscribed + ", active=" + active + ", limitQuantity=" + limitQuantity + "]";
	}	
}
