package com.snycon.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Category {

	private String cat_name;
	@Autowired
	@Qualifier("iphone")
	private Brand branddetails;
	

	public String getCat_name() {
		return cat_name;
	}
	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}
	public Brand getBranddetails() {
		return branddetails;
	}
	public void setBranddetails(Brand branddetails) {
		this.branddetails = branddetails;
	}
	
}
