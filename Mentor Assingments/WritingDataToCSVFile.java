package com.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WritingDataToCSVFile
{

	public static void main(String[] args) throws IOException
	{
		FileWriter fw=new FileWriter("C:\\Users\\BCP\\Documents\\Files\\Data.CSV");
		BufferedWriter br=new BufferedWriter(fw);
		Scanner sc=new Scanner(System.in);

		StringBuilder sb=new StringBuilder();
		sb.append("sno");
		sb.append(",");
		sb.append("name");
		sb.append(",");
		sb.append("dept");
		sb.append("\n");
		br.write(sb.toString());
		while(true)
		{
			System.out.println("Enter the Sno");
			int sno=sc.nextInt();
			if(sno<=0)
			{
				System.out.println("sno can't be zero");
				break;

			}	
			br.write(sno+",");
		
			System.out.println("Enter the name");
			String name=sc.next();
			br.write(name+",");
			System.out.println("enter the dept");
			String dept=sc.next();
			br.write(dept+"\n");
			
			

		}


		
		br.close();
		fw.close();
		System.out.println("Data written successfully");
	}

}
