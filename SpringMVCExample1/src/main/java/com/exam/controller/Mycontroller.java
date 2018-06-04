package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.exam.pojo.User;

@Controller
public class Mycontroller {

	
	@RequestMapping("/register")
	public ModelAndView userRegister(@ModelAttribute User user)
	{
		
		ModelAndView mv=new ModelAndView();
	
		mv.addObject("user", user);
		mv.setViewName("success");
		
		return mv;
	}
	
}
