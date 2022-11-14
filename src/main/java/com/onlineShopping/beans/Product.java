package com.onlineShopping.beans;

import javax.persistence.*;

@Entity
@Table(name="PRODUCTS")
public class Product {

	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator="PRODUCTIDSEQ")
	@SequenceGenerator(name="PRODUCTIDSEQ",sequenceName="productidseq",allocationSize = 1,initialValue = 1)
	@Column(name="PRODUCTID")
	int productId;
	
	@Column(name="PRODUCTNAME",unique = true)
	String productName;
	
	@Column(name="SUPPLIERID")
	int supplierId;
	
	@Column(name="UNIT")
	int unit;
	
	@Column(name="PRICE")
	int price;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, int supplierId, int unit, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.supplierId = supplierId;
		this.unit = unit;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", supplierId=" + supplierId
				+ ", unit=" + unit + ", price=" + price + "]";
	}
	
	
}
