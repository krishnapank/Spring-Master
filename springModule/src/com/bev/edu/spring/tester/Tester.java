package com.bev.edu.spring.tester;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bev.edu.spring.dao.UserDao;
import com.bev.edu.spring.entities.AttendanceInfo;
import com.bev.edu.spring.entities.UserDetail;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;


public class Tester {

	public static void main(String[] args) throws IOException
	{
		String username = "101EC201212";
		System.out.println("user name is ::::::::::"+username);
		System.out.println("user sub id::"+username.substring(3, 5));
		System.out.println("user_authority  id ::::"+username.substring(0, 3));
		
	/*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/applicationContext.xml");
	UserDao userDao = (UserDao) applicationContext.getBean("userDao");
*/
/*	AttendanceInfo markIn = new AttendanceInfo();
	markIn.setUser_id("101");
	markIn.setDate(new Date(System.currentTimeMillis()));
	markIn.setIn_time(new Timestamp(System.currentTimeMillis()));
	markIn.setOut_time(new Timestamp(System.currentTimeMillis()));
	markIn.setSub_id("10100");
	markIn.setStatus("Valid");
	markIn.setAuthority_id("101");
	
	userDao.attendMarkIn(markIn);*/
	
	
/*	
	UserDetail user = new UserDetail();

	user.setBlood_group("A+");
	user.setDate_of_birth(new Date(System.currentTimeMillis()));
	user.setEmail_id("hi");
	user.setF_name("f");
	user.setId_proof("VOTERIDS");
	user.setL_name("l");
	user.setM_name("m");
	user.setMartial_status("m");
	user.setNationality("i");
	user.setPassword("101EC201212");
	
	File f = new File("/home/krishna/Desktop/Screenshot.png");
	FileInputStream fis;
	
		fis = new FileInputStream(f);
	
    byte[] tmp = new byte[1024];
    byte[] data = null;
    int sz, len = 0;

    while ((sz = fis.read(tmp)) != -1) {
      if (data == null) {
        len = sz;
        data = tmp;
      } else {
        byte[] narr;
        int nlen;

        nlen = len + sz;
        narr = new byte[nlen];
        System.arraycopy(data, 0, narr, 0, len);
        System.arraycopy(tmp, 0, narr, len, sz);
        data = narr;
        len = nlen;
      }
    }
    if (len != data.length) {
      byte[] narr = new byte[len];

      System.arraycopy(data, 0, narr, 0, len);
      data = narr;
    }
	System.out.println("date size is :::::::"+data.length);
	
	user.setPhoto(data);
	user.setReligion("h");
	user.setSex("m");
    user.setUser_id("101EC201212");

	
	userDao.createUser(user);*/
	//System.out.println("User is successfully created");
	//System.out.println("User names is: " + userDao.getAllUserNames());
	
	//UserDetail userCheck = new UserDetail();
	//userCheck.setUser_id("101");
	//System.out.println("Chek user exist :::::::::"+userDao.getUserDetails("101").getUser_id());
	}
	}