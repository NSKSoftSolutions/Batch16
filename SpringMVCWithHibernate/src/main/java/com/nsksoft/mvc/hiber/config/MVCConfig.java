package com.nsksoft.mvc.hiber.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.nsksoft.mvc.hiber.bean.User;
import com.nsksoft.mvc.hiber.repo.UserRepositry;

@Configuration
@ComponentScan("com.nsksoft.mvc.hiber.controller")
@EnableWebMvc
@EnableTransactionManagement
public class MVCConfig extends WebMvcConfigurerAdapter {

	@Bean
	public DataSource addDataSource()
	{
		
		DriverManagerDataSource dmds=new DriverManagerDataSource();	
		dmds.setDriverClassName("com.mysql.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/batch16");
		dmds.setUsername("root");
		dmds.setPassword("root");
		return dmds;
	}
	@Bean
	public SessionFactory getSessionFactoy(DataSource dataSource)
	{
		LocalSessionFactoryBuilder builder=new LocalSessionFactoryBuilder(dataSource);
		
		Properties p=new Properties();
		p.put("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
		p.put("hibernate.show_sql", "true");
		p.put("hibernate.hbm2ddl.auto","update");
		
		builder.addProperties(p);
		builder.addAnnotatedClass(User.class);
		
		return builder.buildSessionFactory();
		
	}
	
	@Bean
	public HibernateTransactionManager addTransaction(SessionFactory factory)
	{
		
		HibernateTransactionManager manager=new HibernateTransactionManager(factory);
		
		return manager;
	}
	
	@Bean
	public InternalResourceViewResolver viewsolever()
	{
		InternalResourceViewResolver irv=new InternalResourceViewResolver();
		    irv.setPrefix("/WEB-INF/jsp/");
		    irv.setSuffix(".jsp");
		
		
		return irv;
	}
	@Bean
	public UserRepositry addrepo()
	{
		UserRepositry u=new UserRepositry();
		return u;
		
	}
	
	
}
