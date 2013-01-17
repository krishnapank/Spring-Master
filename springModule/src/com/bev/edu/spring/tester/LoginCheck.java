package com.bev.edu.spring.tester;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bev.edu.spring.dao.UserDao;
import com.bev.edu.spring.entities.UserDetail;

public class LoginCheck {
	
	public static void main(String args[]) throws IOException
	{
		loginChecks("101","p");
	}

	public static boolean loginChecks(String user_ids,String password) throws IOException
	{
		
	boolean status = false;
	
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/applicationContext.xml");
	UserDao userDao = (UserDao) applicationContext.getBean("userDao");

	System.out.println("User names is: " + userDao.getAllUserNames());
	
	//System.out.println("Chek user exist :::::::::"+userDao.getUserDetails(user_ids));
	String userGet = null;
	String passGet = null;
	UserDetail userDetailsTemp = null;
	try{
		
	userDetailsTemp = userDao.getUserDetails(user_ids);
	if(userDetailsTemp == null)
	{
		status = false;
		return status;
	}
	userGet = userDetailsTemp.getUser_id();
	passGet = userDetailsTemp.getPassword();
	}catch (Exception e) {
		// TODO: handle exception
	}
	if(userGet == null || passGet == null)
	{
		status = false;
		return status;
	}	
	System.out.println("userGet ::::::::::::::"+userGet);
	if(userGet.equals(user_ids) && passGet.equals(password))
	{
		status = true;
		System.out.println("status returned if:::::::"+status);
		return status;
	}
	//return userDao.getUserDetails(user_id).getUser_id();
	System.out.println("status returned outer:::::::"+status);
	return status;
	}
	}
