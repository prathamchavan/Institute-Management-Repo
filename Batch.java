package com.cjc.ims.app.model;

public class Batch { 
	private int bid; 
	private String bname; 
	private Faculty faculty; 

	//setter/getter 
	//for batch id
	public void setBid(int bid)
	{
		this.bid = bid;
	}

	public int getBid()
	{
		return bid;
	}

	//for batch name
	public void setBname(String bname)
	{
		this.bname = bname;
	}
	public String getBname()
	{
		return bname;
	}

	//for faculty
	public void setFaculty(Faculty faculty)
	{
		this.faculty = faculty;
	}
	public Faculty getFaculty()
	{
		return faculty;
	}
}