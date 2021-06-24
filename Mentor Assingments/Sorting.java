package com.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Sorting
{

	public static void main(String[] args) throws IOException
	{
		Student student;
		Set<Student> set=new TreeSet<Student>();
		FileWriter fOutput=new FileWriter("C:\\Users\\BCP\\Documents\\Files\\file6.txt");

		String s1="end";
		Scanner sc=new Scanner(System.in);
		while(true)
		{

			System.out.println("Enter the name");

			String name=sc.next();
			if(name.equalsIgnoreCase(s1))
			{
				System.out.println("It will exist when you enter end");
				break;
			}

			fOutput.write(name+"\n");
		}
		System.out.println("Written successfully.......");
		fOutput.close();

		String info;
		FileReader fr=new FileReader("C:\\Users\\BCP\\Documents\\Files\\file6.txt");
		BufferedReader br=new BufferedReader(fr);
		while((info=br.readLine())!=null)
		{
			System.out.println(info);
			
			student=new Student(info.toString());
			set.add(student);
		}
		System.out.println(set.toString());
		FileWriter fw=new FileWriter("C:\\Users\\BCP\\Documents\\Files\\file7.txt");

		fw.write(set.toString());
		System.out.println("File Information added successfuly");


		br.close();
		fr.close();
		fw.close();
	}





}
