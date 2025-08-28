package com.mini.model;

public class Complaint {
	
	private int id ;
	
	private String name;
	
	private String flatNo;
	
	private String issueSummary;
	
	private String status;
	
	public Complaint() {
		
	}

	public Complaint(int id, String name, String flatNo, String issueSummary, String status) {
		super();
		this.id = id;
		this.name = name;
		this.flatNo = flatNo;
		this.issueSummary = issueSummary;
		this.status = status;
	}

	public Complaint(String name, String flatNo, String issueSummary, String status) {
		super();
		this.name = name;
		this.flatNo = flatNo;
		this.issueSummary = issueSummary;
		this.status = status;
	}
	
	

	public Complaint(int id, String status) {
		super();
		this.id = id;
		this.status = status;
	}

	public Complaint(String name, String flatNo, String issueSummary) {
		super();
		this.name = name;
		this.flatNo = flatNo;
		this.issueSummary = issueSummary;
	}
	
	
	public Complaint(int id, String name, String flatNo, String issueSummary) {
		super();
		this.id = id;
		this.name = name;
		this.flatNo = flatNo;
		this.issueSummary = issueSummary;
	}

	public Complaint(String status) {
		super();
		this.status = status;
	}
	

	public Complaint(int id) {
		super();
		this.id = id;
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

	public String getIssueSummary() {
		return issueSummary;
	}

	public void setIssueSummary(String issueSummary) {
		this.issueSummary = issueSummary;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Complaint [id=" + id + ", name=" + name + ", flatNo=" + flatNo + ", issueSummary=" + issueSummary
				+ ", status=" + status + "]";
	}

	
	
	
}
