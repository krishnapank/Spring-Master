package com.bev.edu.spring.dao;

import java.util.List;

import com.bev.edu.spring.entities.AttendanceInfo;
import com.bev.edu.spring.entities.UserDetail;


public interface UserDao {
/*	public void saveUser(User user);
	public List<User> getAllUser(User user);
	public User selectUserById(String userId);
	public void deleteUser(User user);*/
	
	
	/**
	* This method is used to create the user
	*/
	void createUser(UserDetail userDetail);
	
	/**
	 This methid mark in the attendance
	 */

	void attendMarkIn(AttendanceInfo markIn );
	
	/**
	* This method is used to get all the user names from the table UserDetail
	* @return list of user names
	*/
	List<String> getAllUserNames();

	/**
	* This method is used to delete an user
	* @param userDetail
	*/
	void deleteUser(UserDetail userDetail);
	
	UserDetail getUserDetails(String userID);
	
	}