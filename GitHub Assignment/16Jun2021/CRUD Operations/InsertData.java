package com.ServerConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args)
	{
		Connection connection=ServerConnection.getConnection();
		
		try {
			Statement statement=connection.createStatement();
			statement.executeUpdate("INSERT INTO STDDATA VALUES(14,'RAHUL','8076741345','ECE')");
			System.out.println("Query Excuted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
