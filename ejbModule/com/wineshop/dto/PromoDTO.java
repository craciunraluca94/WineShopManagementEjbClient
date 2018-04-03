package com.wineshop.dto;

import java.io.Serializable;
import java.util.Date;

public class PromoDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8027712746262196193L;

	private int id;

	private int stockSupplierId;

	private Date startDate;
	
	private Date endDate;

	private String discount;

	public PromoDTO() {
	}
	
	public PromoDTO(int stockSupplierId, Date startDate, Date endDate, String discount) {
		super();
		this.stockSupplierId = stockSupplierId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.discount = discount;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStockSupplierId() {
		return stockSupplierId;
	}

	public void setStockSupplierId(int stockSupplierId) {
		this.stockSupplierId = stockSupplierId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "PromoDTO [stockSupplierId=" + stockSupplierId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", discount=" + discount + "]";
	}
}
