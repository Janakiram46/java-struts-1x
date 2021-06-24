package com.Task;

public class A extends Alphabet implements Task 
{
	public A(int sno,String type)
	{
		super(sno,type);
	}
	public void m()
	{
		System.out.println("Sno :"+ sno);
	}
	public void n()
	{
		System.out.println("Type: "+type);
	}
	public void activity()
	{
		System.out.println("A activity");
	
	}

}
