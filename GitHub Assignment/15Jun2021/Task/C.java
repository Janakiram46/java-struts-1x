package com.Task;

public class C extends Alphabet implements Task 
{
	public C(int sno,String type)
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
		System.out.println("C activity");
	}



}
