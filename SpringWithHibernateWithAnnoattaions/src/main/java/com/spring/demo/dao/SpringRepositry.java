package com.spring.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.demo.bean.Employee;

@Component
public class SpringRepositry {

	@Autowired
	SessionFactory factory;
    Session session;
	
	@Transactional
	public void saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
	
		session=factory.openSession();
	    session.save(emp);	
	System.out.println("Object Saved Successfuly");	
	}
	
}
