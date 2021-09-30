package com.project2;

import java.sql.Blob;

public class Periodic {
	private int id;
	private int periodicNum;
	private String name;
	private String publication;
	private String edition;
	private double price;
	private String filename;
	
	
	public Periodic(int id, int periodicNum, String name, String publication, String edition, double price , String filename) {
		super();
		this.id = id;
		this.periodicNum = periodicNum;
		this.name = name;
		this.publication = publication;
		this.edition = edition;
		this.price = price;
		this.filename = filename;
		
	}

	
	public int getId() {
		return id;
	}

	public int getPeriodicNum() {
		return periodicNum;
	}

	public String getName() {
		return name;
	}

	public String getPublication() {
		return publication;
	}

	public String getEdition() {
		return edition;
	}

	public double getPrice() {
		return price;
	}
	
	public String getFilename() {
		return filename;
	}
	
}
