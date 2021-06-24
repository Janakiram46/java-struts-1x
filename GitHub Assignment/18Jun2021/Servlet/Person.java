package com.firstServelt;

public class Person
{
private int id;
private String name;
private String mobileno;
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
public void setId(int id) {
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
