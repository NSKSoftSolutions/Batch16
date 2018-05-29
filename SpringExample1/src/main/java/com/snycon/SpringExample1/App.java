package com.snycon.SpringExample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.snycon.bean.Organization;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
		Object obj = context.getBean("org");
		Organization org = (Organization) obj;
		System.out.println("Organization Name:" + org.getOrgname());
        System.out.println("Department Details:"+org.getDepartmentdetails());
	}
}
