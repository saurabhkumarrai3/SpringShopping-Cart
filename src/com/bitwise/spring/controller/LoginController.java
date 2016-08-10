package com.bitwise.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.bitwise.spring.validator.LoginValidator;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;



@Controller
public class LoginController {


	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("msg", "Please Enter Your Login Details");
		return "login";
	}

	@RequestMapping( method = RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("login") Login login,  BindingResult result, HttpServletRequest request,HttpServletResponse response) {
			System.out.println("POST");
			LoginValidator validator=new LoginValidator();
			validator.validate(login,result);
			if(result.hasErrors()){
				model.addAttribute("error", "Empty Fields");
				return "login";
			}
			if (login.getName().equals("saurabh") && login.getPassword().equals("123")) {
				//model.addAttribute("msg", "welcome  " + login.getName());
				//return "products";
				HttpSession session=request.getSession(true);
				CartList cartList=new CartList();
				session.setAttribute("listCart", cartList);
				return  "forward:/product";
				
				
			} else {
				model.addAttribute("error", "Invalid Details");
				return "login";
			}
		} 
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public String displayProducts(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		return "products";
	}

		}
