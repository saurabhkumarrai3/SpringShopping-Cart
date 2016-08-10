package com.bitwise.spring.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class PrintCart extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		PageContext pageContext = (PageContext) getJspContext();
		HttpServletResponse res = (HttpServletResponse) pageContext.getResponse();
		HttpServletRequest request=(HttpServletRequest) pageContext.getRequest();
		PrintWriter out = res.getWriter();
		CartList list =  (CartList)request.getSession(false).getAttribute("listCart");
		//List<Cart> cart = new CartList().getCart();
		//CartList cartList=new CartList();
		List<Cart> cart;
		cart=list.getCart();
		out.println("<center>");
		out.println("<table border=1>");
		out.println("<tr>");
		out.println("<td colspan=6 style='text-allign=center'><h3>Cart Items</h3></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Name</td>");
		out.println("<td>Quantity</td>");
		out.println("</tr>");
		for (Cart cartItems : cart) {
	
			out.println("<tr>");
			out.println("<td>");
			out.println(cartItems.getPname());
			out.println("</td>");
			out.println("<td>");
			out.println(cartItems.getPquant());
			out.println("</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("<center>");
		
	}

}
