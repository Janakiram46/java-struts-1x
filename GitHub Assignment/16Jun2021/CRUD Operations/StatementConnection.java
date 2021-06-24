package com.ServerConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementConnection {

	public static void main(String[] args)
	{
		Connection connection=ServerConnection.getConnection();
		
		try {
			Statement statement=connection.createStatement();
			statement.execute("CREATE TABLE STDDATA(STDID INT PRIMARY KEY,STDNAME VARCHAR(20) NOT NULL,"
					+ "STDPHNO VARCHAR(10) UNIQUE,"
					+ "STDDEPT VARCHAR(10) NOT NULL)");
			System.out.println("Table created");
			
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
