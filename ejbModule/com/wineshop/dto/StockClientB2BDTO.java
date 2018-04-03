package com.wineshop.dto;

import java.io.Serializable;

public class StockClientB2BDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4210863239411791664L;

	private int id;
	
	private int clientB2BId;

	private double price;

	private double quantity;

	public StockClientB2BDTO() {
		super();
	}
	
	public StockClientB2BDTO(int clientB2BId, double price, double quantity) {
		super();
		this.clientB2BId = clientB2BId;
		this.price = price;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getClientB2BId() {
		return clientB2BId;
	}

	public void setClientB2BId(int clientB2BId) {
		this.clientB2BId = clientB2BId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "StockClientB2BDTO [clientB2BId=" + clientB2BId + ", price=" + price + ", quantity=" + quantity + "]";
	}
}
