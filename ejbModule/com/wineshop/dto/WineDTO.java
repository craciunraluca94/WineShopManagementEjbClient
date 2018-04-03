package com.wineshop.dto;

import java.io.Serializable;

public class WineDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3378951911146318277L;

	private int id;

	private int year;

	private String name;

	private String description;

	private String variety;

	private WineType type;
	

	public WineDTO() {
		super();
	}	

	public WineDTO(int year, String name, String description, String variety, WineType type) {
		super();
		this.year = year;
		this.name = name;
		this.description = description;
		this.variety = variety;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public WineType getType() {
		return type;
	}

	public void setType(WineType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "WineDTO [year=" + year + ", name=" + name + ", description=" + description + ", variety=" + variety
				+ ", type=" + type + "]";
	}	
}
