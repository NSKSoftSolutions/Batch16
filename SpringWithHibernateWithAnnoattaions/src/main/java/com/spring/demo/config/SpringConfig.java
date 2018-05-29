package com.spring.demo.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;

import com.spring.demo.bean.Employee;
import com.spring.demo.dao.SpringRepositry;

@Configuration
public class SpringConfig {

	
	
	@Bean
	public DataSource addDataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/batch1");
		ds.setUsername("root");
		ds.setPassword("root");
		
		return ds;
	}
	
	@Bean
	public SessionFactory addSessionFactory(DataSource dataSource)
	{
		LocalSessionFactoryBuilder builder=new LocalSessionFactoryBuilder(dataSource);
		Properties properties=new Properties();
		properties.put("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
		properties.put("hibernate.hbm2ddl.auto","update");
		properties.put("hibernate.show_sql","true");
		builder.addProperties(properties);
		builder.addAnnotatedClasses(Employee.class);
		
		return builder.buildSessionFactory();
		
	}
   
	@Bean
   public HibernateTransactionManager addTransactionmanager(SessionFactory factory)	
   {
	   HibernateTransactionManager manager=new HibernateTransactionManager(factory);
	   return manager;
   }	
	
	@Bean
	public SpringRepositry repo()
	{
		SpringRepositry repo=new SpringRepositry();
		return repo;
	}
	
	
}
