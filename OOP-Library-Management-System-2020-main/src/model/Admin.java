package model;

import java.io.File;

public class Admin {
	private int id;
	private String fname;
	private String lname;
	private String mobile;
	private String email;
	private String address;
	private String username;
	private String password;
	private String filename;
	
	
	public Admin(int id, String fname, String lname, String mobile, String email, String address, String username,
			String password, String filename) {
	
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.username = username;
		this.password = password;
		this.filename = filename;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFilename() {
		return filename;
	}


	public void setFilename(String filename) {
		this.filename = filename;
	}
	

	
	
	
	
	
	
	
}
