package com.programShape;

public class Traingle extends Shape
{
	private int base;
	private int height;
	private int side;
	
	
	Traingle(int base,int height,int side)
	{
		super("Traingle",3);
		this.base=base;
		this.height=height;
		this.side=side;
	}
	public void display(){
		super.display();
		System.out.println("base:"+base);
		System.out.println("height:"+height);
		
	}
	
	public void area(){
		System.out.println("area:"+base*height*0.5);
	}
	
	public void perimeter(){
		System.out.println("Perimeter: "+(base+height+side));
	}
}
