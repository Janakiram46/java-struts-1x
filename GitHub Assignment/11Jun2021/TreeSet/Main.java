package com.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException 
	{
		Set<Person> set=new TreeSet<Person>();
		String info;
		Person person;
		try 
		{
			FileReader fOutput=new FileReader("C:\\Users\\BCP\\Documents\\Files\\file.txt");
			FileWriter fInput=new FileWriter("C:\\Users\\BCP\\Documents\\Files\\file1.tx");
			BufferedReader br=new BufferedReader(fOutput);
			BufferedWriter bw=new BufferedWriter(fInput);
			while((info=br.readLine())!=null)
			{
                 System.out.println(info.toString());
				String[] sep=info.split(",");
				 person=new Person(Integer.parseInt(sep[0]),sep[1]);
				set.add(person);

			}
			System.out.println(set);
			for(Object insert:set)
			{
				System.out.println(insert);
				bw.write(insert.toString());

			}
			bw.close();
			
			System.out.println("File inserted successfully....");
			System.out.println("check the given file name to know the data");
			
		} 
		catch (FileNotFoundException e)
		{

			e.printStackTrace();
		}

	}

}
