package com.bitwise.spring.controller;

import java.util.ArrayList;
import java.util.List;

public class CartList {
	private  List<Cart> cart = new ArrayList<Cart>();

	CartList(){
		
	}
	public void addCartList(String pname,int pquant){
		cart.add(new Cart(pname,pquant));
	}
	
	@Override
	public String toString() {
		return "CartList [cart=" + cart + "]";
	}

	public List<Cart> getCart() {
		return cart;
	}

	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}
	public void displayCart(){
		for(Cart cartItem: cart){
			System.out.println(cartItem.getPname());
			System.out.println(cartItem.getPquant());
		}
	}

}
