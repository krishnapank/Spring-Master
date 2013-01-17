package com.bev.edu.spring.tester;

import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bev.edu.spring.dao.UserDao;
import com.bev.edu.spring.entities.AttendanceInfo;

public class AttendanceMarkIN {
	
	public static void attendMarkIn(String username,String dateFormat, String timeFormat,String subjectId,String authorityId)
	{
		System.out.println("On the mark in attendance module");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");

		AttendanceInfo markIn = new AttendanceInfo();
		markIn.setUser_id(username);
/*		markIn.setDate(new Date(System.currentTimeMillis()));
		markIn.setIn_time(new Timestamp(System.currentTimeMillis()));*/
		
		markIn.setDate(dateFormat);
		markIn.setIn_time(timeFormat);
		
		markIn.setOut_time(timeFormat);
		markIn.setSub_id(subjectId);
		markIn.setStatus("Valid");
		markIn.setAuthority_id(authorityId);
		
		userDao.attendMarkIn(markIn);
		
		
	}

}
