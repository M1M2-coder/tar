package com.m2m.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/*
 * Front Controller : Handles all the URL Mapping.
 * */
@Controller
public class PageController {
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		
		return mv;
	}
	
}
