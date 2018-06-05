package com.snycon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.snycon.pojo.User;

@Controller
public class MyController {

	@RequestMapping("/register")
	public ModelAndView registerperson(@ModelAttribute User user)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("user",user);
		mv.setViewName("success");
		
		return mv;
		
	}
	
	
	
}
