package com.forms;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


import com.entity.TicketEntity;

public class UserDataForm extends ActionForm
{
	private String username;
	private String password;

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
	    ActionErrors errors = new ActionErrors();
	    if (username == null || username.length() <4) {
	        errors.add("username", new ActionMessage("error.username.required"));
	    }
	    if (password == null || password.length() <4 ) {
	        errors.add("password", new ActionMessage("error.password.required"));
	    }
	    return errors;
	}
	
	public UserDataForm() {}
	public UserDataForm(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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

	@Override
	public String toString() {
		return "UserDataForm [username=" + username + ", password=" + password + "]";
	}
	

}
