package com.mini.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	
	public static Connection connection = null;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		if(connection == null) {
			connection  = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);
			
		}
		return connection;
	}
}
