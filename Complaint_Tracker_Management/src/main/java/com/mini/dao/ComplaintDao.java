package com.mini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mini.model.Complaint;
import com.mini.model.ResidentDetails;
import com.mini.utils.Constants;
import com.mini.utils.DBConnection;

public class ComplaintDao {
	
	
	public void insertComplaint(Complaint complaint) {
		
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.INSERT_COMPLAINT);
			statement.setString(1, complaint.getName());
			statement.setString(2, complaint.getFlatNo());
			statement.setString(3, complaint.getIssueSummary());
			
			statement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<Complaint> allComplaints(ResidentDetails flat){
		List<Complaint> complaints = new ArrayList<Complaint>(); 
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.ALL_COMPLAINTS);
			statement.setString(1, flat.getFlatNo());
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String flatNo = rs.getString(3);
				String issue = rs.getString(4);
				String status = rs.getString(5);
				
				Complaint complaintByFlatNo = new Complaint(id,name,flatNo,issue,status);
				complaints.add(complaintByFlatNo);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return complaints;
	}
	
	public Complaint getComplaint(int id) {
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.GET_COMPLAINT);
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()) {
				int idC = rs.getInt(1);
				String name = rs.getString(2);
				String flatNo = rs.getString(3);
				String issue = rs.getString(4);
				
				Complaint newComplaint = new Complaint(idC,name,flatNo,issue);
				return newComplaint;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void updateComplaint(int id,Complaint complaint) {
		
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.UPDATE_COMPLAINT);
			statement.setString(1, complaint.getName());
			statement.setString(2, complaint.getFlatNo());
			statement.setString(3,complaint.getIssueSummary());
			statement.setInt(4, id);
			statement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteComplaint(Complaint delCom) {
		
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.DELETE_COMPLAINT);
			statement.setInt(1, delCom.getId());
			
			statement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<Complaint> viewComplaints(){
		
		List<Complaint> complaints = new ArrayList<Complaint>();
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.VIEW_COMPLAINTS);
			ResultSet rs = statement.executeQuery();
			
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String flatNo = rs.getString(3);
				String issue = rs.getString(4);
				String status = rs.getString(5);
				
				Complaint complaint = new Complaint(id,name,flatNo,issue,status);
				complaints.add(complaint);
				
				
			}
			return complaints;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public Complaint getComplaintToUpdate(int id) {
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.GET_COMPLAINT);
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()) {
				int idC = rs.getInt(1);
				String name = rs.getString(2);
				String flatNo = rs.getString(3);
				String issue = rs.getString(4);
				String status = rs.getString(5);
				
				Complaint newComplaint = new Complaint(idC,name,flatNo,issue,status);
				return newComplaint;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void updateStatus(int id,Complaint complaint) {
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.UPDATE_STATUS);
			statement.setString(1, complaint.getStatus());
			statement.setInt(2, id);
			
			statement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Complaint> allComplaintByFlatNo(String flatNo){
		
		List<Complaint> complaints = new ArrayList<>();
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.PAST_COMPLAINTS);
			statement.setString(1, flatNo);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String flat = rs.getString("flatNo");
				String issue = rs.getString("issue_summary");
				String status = rs.getString("status");
				
				Complaint oldComplaint = new Complaint(id,name,flat,issue,status);
				complaints.add(oldComplaint);
				
			}
			return complaints;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return complaints;
	}
	
}
