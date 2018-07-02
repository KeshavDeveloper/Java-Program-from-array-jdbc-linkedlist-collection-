package org.TreeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class StudentTestRunner 
{
	
	public static void main(String[] args)
	{
		
		TreeSet ts=new TreeSet();
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter a name");
		String name=sc.next();
		System.out.println("enter a percentage");
		double percentage=sc.nextDouble();
			boolean res=	ts.add(new Student(id,name,percentage));
			if(res)
			{
		System.out.println("successFully added");
			}
		else
		System.out.println("failed to add");
	System.out.println("do you want store more");
	String check=sc.next();
	if(check.equalsIgnoreCase("no"))
	
		break;
		}
		for(Object o :ts)
		{
			//Student s=(Student)o;
			System.out.println(o);
		}
	}
		
		
}


