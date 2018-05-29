package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.demo.bean.Employee;
import com.spring.demo.config.SpringConfig;
import com.spring.demo.dao.SpringRepositry;

public class App 
{
    public static void main( String[] args )
    {
     
ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);    	
SpringRepositry repo=context.getBean(SpringRepositry.class);    	
    	Employee emp=new Employee();
    	emp.setEname("AMajad");
        emp.setE_no("am535");
        emp.setMobile("958234567");
        emp.setPer_add("TPL");
        emp.setPre_add("OOTY");
        emp.setSalary(30000);
        emp.setDesg("Man");
    	
        repo.saveEmployee(emp);
        
        
    	
    }
}
