package com.nsksoft.mvc.hiber.repo;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nsksoft.mvc.hiber.bean.User;

@Component
public class UserRepositry {

	@Autowired
	SessionFactory factory;
	
	int result;
	

     @Transactional
	 public int saveUserinfo(User u) {
		// TODO Auto-generated method stub
	
		Session session=factory.openSession();
		result=(Integer)session.save(u);
		return result;
	}

}
