package org.demoRaghu.clonedemo;

public class Student  implements Cloneable
{
	String name;
	int rollNo;
	
	Student(int rollNo,String name)
	{
		this.name=name;
		this.rollNo=rollNo;
	}
	public Object clone()throws CloneNotSupportedException
	{  
		return super.clone();  
		}  

	public static void main(String[] args)
	{
		try
		{
			Student s=new Student(13,"keshav");
			Student s1=(Student)s.clone();
			System.out.println("your rollno is"+s.rollNo+"and name is"+s.name);
			System.out.println("cloning is:"+s1.rollNo+"and"+s1.name);
		}
	catch(CloneNotSupportedException c){}  

		
	}
	

}
