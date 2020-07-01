package com.gg.controller;

import java.util.HashMap;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gg.model.Customer;
import com.gg.service.CustomerService;

@RestController
public class LoginController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value= {"/","/login"}, method=RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		return modelAndView;
	}
	
	
	@RequestMapping(value="/registration", method=RequestMethod.GET)
	public ModelAndView registration() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("registration");
		return modelAndView;
	}
	
	
	@RequestMapping(value="/registration", method=RequestMethod.POST)
	public modelAndView register(@Valid Customer customer, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		if(bindingResult.hasErrors()) {
			modelAndView.setViewName("registration");
		}else {
			customerService.sa
		}
	}
}
