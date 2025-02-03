package com.cjc.ims.app.model; 

public class Faculty{ 
	private int fid; 
	private String fname; 
	private Course course; 

	//setter/getter 
	
	//for id
	public void setFid(int fid)
	{
		this.fid = fid;
	}
	public int getFid()
	{
		return fid;
	}

	//for name
	public void setFname(String fname)
	{
		this.fname = fname;
	}
	public String getFname()
	{
		return fname;
	}

	//for course relation
	public void setCourse(Course course)
	{
		this.course =course;
	}
	public Course getCourse()
	{
		return course;
	}
}