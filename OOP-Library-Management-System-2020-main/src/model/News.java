package model;

public class News {
	
	private  int id;
	private String topic;
	private String description;
	private String date;
	private String filename;
	
	public News(int id, String topic, String description, String date, String filename) {
		
		this.id = id;
		this.topic = topic;
		this.description = description;
		this.date = date;
		this.filename = filename;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	
	
	
	
	

}
