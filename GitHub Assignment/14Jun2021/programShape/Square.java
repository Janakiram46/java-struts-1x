package com.programShape;

public class Square extends Shape
{
	private int side;
	
	Square(int side)
	{
		super("Square",4);
		this.side=side;
	}
	public void display(){
		super.display();
		System.out.println("Side:"+side);
		
	}
	
	public void area(){
		System.out.println("Area:"+side*side);
	}
	
	public void perimeter(){
		System.out.println("Perimeter:"+4*side);
	}
}
