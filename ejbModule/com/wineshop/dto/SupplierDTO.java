package com.wineshop.dto;

public class SupplierDTO extends PlatformUserDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2339256767054487473L;

	private boolean visibility;

	private String wineShopName;

	private int age;

	public SupplierDTO() {
	}

	public SupplierDTO(boolean visibility, String wineShopName, int age,String username, String password, String address, String email) {
		super(username, password, address, email);			
		this.visibility = visibility;
		this.wineShopName = wineShopName;
		this.age = age;
	}

	public boolean isVisibility() {
		return visibility;
	}

	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}

	public String getWineShopName() {
		return wineShopName;
	}

	public void setWineShopName(String wineShopName) {
		this.wineShopName = wineShopName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SupplierDTO [visibility=" + visibility + ", wineShopName=" + wineShopName + ", age=" + age + "]";
	}
}
