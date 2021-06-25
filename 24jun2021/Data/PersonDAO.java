package com.Data;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ServerConnection.ServerConnection;

public class PersonDAO 
{
	private final static Connection connection=ServerConnection.getConnection();
	public static boolean insert(Person p) {
		try {

			PreparedStatement preparedStatement=connection.prepareStatement("insert into sample values(?,?,?,?)");
			preparedStatement.setInt(1, p.getId());
			preparedStatement.setString(2, p.getName());
			preparedStatement.setString(3, p.getMobileno());
			preparedStatement.setString(4, p.getCity());
			preparedStatement.execute();
			return true;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
}
	public static List<Person> getPeople()
	{

		try      {
			        List<Person> l=new ArrayList<Person>();
				    ResultSet rs=connection.createStatement().executeQuery("select * from sample");
				    while(rs.next()) {
				    	Person p=new Person();
				    	p.setId(rs.getInt(1));
				    	p.setName(rs.getString(2));
				    	p.setMobileno(rs.getString(3));
				    	p.setCity(rs.getString(4));
				    	l.add(p);
				    }

				    return l;
				}
				catch(SQLException e) {
					e.printStackTrace();
					return null;
				}
			}
}
