package com.wineshop.dto;

import java.io.Serializable;
import java.util.Date;

public class ClientOrderDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8011765408502105417L;

	private int id;

	private Date date;

	private int orderNumber;

	private int clientB2CiId;

	public ClientOrderDTO() {
	}
	
	public ClientOrderDTO(Date date, int orderNumber, int clientB2CiId) {
		super();
		this.date = date;
		this.orderNumber = orderNumber;
		this.clientB2CiId = clientB2CiId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getClientB2CiId() {
		return clientB2CiId;
	}

	public void setClientB2CiId(int clientB2CiId) {
		this.clientB2CiId = clientB2CiId;
	}

	@Override
	public String toString() {
		return "ClientOrderDTO [date=" + date + ", orderNumber=" + orderNumber + ", clientB2CiId=" + clientB2CiId + "]";
	}	
}
