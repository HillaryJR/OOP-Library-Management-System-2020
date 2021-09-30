package com.project2;

public class Search {
	private int id;
	private int categoryNum;
	private String name;
	private String author;
	private String edition;
	private double price;
	private int year;
	private String filename;
	
	public Search(int id, int categoryNum , String name, String author, String edition , double price , int year , String filename) {
		
		this.id = id;
		this.categoryNum = categoryNum;
		this.name = name;
		this.author = author;
		this.edition = edition;
		this.price = price;
		this.year = year;
		this.filename = filename;
	}

	public int getId() {
		return id;
	}

	public int getCategoryNum() {
		return categoryNum;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getEdition() {
		return edition;
	}

	public double getPrice() {
		return price;
	}

	public int getYear() {
		return year;
	}

	public String getFilename() {
		return filename;
	}
}



	
	
	


