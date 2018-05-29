package com.snycon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.snycon.bean.Brand;
import com.snycon.bean.Category;

@Configuration
public class SpringConfig {

	@Bean(name="iphone")
	@Primary
	public Brand addBrand()
	{
		Brand b=new Brand();
		b.setBrand_name("Iphone");
		b.setHighest_price(189000);
		b.setStaring_price(15000);
		b.setManifaturedby("China");
		
		return b;
		
	}

	@Bean(name="micromax")
	@Primary
	public Brand addBrand1()
	{
		Brand b=new Brand();
		b.setBrand_name("Micromax");
		b.setHighest_price(2000000);
		b.setStaring_price(20000);
		b.setManifaturedby("INDIA");
		
		return b;
	}
	
	
	@Bean
	public Category addcategory()
	{
		Category cat=new Category();
		cat.setCat_name("Mobiles");

		return cat;
		
	}
	
	
}
