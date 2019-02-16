package com.capgemini.salesmanagement.bean;

import java.time.LocalDate;

public class Sale {
	private int saleId;
	private int prodCode;
	private String productName;
	private String category;
	private LocalDate saleDate;
	private int quantity;
	private float lineTotal;
	
	public Sale(int saleId, int prodCode, String productName, String category, LocalDate saleDate, int quantity,
			float lineTotal) {
		super();
		this.saleId = saleId;
		this.prodCode = prodCode;
		this.productName = productName;
		this.category = category;
		this.saleDate = saleDate;
		this.quantity = quantity;
		this.lineTotal = lineTotal;
	}
	
	public Sale() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSaleId() {
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
	public int getProdCode() {
		return prodCode;
	}
	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public LocalDate getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getLineTotal() {
		return lineTotal;
	}
	public void setLineTotal(float lineTotal) {
		this.lineTotal = lineTotal;
	}
	
	

}
