package com.FileHandling;

public class Person implements Comparable<Person>
{
    private int i;
    private String name;
    
    public Person(int i,String name)
    {
    	this.i=i;
    	this.name=name;
    	
    }
	@Override
	public String toString()
	{
		return " Person [i=" + i + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Person o) 
	{

        int k=name.compareTo(o.name);
        return -k;
		
	}
   
	
	

}
