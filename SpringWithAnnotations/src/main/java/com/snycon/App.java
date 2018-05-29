package com.snycon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.snycon.bean.Organization;
import com.snycon.config.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   
    ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
    Organization org=context.getBean(Organization.class);
    System.out.println("Organame:"+org.getOrganame());
    System.out.println("OrgAddress:"+org.getAddress());
    
    }
}
