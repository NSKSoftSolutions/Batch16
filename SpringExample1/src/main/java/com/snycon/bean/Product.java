package com.snycon.bean;

public class Product {

	private String product_name;
	
	@Override
	public String toString() {
		return "Product [product_name=" + product_name + ", price=" + price + "]";
	}
	private double price;
	public Product(String product_name, double price) {
		super();
		this.product_name = product_name;
		this.price = price;
	}
	
}
