package com.cjc.ims.app.model;

public class Course
{
	private int cid;
	private String cname;
	
	//setter getter

	//for cid

	public void setCid(int cid)
	{
		this.cid = cid;
	}

	public int getCid()
	{
		return cid;
	}

	//for name
	public void setCname(String cname)
	{
		this.cname = cname;
	}
	
	public String getCname()
	{
		return cname;
	}

}