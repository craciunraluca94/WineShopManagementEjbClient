package com.wineshop.dto;

import java.io.Serializable;

public class OrderItemDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8766624314461132169L;

	private int id;

	private int stockClientB2BId;

	private int clientOrderId;

	private double quantity;

	private double price;

	public OrderItemDTO() {
		super();
	}	

	public OrderItemDTO(int stockClientB2BId, int clientOrderId, double quantity, double price) {
		super();
		this.stockClientB2BId = stockClientB2BId;
		this.clientOrderId = clientOrderId;
		this.quantity = quantity;
		this.price = price;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	

	public int getStockClientB2BId() {
		return stockClientB2BId;
	}

	public void setStockClientB2BId(int stockClientB2BId) {
		this.stockClientB2BId = stockClientB2BId;
	}

	public int getClientOrderId() {
		return clientOrderId;
	}

	public void setClientOrderId(int clientOrderId) {
		this.clientOrderId = clientOrderId;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "OrderItemDTO [stockClientB2BId=" + stockClientB2BId + ", clientOrderId=" + clientOrderId + ", quantity="
				+ quantity + ", price=" + price + "]";
	}	
}
