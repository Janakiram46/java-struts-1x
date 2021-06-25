package com.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ServerConnection
{

	
 private static Connection connection;

   static
   {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection=DriverManager.getConnection("jdbc:sqlserver://den1.mssql7.gear.host;databaseName=mssqldatabase13",
					"mssqldatabase13","Ram@123456");


			System.out.println("Coonection established.........");
		} catch (SQLException e)
		{
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   public static Connection getConnection()
   {
	   return connection;
   }
}

