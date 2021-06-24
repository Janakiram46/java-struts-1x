package com.ServerConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteOperation {

	public static void main(String[] args)
	{
Connection connection=ServerConnection.getConnection();
		
		try {
			PreparedStatement ps=connection.prepareStatement("DELETE FROM STDDATA WHERE STDID=?");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Id to delete");
			int id=sc.nextInt();
			ps.setInt(1, id);
			ps.executeUpdate();
			System.out.println("Id deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
