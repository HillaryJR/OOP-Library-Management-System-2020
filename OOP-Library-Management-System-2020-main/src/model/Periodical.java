package model;

public class Periodical {
	
	private  int id;
	private String type;
	private String name;
	private String publication;
	private String edition;
	private String price;
	private String year;
	private String filename;
	
	
	
	public Periodical(int id, String type, String name, String publication, String edition, String price, String year,
			String filename) {
	
		this.id = id;
		this.type = type;
		this.name = name;
		this.publication = publication;
		this.edition = edition;
		this.price = price;
		this.year = year;
		this.filename = filename;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPublication() {
		return publication;
	}



	public void setPublication(String publication) {
		this.publication = publication;
	}



	public String getEdition() {
		return edition;
	}



	public void setEdition(String edition) {
		this.edition = edition;
	}



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}



	public String getYear() {
		return year;
	}



	public void setYear(String year) {
		this.year = year;
	}



	public String getFilename() {
		return filename;
	}



	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	
	

	
	
	
	
	
}
