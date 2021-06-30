package com.Assignment1;


public class Student 
{
	private int rollNo;
	private String name;
	private int standard;
	private int age;
	private String gender;
	public Student() {}


	public Student(int rollNo, String name, int standard, int age, String gender) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.standard = standard;
		this.age = age;
		this.gender = gender;
	}


	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStandard() {
		return standard;
	}


	public void setStandard(int standard) {
		this.standard = standard;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString()
	{
		return "Student [rollNo=" + rollNo + ", name=" + name + ", standard=" + standard + ", age=" + age + ", gender="
				+ gender + "]";
	}



}
