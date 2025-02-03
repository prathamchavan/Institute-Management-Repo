package com.cjc.ims.app.model;

public class Student{ 
	private int sid; 
	private String sname; 
	private Batch batch; 

	//setter/getter
	//for student id
	
	public void setSid(int sid)
	{
		this.sid = sid;
	} 
	public int getSid()
	{
		return sid;
	}

	//for student name
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	public String getSname()
	{
		return sname;
	}

	//for batch
	public void setBatch(Batch batch)
	{
		this.batch = batch;
	}
	public Batch getBatch()
	{
		return batch;
	}
} 