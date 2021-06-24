package com.programShape;

public abstract class Shape
{
	private String name;
	        int noOfSides;
	     
	public Shape(String name, int noOfSides)
	{
				
				this.name = name;
				this.noOfSides = noOfSides;
	}
	public void display()
	{
	    System.out.println("Name:"+name);
	    System.out.println("NoOfSides:"+noOfSides);
	  }
	  abstract public void area(); 
	  abstract public void perimeter();
}
