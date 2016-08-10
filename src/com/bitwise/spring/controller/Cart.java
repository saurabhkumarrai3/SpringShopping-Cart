package com.bitwise.spring.controller;

public class Cart {
	private String pname;
	private int pquant;
	public Cart(){
		
	}
	public Cart(String pname2, Integer pquant2) {
		this.pname=pname2;
		this.pquant=pquant2;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPquant() {
		return pquant;
	}
	public void setPquant(int pquant) {
		this.pquant = pquant;
	}
	@Override
	public String toString() {
		return "Cart [pname=" + pname + ", pquant=" + pquant + "]";
	}

}
