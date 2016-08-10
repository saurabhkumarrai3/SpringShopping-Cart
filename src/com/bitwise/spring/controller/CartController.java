package com.bitwise.spring.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartController {

	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public ModelAndView get() {

		return new ModelAndView("cart");

	}
	
	@RequestMapping(params = "addCart", method = RequestMethod.POST)
	public String cancelUpdateUser(HttpServletRequest request) {
	    return "redirect:/product";
	}
	
	@RequestMapping(params = "delete", method = RequestMethod.POST)
	public String cancelUpdate(HttpServletRequest request) {
	    return "redirect:/login";
	}
}