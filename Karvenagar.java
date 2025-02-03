package com.cjc.ims.app.serviceimpl;
import java.util.*;
import com.cjc.ims.app.servicei.*;
import com.cjc.ims.app.model.*;

public class Karvenagar implements Cjc
{
	List<Course> clist = new ArrayList<>();
	List<Faculty> flist = new ArrayList<>();
	List<Batch> blist = new ArrayList<>();
	List<Student> slist = new ArrayList<>();

	//Course method implementations
	public void addCourse()
	{
		Scanner sc = new Scanner(System.in);
		Course c = new Course();

		System.out.println("Enter the course id");
		c.setCid(sc.nextInt());

		System.out.println("Enter the course name");
		c.setCname(sc.next());

		clist.add(c);
	}
	
	public void viewCourse()
	{
   		Iterator<Course> courseItr = clist.iterator();
			
			while(courseItr.hasNext())
			{
				Course c = courseItr.next();
				System.out.println("Course id is "+c.getCid());
				System.out.println("Course name is "+c.getCname());
			}

	}

	//For faculty
	public void addFaculty()
	{
		Scanner sc = new Scanner(System.in);
		
   		

		Faculty f = new Faculty();

		System.out.println("Enter the faculty id ");
		f.setFid(sc.nextInt());

		System.out.println("Enter the faculty name");	
		f.setFname(sc.next());

		System.out.println("Enter the course id ");
		int cid = sc.nextInt();
		
		Iterator<Course> courseItr = clist.iterator();
			while(courseItr.hasNext())
			{
				Course c = courseItr.next();
				if(cid == c.getCid())
				{
					f.setCourse(c);
				}
			} 
		flist.add(f);
		
	} 

	public void viewFaculty()
	{
		Iterator<Faculty> facultyItr = flist.iterator();
		while(facultyItr.hasNext())
		{
			Faculty f = facultyItr.next();
			System.out.println(" The faculty id is "+f.getFid());
			System.out.println(" The faculty name is "+f.getFname());
			System.out.println(" The course id is "+f.getCourse().getCid());
			System.out.println(" The course name is "+f.getCourse().getCname());


		}
	}

 	//
	public void addBatch()
	{	
		Scanner sc = new Scanner(System.in);
		Batch b = new Batch();

		System.out.println("Enter the batch id ");
		b.setBid(sc.nextInt());

		System.out.println("Enter the batch name ");
		b.setBname(sc.next());

		System.out.println("Enter the faculty id ");
		int fid= sc.nextInt();

		Iterator<Faculty> facultyItr = flist.iterator();
		while(facultyItr.hasNext())
		{
			Faculty f = facultyItr.next();
			if(fid == f.getFid())
			{
				b.setFaculty(f);
			}
		}

		blist.add(b);
		
	}

	public void viewBatch()
	{
		Iterator<Batch> batchItr = blist.iterator();
		while(batchItr.hasNext())
		{
			Batch b = batchItr.next();
			System.out.println("Batch id is "+b.getBid());
			System.out.println("Batch name is "+b.getBname());
			System.out.println("Faculty id is "+b.getFaculty().getFid());
			System.out.println("Faculty name is "+b.getFaculty().getFname());
			System.out.println("Course id is "+b.getFaculty().getCourse().getCid());
			System.out.println("Course name is "+b.getFaculty().getCourse().getCname());
		}
		
	} 

	public void addStudent()
	{
		Scanner sc = new Scanner(System.in);

		Student s = new Student();
		System.out.println("Enter Student id ");
		s.setSid(sc.nextInt());
		
		System.out.println("Enter Student name");
		s.setSname(sc.next());

		System.out.println("Enter the batch id");
		int bid = sc.nextInt();

		Iterator<Batch> batchItr = blist.iterator();
		while(batchItr.hasNext())
		{
			Batch b = batchItr.next();
			if(bid == b.getBid())
			{
				s.setBatch(b);
			}
		}
		
		slist.add(s);
		
	}
	public void viewStudent()
	{
		Iterator<Student> studentItr = slist.iterator();
		while(studentItr.hasNext())
		{
			Student s = studentItr.next();
			System.out.println("Student id is "+s.getSid());
			System.out.println("Student name is "+s.getSname());

			System.out.println("Student batch id is "+s.getBatch().getBid());
			System.out.println("Student batch name is "+s.getBatch().getBname());
			
			System.out.println("Student faculty id is "+s.getBatch().getFaculty().getFid());
			System.out.println("Student faculty name is "+s.getBatch().getFaculty().getFname());
		
			System.out.println("Student course id is "+s.getBatch().getFaculty().getCourse().getCid());
			System.out.println("Student course id is "+s.getBatch().getFaculty().getCourse().getCname());
		} 
	}

	
}