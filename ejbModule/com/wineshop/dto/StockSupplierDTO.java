package com.wineshop.dto;

import java.io.Serializable;

public class StockSupplierDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9126860150079012887L;

	private int id;

	private int wineId;

	private int supplierId;

	private double price;

	private double quantity;

	public StockSupplierDTO() {
		super();
	}

	public StockSupplierDTO(int wineId, int supplierId, double price, double quantity) {
		super();
		this.wineId = wineId;
		this.supplierId = supplierId;
		this.price = price;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWineId() {
		return wineId;
	}

	public void setWineId(int wineId) {
		this.wineId = wineId;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
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
		return "StockSupplierDTO [wineId=" + wineId + ", supplierId=" + supplierId + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

}
