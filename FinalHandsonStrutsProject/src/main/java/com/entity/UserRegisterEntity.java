package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="userregister")
public class UserRegisterEntity
{
	@Id
	private String username;
	@Column
	private String password;	
	@Column
	private String mobilenumber;
	@Column
	private String address;
	@Column
	private String email;
	
	public UserRegisterEntity() {}
	
	public UserRegisterEntity(String username, String password, String mobilenumber, String address, String email
		) {
		super();
		this.username = username;
		this.password = password;
		this.mobilenumber = mobilenumber;
		this.address = address;
		this.email = email;
		
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
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "UserRegisterEntity [username=" + username + ", password=" + password + ", mobilenumber=" + mobilenumber
				+ ", address=" + address + ", email=" + email + "]";
	}

	
	
}
