package com.FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingDataFromCSVFile {

	public static void main(String[] args) throws IOException 
	{
		FileReader fr=new FileReader("C:\\Users\\BCP\\Documents\\Files\\Data.CSV");
		BufferedReader br=new BufferedReader(fr);
		String info;
		while((info=br.readLine())!=null)
		{
			System.out.println(info.toString());
		}

	}

}
