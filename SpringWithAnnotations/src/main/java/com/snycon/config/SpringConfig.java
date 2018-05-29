package com.snycon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.snycon.bean.Organization;

@Configuration
public class SpringConfig {

	@Bean
	public Organization addOrganization()
	{
		Organization org=new Organization();
		org.setOrganame("Snycon");
		org.setAddress("WTF");
		
		return org;
	}
	
	
	
}
