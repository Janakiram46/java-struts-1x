package com.programShape;

public class Rectangle extends Shape
{
	private int length;
	private int breadth;
	
	
	Rectangle(int length,int breadth){
		super("Rectangle",4);
		this.length=length;
		this.breadth=breadth;
	}
	
	public void display(){
		super.display();
		System.out.println("length:"+length);
		System.out.println("Breadth:"+breadth);
	}
	
	public void area(){
		System.out.println("Area:"+length*breadth);
	}
	
	public void perimeter(){
		System.out.println("Perimeter:"+2*(length+breadth));
	}
}
