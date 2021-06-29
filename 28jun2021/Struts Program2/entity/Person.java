package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;

@Entity
@Table(name="sample")
public class Person extends ActionForm
{
@Id
private int id;
@Column
private String name;
@Column
private String mobileno;
@Column
private String city;
Person(){}
public Person(int id, String name, String mobileno, String city) {
	super();
	this.id = id;
	this.name = name;
	this.mobileno = mobileno;
	this.city = city;
}
public int getId() {
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
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", mobileno=" + mobileno + ", city=" + city + "]";
}


}
