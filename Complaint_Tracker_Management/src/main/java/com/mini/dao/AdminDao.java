package com.mini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mini.model.AdminDetails;
import com.mini.utils.Constants;
import com.mini.utils.DBConnection;

public class AdminDao {
	
	public void signupAdmin(AdminDetails admin) {
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.SAVE_ADMIN);
			statement.setString(1, admin.getName());
			statement.setString(2, admin.getMobile());
			statement.setString(3, admin.getEmail());
			statement.setString(4, admin.getPassword());
			
			statement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public AdminDetails loginAdmin(AdminDetails loginInfo ) {
		Connection connection;
		try {
			connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.LOGIN_ADMIN);
			statement.setString(1, loginInfo.getEmail());
			statement.setString(2, loginInfo.getPassword());
			ResultSet resultSet = statement.executeQuery();
			if(resultSet.next()) {
				AdminDetails admin = new AdminDetails();
				int id = resultSet.getInt(1);
				admin.setId(id);
				String name = resultSet.getString(2);
				admin.setName(name);
				String mobile = resultSet.getString(3);
				admin.setMobile(mobile);
				String email = resultSet.getString(4);
				admin.setEmail(email);
				String password = resultSet.getString(5);
				admin.setPassword(password);
				return admin;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
