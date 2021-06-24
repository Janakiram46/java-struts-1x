package com.AuthorBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ServerConnection.ServerConnection;


public class AuthorDAO
{
	private final static Connection connection=ServerConnection.getConnection();
	public static List<Author> getAuthorList() {
		try {
               List<Author> l=new ArrayList<Author>();
               ResultSet rs=connection.createStatement().executeQuery("SELECT * FROM AUTHOR");
			    while(rs.next())
			    {
			    Author a=new Author(rs.getInt(1),rs.getString(2));
			    l.add(a);
			    }
			    return l;
		
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	public static boolean insert(Book b) {
		try {

			PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO BOOK VALUES(?,?,?,?,?)");
			preparedStatement.setInt(1, b.getBookId());
			preparedStatement.setString(2, b.getBookName());
			preparedStatement.setInt(3, b.getBookPrice());
			preparedStatement.setInt(4, b.getAuthorId());
			preparedStatement.setInt(5, b.getPages());
			
			preparedStatement.execute();
			return true;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
}
	public static List<Book> getBook() 
	{
		List<Book> lb=new ArrayList<Book>();
		
		ResultSet rs;
		try {
			rs = connection.createStatement().executeQuery("SELECT * FROM BOOK");
			while(rs.next())
			{
			Book b=new Book(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5));
			lb.add(b);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return lb;
	}
	
}
