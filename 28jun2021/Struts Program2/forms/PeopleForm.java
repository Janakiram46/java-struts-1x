package com.forms;

import org.apache.struts.action.ActionForm;

public class PeopleForm extends ActionForm
{
private Integer id;
private String name;
private String mobileno;
private String city;


public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}
