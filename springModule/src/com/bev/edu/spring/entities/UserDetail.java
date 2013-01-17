package com.bev.edu.spring.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user_basic_info")
public class UserDetail {
	
	@Id
	@Column(name = "user_id", nullable = false)
	private String user_id;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Column(name = "date_of_birth", nullable = false)
	private Date date_of_birth;
	
	@Column(name = "photo", nullable = true)
	private byte[] photo;
	
	@Column(name = "religion", nullable = true)
	private String religion;
	
	@Column(name = "sex", nullable = false)
	private String sex;
	
	@Column(name = "f_name", nullable = false)
	private String f_name;
	
	@Column(name = "m_name", nullable = true)
	private String m_name;
	
	@Column(name = "l_name", nullable = false)
	private String l_name;
	
	@Column(name = "martial_status", nullable = false)
	private String martial_status;
	

	@Column(name = "blood_group", nullable = true)
	private String  blood_group;
	
	@Column(name = "id_proof", nullable = false)
	private String id_proof;
	
	@Column(name = "nationality", nullable = false)
	private String nationality;
	
	@Column(name = "email_id", nullable = true)
	private String email_id;
	
	@Override
	public int hashCode()
	{
	int hash = 0;
	hash += (this.user_id != null ? this.user_id.hashCode() : 0);
	return hash;
	}

	@Override
	public boolean equals(Object object)
	{
	// TODO: Warning - this method won't work in the case the id fields are not set
	if (!(object instanceof UserDetail))
	{
	return false;
	}
	UserDetail other = (UserDetail) object;
	if (this.user_id != other.user_id & (this.user_id == null || !this.user_id.equals(other.user_id)))
	{
	return false;
	}
	return true;
	}

	/**
	* Returns a string representation of the object.  This implementation constructs
	* that representation based on the id fields.
	* @return a string representation of the object.
	*/
	@Override
	public String toString()
	{
	return "com.bev.edu.spring.entities["
	+ "userId=" + user_id + "]";
	}
	
	
	

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getMartial_status() {
		return martial_status;
	}

	public void setMartial_status(String martial_status) {
		this.martial_status = martial_status;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getId_proof() {
		return id_proof;
	}

	public void setId_proof(String id_proof) {
		this.id_proof = id_proof;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}


}


