package com.ServerConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateOperation {

	public static void main(String[] args) 
	{
		
Connection connection=ServerConnection.getConnection();
		
		try {
			PreparedStatement ps=connection.prepareStatement("UPDATE STDDATA SET STDDEPT=? WHERE STDID=?");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the id to update name");
			int id=sc.nextInt();
			ps.setInt(2, id);
			System.out.println("Enter the name to update");
			String name=sc.next();
			ps.setString(1, name);
			ps.executeUpdate();
			System.out.println("Id Updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
