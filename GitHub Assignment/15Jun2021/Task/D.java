
package com.Task;

public class D extends Alphabet implements Task 
{
	public D(int sno,String type)
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
		System.out.println("D activity");
	}
	


}
