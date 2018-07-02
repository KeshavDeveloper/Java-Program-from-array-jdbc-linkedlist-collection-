package org.programCode;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Testrunner
{
	public static void main(String[] args) 
	{
		
		List l=new ArrayList();
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your id:");
		int id=sc.nextInt();
		System.out.println("enter your name:");
		String name=sc.next();
		System.out.println(":enter your percentage");
		double percentage=sc.nextDouble();
	
		
			
			boolean store=l.add(new Student(id,name,percentage));
			if(store)
				System.out.println("successFully added");
				System.out.println("do you want to add more");
				String check=sc.next();
				if(check.equalsIgnoreCase("no"))
				{
					break;
				}
			
			
		}
		for(Object  s:l)
		{
			System.out.println(s);
		}
		
	}

}
