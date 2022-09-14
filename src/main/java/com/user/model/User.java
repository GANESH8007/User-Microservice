package com.user.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class User {
	
	public Integer id;
	public String name;
	public String emailId;
	public String phone;
	public String password;
	public String type;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	List<Books> records =new ArrayList<>();
	
	
	public List<Books> getRecords() {
		return records;
	}
	public void setRecords(List<Books> records) {
		this.records = records;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public User(Integer id, String name, String emailId, String phone, String password, String type) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
		this.password = password;
		this.type = type;
	}
	public User() {
		super();
	}
	
	
}

