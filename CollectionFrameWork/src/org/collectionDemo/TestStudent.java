package org.collectionDemo;
import java.util.*;

public class TestStudent 
{
	public static void main(String[] args) 
	{
		
	
	Student s1=new Student("keshav",123,20);
	Student s2=new Student("rupak",1,22);
	Student s3=new Student("raj",12,21);
	ArrayList<Student> a=new ArrayList<Student>();
	a.add(s1);
	a.add(s2);
	a.add(s3);
	Iterator i=a.iterator();
	while(i.hasNext())
	{
	Student s=(Student)i.next();
	System.out.println(s.name+"\t"+s.rollNo+"\t"+s.age);
	}

	
	}
}


