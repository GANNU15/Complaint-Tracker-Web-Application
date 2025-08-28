package com.mini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mini.model.ResidentDetails;
import com.mini.utils.Constants;
import com.mini.utils.DBConnection;

public class ResidentDao {
	
	public void signupResident(ResidentDetails resident) {
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.SAVE_RESIDENT);
			statement.setString(1, resident.getName());
			statement.setString(2, resident.getFlatNo());
			statement.setString(3, resident.getMobile());
			statement.setString(4, resident.getEmail());
			statement.setString(5, resident.getPassword());
			
			statement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public ResidentDetails loginResident(ResidentDetails residentLogin) {
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.LOGIN_RESIDENT);
			statement.setString(1, residentLogin.getEmail());
			statement.setString(2, residentLogin.getPassword());
			ResultSet resultSet = statement.executeQuery();
			if(resultSet.next()) {
				ResidentDetails resident = new ResidentDetails();
				
				int id = resultSet.getInt(1);
				resident.setId(id);
				String name = resultSet.getString(2);
				resident.setName(name);
				String flatNo = resultSet.getString(3);
				resident.setFlatNo(flatNo);
				String mobile = resultSet.getString(4);
				resident.setMobile(mobile);
				String email = resultSet.getString(5);
				resident.setEmail(email);
				String password = resultSet.getString(6);
				resident.setPassword(password);
				
				return resident;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return residentLogin;
	
	}
	public ResidentDetails getResident(String name) {
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.GET_COMPLAINT);
			statement.setString(1, name);
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()) {
				
				
				String flatNo = rs.getString(3);
				
				
				ResidentDetails resident = new ResidentDetails(flatNo);
				return resident;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
