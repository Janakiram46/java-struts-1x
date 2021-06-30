package com.Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentOrder {

	public static void main(String[] args)
	{

		List<Student> list=new ArrayList<Student>();

		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter the RollNumber");
		int rollNo=sc.nextInt();
		if(rollNo<=0)
		{
			break;
		}
		System.out.println("Enter the name of Student");
		String name=sc.next();
		System.out.println("Enter the standard");
		int standard=sc.nextInt();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		System.out.println("Enter the Gender");
		String gender=sc.next();
		list.add(new Student(rollNo,name,standard,age,gender));
		}
		list.forEach((s)->System.out.println(s));
		System.out.println("-----------------------------------------------------------");
		System.out.println("Enter the number to sort");
		
        boolean status=true;
        while(status)
        {
		System.out.println("Enter 1 for RollNumber ,2 for Name,3 for standard,4 for age, for 5 to exist");
     
		int value=sc.nextInt();
		switch(value)
		{
		case 1:
			Collections.sort(list,(x,y)->  (x.getRollNo()<y.getRollNo())?-1:(x.getRollNo()>y.getRollNo())?1:0);
			list.forEach((s)->System.out.println(s));
			break;
		case 2:
			Collections.sort(list,(x,y)->  (x.getName().compareTo(y.getName())));
			list.forEach((s)->System.out.println(s));
			break;
		case 3:
			Collections.sort(list,(x,y)->  (x.getStandard()<y.getStandard())?-1:(x.getStandard()>y.getStandard())?1:0);
			list.forEach((s)->System.out.println(s));
			break;
		case 4:
			Collections.sort(list,(x,y)->  (x.getAge()<y.getAge())?-1:(x.getAge()>y.getAge())?1:0);
			list.forEach((s)->System.out.println(s));
			break;
		case 5:
			System.out.println("End of sorting................");
			status=false;
			break;
			
		}
		
        }
       
        

	}

}
