package com.bitwise.spring.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;



public class PrintProducts extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		PageContext pageContext = (PageContext) getJspContext();
		HttpServletResponse res = (HttpServletResponse) pageContext.getResponse();
		PrintWriter out = res.getWriter();
		
		List<ProductsDetails> productList = new ProductList().getProductsDetails();
		out.println("<center>");
		out.println("<table border=1>");
		out.println("<tr>");
		out.println("<td colspan=6 style='text-allign=center'><h3>Products</h3></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Name</td>");
		out.println("<td>Price</td>");
		out.println("<td>Size</td>");
		out.println("<td>Color</td>");
		out.println("</tr>");
		for (ProductsDetails product : productList) {
	
			out.println("<tr>");
			out.println("<td>");
			out.println(product.getName());
			out.println("</td>");
			out.println("<td>");
			out.println("Rs "+ product.getPrice());
			out.println("</td>");
			out.println("<td>");
			out.println(product.getSize());
			out.println("</td>");
			out.println("<td>");
			out.println(product.getColor());
			out.println("</td>");
//			out.println("<td>");
//			out.println("<a href='/add'>Add to Cart</a>");
//			out.println("</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("<center>");
		
	}

}
