package main.api.autocomplete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	
	 public Connection getConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		  
	
		 Class.forName("com.mysql.jdbc.Driver");
		 String USERNAME = "root";
		 String PASSWORD = "@Masterlogin17";
		 String URL = "jdbc:mysql://localhost:3306/ean_api";
		 Connection m_connection = DriverManager.getConnection(URL , USERNAME , PASSWORD);
		 
		 return m_connection;
		 }
}
