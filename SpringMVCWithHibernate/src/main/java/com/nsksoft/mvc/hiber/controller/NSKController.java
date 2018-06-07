package com.nsksoft.mvc.hiber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nsksoft.mvc.hiber.bean.User;
import com.nsksoft.mvc.hiber.repo.UserRepositry;

@Controller
public class NSKController {

	
	@Autowired
	UserRepositry repo;
	
	@RequestMapping(value="register", method=RequestMethod.POST)
	public ModelAndView register(@ModelAttribute User u)
	{
		ModelAndView mv=new ModelAndView();
		
		
		int result=repo.saveUserinfo(u);
		
		if(result>0)
		{
			mv.addObject("u",u);
			mv.setViewName("success");
		}
		else
		{
			mv.setViewName("error");
		}
		
		return mv;
	}
	
		
	
}
