package com.snycon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.snycon.bean.Brand;
import com.snycon.bean.Category;
import com.snycon.config.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
    	Category con=context.getBean(Category.class);
    	Brand b=con.getBranddetails();
    	      System.out.println("category Name:"+con.getCat_name());
    	      System.out.println("Brandname:"+b.getBrand_name());
    	      System.out.println("High Price:"+b.getHighest_price());
    	      System.out.println("Starting Price:"+b.getStaring_price());
    	      System.out.println("manifacture By:"+b.getManifaturedby());
    }
}
