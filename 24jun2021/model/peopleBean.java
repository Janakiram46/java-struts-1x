package com.model;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.Data.Person;
import com.Data.PersonDAO;

@ManagedBean(name="pbean")
@RequestScoped
public class peopleBean
{
	private int id;
	private String name;
	private String mobileno;
	private String city;
	
	 
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

	private List<Person> people;

	  public List<Person> getPeople() {
	      this.people = PersonDAO.getPeople();
	  	return people;
	  }

	  public void setPeople(List<Person> people) {
	  	this.people = people;
	  }
	  public String store() {
		   Person person=new Person(id,name,mobileno,city);
		   PersonDAO.insert(person);
		   return "people";
	  }

}
