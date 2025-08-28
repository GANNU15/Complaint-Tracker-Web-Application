package com.mini.utils;

public class Constants {
	public static final String URL ="jdbc:mysql://localhost:3306/complaint_tracker_management";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "root";
	public static final String SAVE_RESIDENT = "INSERT into resident_details(name,flatNo,mobile,email,password) values(?,?,?,?,?)";
	public static final String SAVE_ADMIN = "INSERT into admin_details(name,mobile,email,password) values(?,?,?,?)";
	public static final String LOGIN_ADMIN = "select * from admin_details where email = ? and password = ?";
	public static final String LOGIN_RESIDENT = "select * from resident_details where email = ? and password = ?";
	public static final String INSERT_COMPLAINT = "insert into complaints(name,flatNo,issue_summary) values(?,?,?)";
	public static final String ALL_COMPLAINTS = "select * from complaints where flatNo = ?";
	public static final String GET_COMPLAINT = "select * from complaints where id = ?";
	public static final String UPDATE_COMPLAINT = "update complaints set name = ?,flatNo = ?, issue_summary = ? where id = ?";
	public static final String DELETE_COMPLAINT = "delete from complaints where id = ?";
	public static final String VIEW_COMPLAINTS =  "SELECT * FROM complaints WHERE status = 'Pending' OR status = 'In Progress'";
	public static final String UPDATE_STATUS = "update complaints set status = ? where id = ?";
	public static final String PAST_COMPLAINTS = "select * from complaints where flatNo = ? and status = 'Resolved' ";
	public static final String GET_RESIDENT = "select * from resident_details where name = ?";
 }
