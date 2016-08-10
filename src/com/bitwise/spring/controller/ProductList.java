package com.bitwise.spring.controller;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
	private  List<ProductsDetails> productsDetails = new ArrayList<ProductsDetails>();

	
	ProductList(){
		productsDetails.add(new ProductsDetails("volvo", "200000", "sedan", "Black"));
		productsDetails.add(new ProductsDetails("saab", "30000", "suv", "Blue"));
		productsDetails.add(new ProductsDetails("mercedes", "440000", "sedan", "White"));
		productsDetails.add(new ProductsDetails("audi", "510000", "suv", "Grey"));
	}


	@Override
	public String toString() {
		return "ProductList [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	public List<ProductsDetails> getProductsDetails() {
		return productsDetails;
	}


	


	
}
