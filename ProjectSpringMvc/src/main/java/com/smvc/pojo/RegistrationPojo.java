package com.smvc.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table
public class RegistrationPojo
{
 
	@Id
 private int id;
	@Column
 private String username;
	@Column
 private String password;
	@Column
 private String email;
	@Column
 private String firstname;
	@Column
 private String lastname;
	@Column
 private String phoneumber;
 

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getPhoneumber() {
	return phoneumber;
}
public void setPhoneumber(String phoneumber) {
	this.phoneumber = phoneumber;
}
public RegistrationPojo() {
	super();
}
@Override
public String toString() {
	return "RegistrationPojo [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
			+ ", firstname=" + firstname + ", lastname=" + lastname + ", phoneumber=" + phoneumber + "]";
}

 
 
}
