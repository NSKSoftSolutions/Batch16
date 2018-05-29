package com.snycon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.snycon.bean.Brand;
import com.snycon.bean.Category;


public class App 
{
    public static void main( String[] args )
    {
    
  ApplicationContext context=new ClassPathXmlApplicationContext("spring_config.xml");
  Object obj=context.getBean("cat");
  Category ca=(Category)obj;
  System.out.println(ca.getCat_name());
 Brand b=ca.getBranddetails();
    System.out.println(b.getBrand_name());
    
    
    }
}
