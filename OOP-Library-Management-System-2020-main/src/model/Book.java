package model;

public class Book {
	
	private  int id;
	private String categoryNum;
	private String bookname;
	private String bookauthor;
	private String edition;
	private String price;
	private String year;
	private String filename;
	
	
	public Book(int id, String categoryNum, String bookname, String bookauthor, String edition, String price,
			String year, String filename) {
		
		this.id = id;
		this.categoryNum = categoryNum;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.edition = edition;
		this.price = price;
		this.year = year;
		this.filename = filename;
	}


	
	public int getId() {
		return id;
	}


	public String getCategoryNum() {
		return categoryNum;
	}


	public String getBookname() {
		return bookname;
	}


	public String getBookauthor() {
		return bookauthor;
	}


	public String getEdition() {
		return edition;
	}


	public String getPrice() {
		return price;
	}


	public String getYear() {
		return year;
	}


	public String getFilename() {
		return filename;
	}
	
	
	
	
	

}
