package com.snycon.SpringExample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.snycon.bean.Product;

public class ExmapleUsingConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ApplicationContext context=new ClassPathXmlApplicationContext("spring_config.xml");
	Object obj=context.getBean("pro");
	Product p=(Product)obj;
	System.out.println(p);
		
	}

}
