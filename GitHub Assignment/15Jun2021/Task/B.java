package com.Task;

public class B extends Alphabet implements Task 
{
	public B(int sno,String type)
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
		System.out.println("B activity");
	}


}
