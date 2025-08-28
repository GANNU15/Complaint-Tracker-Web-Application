package com.mini.model;

public class ResidentDetails {
	
	private int id;
	
	private String name;
	
	private String flatNo;
	
	private String mobile;
	
	private String email;
	
	private String password;
	
	
	public ResidentDetails() {
		
	}


	public ResidentDetails(int id, String name, String flatNo, String mobile, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.flatNo = flatNo;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
	}


	public ResidentDetails(String name, String flatNo, String mobile, String email, String password) {
		super();
		this.name = name;
		this.flatNo = flatNo;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
	}
	


	public ResidentDetails(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	

	public ResidentDetails(String flatNo) {
		super();
		this.flatNo = flatNo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFlatNo() {
		return flatNo;
	}


	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "ResidentDetails [id=" + id + ", name=" + name + ", flatNo=" + flatNo + ", mobile=" + mobile + ", email="
				+ email + ", password=" + password + "]";
	}
	
	
}











