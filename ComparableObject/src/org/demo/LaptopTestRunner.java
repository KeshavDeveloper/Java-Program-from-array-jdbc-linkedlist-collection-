package org.demo;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class LaptopTestRunner
{
	public static void main(String[] args) 
	{
		List l=new ArrayList();
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a brand:");
			String brand=sc.next();
			System.out.println("enter your ram");
			int ram=sc.nextInt();
			System.out.println("enter your price");
			int price=sc.nextInt();
			boolean store=l.add(new LaptopDetails(brand,ram,price));
			if(store)
			{
				System.out.println("successfully added");
			}
			else
				System.out.println("fail to add");
			System.out.println("do you want to add more???");
			String check=sc.next();
			if(check.equalsIgnoreCase("no"))
			
				break;
			}
		for(Object o:l)
		{
			System.out.println(o);
			
		}
		
	}

}
