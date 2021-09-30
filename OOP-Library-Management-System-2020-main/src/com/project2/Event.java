package com.project2;

public class Event {
	
	private int id;
	private String agelimit;
	private String eventname;
	private String eventdes;
	private String date;
	private String time;
	private String filename;
	
	public Event(int id, String agelimit, String eventname, String eventdes ,String date , String time,String filename) {
		super();
		this.id = id;
		this.agelimit = agelimit;
		this.eventname = eventname;
		this.eventdes = eventdes;
		this.date = date;
		this.time = time;
		this.filename = filename;
	}

	public int getId() {
		return id;
	}

	public String getAgelimit() {
		return agelimit;
	}

	public String getEventname() {
		return eventname;
	}

	public String getEventdes() {
		return eventdes;
	}
	
	public String getDate() {
		return date;
	}
	
	public String getTime() {
		return time;
	}

	public String getFilename() {
		return filename;
	}
}
