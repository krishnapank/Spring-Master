package com.bev.edu.spring.entities;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "attendance_info")
public class AttendanceInfo {
	
	@Id
	@Column(name = "user_id", nullable = false)
	private String user_id;
	
	
	@Column(name = "date", nullable = false)
	private String date;
	
	@Column(name = "in_time", nullable = true)
	private String in_time;
	
	@Column(name = "out_time", nullable = true)
	private String out_time;
	
	
	@Column(name = "sub_id", nullable = true)
	private String sub_id;
	
	
	@Column(name = "status", nullable = true)
	private String status;
	
	
	@Column(name = "authority_id", nullable = true)
	private String authority_id;


	public String getUser_id() {
		return user_id;
	}


	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


	
	
/*	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Timestamp getIn_time() {
		return in_time;
	}


	public void setIn_time(Timestamp in_time) {
		this.in_time = in_time;
	}*/


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getIn_time() {
		return in_time;
	}


	public void setIn_time(String in_time) {
		this.in_time = in_time;
	}


	/*public Timestamp getOut_time() {
		return out_time;
	}


	public void setOut_time(Timestamp out_time) {
		this.out_time = out_time;
	}*/

	
	
	public String getSub_id() {
		return sub_id;
	}


	public String getOut_time() {
		return out_time;
	}


	public void setOut_time(String out_time) {
		this.out_time = out_time;
	}


	public void setSub_id(String sub_id) {
		this.sub_id = sub_id;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getAuthority_id() {
		return authority_id;
	}


	public void setAuthority_id(String authority_id) {
		this.authority_id = authority_id;
	}
	
	

}
