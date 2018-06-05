package com.snycon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.snycon.controller")
@EnableWebMvc
public class MVCConfig extends WebMvcConfigurerAdapter {

	@Bean
	public InternalResourceViewResolver addingViewResolver()
	{
		InternalResourceViewResolver irv=new InternalResourceViewResolver();
		irv.setPrefix("/WEB-INF/jsp/");
		irv.setSuffix(".jsp");
		
		return irv;
	}
	
	
	
	
	
}
