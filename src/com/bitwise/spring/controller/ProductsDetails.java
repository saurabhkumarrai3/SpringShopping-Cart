package com.bitwise.spring.controller;

public class ProductsDetails {
	
	@Override
	public String toString() {
		return "ProductsDetails [name=" + name + ", price=" + price + ", size=" + size + ", color=" + color + "]";
	}

	private String name;
	private String price;
	private String size;
	private String color;
	
	public ProductsDetails() {
	}

	public ProductsDetails(String name, String price, String size, String color) {
		this.name = name;
		this.price = price;
		this.size = size;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
