package com.programShape;

public class Circle extends Shape
{
 private int radius;
final static double pie=3.14;
public Circle(int radius)
{
	super("Circle",2);
	this.radius=radius;
}
public void display(){
	super.display();
	System.out.println("Radius:"+radius);
	
}

public void area(){
	System.out.println("Area:"+pie*radius*radius);
}

public void perimeter(){
	System.out.println("Perimeter:"+2*pie*radius);
}
}
