package loginPack;

import java.io.File;

public class Customer {
	private int id;
	private String fname;
	private String lname;
	private String mobile;
	private String email;
	private String address;
	private String username;
	private String filename;

	public Customer(int id, String fname, String lname, String mobile, String email, String address,String username, String filename) {
		this.id=id;
		this.fname = fname;
		this.lname = lname;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.username = username;
		this.filename=filename;
	}
	public Customer() {
		
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public String getMobile() {
		return mobile;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public String getUsername() {
		return username;
	}
	public String getFilename() {
		return filename;
	}
}
