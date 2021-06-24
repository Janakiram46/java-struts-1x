package com.ServerConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ReadDataPreparedStatement {

	public static void main(String[] args)
	{
		Connection connection=ServerConnection.getConnection();
		
		try {
			PreparedStatement ps=connection.prepareStatement("INSERT INTO STDDATA VALUES(?,?,?,?)");
			   Scanner sc=new Scanner(System.in); 
			   do
			   {
			   System.out.println("Enter the Id");
			   int id=sc.nextInt();
			   if(id<=0)
			   {
				   System.out.println("ID value must be more than zero");
				   break;
				  
			   }
			   ps.setInt(1, id);
			   System.out.println("Enter the name");
			   String name=sc.next();
			   ps.setString(2, name);
			   System.out.println("Enter the phonenumber");
			   String phno=sc.next();
			   ps.setString(3, phno);
			   System.out.println("Enter the dept name");
			   String dept=sc.next();
			   ps.setString(4,dept);
			   ps.execute();
			   System.out.println("Query executed");
			   }while(true);
			  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

