package com.cjc.ims.app.client;
import com.cjc.ims.app.serviceimpl.*;
import com.cjc.ims.app.servicei.*;
import com.cjc.ims.app.model.*;

import java.util.*;
public class Test
{
	public static void main(String[] args)
	{

		Cjc c = new Karvenagar();
		Scanner sc = new Scanner(System.in);

		while(true)
		{


		System.out.println("1. Add Course");
		System.out.println("2. View Course");
		System.out.println("3. Add Faculty");
		System.out.println("4. View Faculty");
		System.out.println("5. Add Batch");
		System.out.println("6. View Batch");
		System.out.println("7. Add Student");
		System.out.println("8. View Student");
		System.out.println();
				
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		
		if(ch==1)
		{
			c.addCourse();
			System.out.println();
		
		}
		else if(ch==2)
		{
			c.viewCourse();
			System.out.println();
		}
		else if(ch==3)
		{
			c.addFaculty();
			System.out.println();
		}
		else if(ch==4)
		{
			c.viewFaculty();
			System.out.println();
		}
		else if(ch==5)
		{
			c.addBatch();
			System.out.println();
		}
		else if(ch==6)
		{
			c.viewBatch();
			System.out.println();
		}
		else if(ch==7)
		{
			c.addStudent();
			System.out.println();
		}
		else if(ch==8)
		{
			c.viewStudent();
			System.out.println();
		}
		else
		{
			System.out.println("Invalid choice");
			System.out.println();
		}
		
		
		}
		
		
	}
}