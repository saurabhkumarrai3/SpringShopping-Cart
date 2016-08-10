package com.bitwise.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@RequestMapping(value = "/product", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView get() {

		return new ModelAndView("products");
	}

	@RequestMapping(value = "/nextPage", method = RequestMethod.POST)
	public String FicheService(@ModelAttribute("products") Cart cart, BindingResult result,
			@RequestParam("pname") String pname, @RequestParam("pquant") Integer pquant, ModelMap model,HttpServletRequest request,HttpServletResponse response) {
		
		CartList list =  (CartList)request.getSession(false).getAttribute("listCart");
		model.addAttribute("pname", pname);
		model.addAttribute("pquant", pquant);
		list.addCartList(pname,pquant);
		return "redirect:/cart";
	}

}
