package org.linkedList.raghusirDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class FactoryStoreBookNpen 
{
	static Scanner sc=new Scanner(System.in);

	static Book ReadBook()
	{
		

		System.out.println("enter your Book detail[id,price,name]");
		int id=sc.nextInt();
		int price=sc.nextInt();
		String name=sc.next();
		Book b=new Book(id,price,name);

		return b;

		
	}
	static Pen ReadPen()
	{
		//static Scanner sc=new Scanner(System.in);
		System.out.println("enter yor pen detail[id,price,color]");
		
		int id=sc.nextInt();
		int price=sc.nextInt();
		String color=sc.next();
		Pen p=new Pen(id,price,color);
		return p;
	}
	public static void main(String[] args) 
	{
		
		LinkedList ls=new LinkedList();
		while(true)
		{
			System.out.println("1.Book \n 2.Pen \n 3.Display");
			System.out.println("enter your choice:");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1 : bookOperation(ls);
			break;
			case 2 : penOperation(ls);
			break;
			case 3: Iterator i=ls.iterator();
			     while(i.hasNext())
			     {
			    	 System.out.println(i.next());
			    	 
			     }
			
			
			}
			System.out.println("do want to continue:");
			String res=sc.next();
			if(res.equalsIgnoreCase("no"))
			break;
				
			}
			
			
		}
	private static void penOperation(LinkedList ls)
	{
		System.out.println("1.addpen \n 2.deletepen \n 3.displaypen");
		System.out.println("enter your choice:");
		int ch=sc.nextInt();
		switch(ch)
		{
		
		case 1:
			System.out.println("neter the pen:");
			
			ls.add(ReadPen());
			break;
		case 2:
			System.out.println("enter a pen id do you want to delete:");
			int id=sc.nextInt();
			int find=0;
			for (Object obj : ls)
			{
				if(obj instanceof Pen)
				{
					Pen b=(Pen)obj;
					if(b.id==id)
					{
						ls.remove(b);
						System.out.println("successfully deleted:");
						find=1;
						break;
					}
				}
				
			}
			if(find==0)
			
				System.out.println("thsi pen id is not found:");
				break;
			
		case 3:
			System.out.println("enter a pen id you want to display:");
			id=sc.nextInt();
			find=0;
			for(Object obj:ls)
			{
				if(obj instanceof Pen)
				{
					Pen b=(Pen)obj;
					if(b.id==id)
					{
						System.out.println(b);
						System.out.println("successfully displayed:");
						find=1;
						break;
						
					}
				}
			}
		
		if(find==0)
		
			System.out.println("this pen id is not presesnt");
			break;
		}
		
		}
	private static void bookOperation(LinkedList ls)
	{
		
	System.out.println("1.addBook \n 2.deleteBook \n 3.displayBook");
	System.out.println(" Enter your choice ");
	int ch= sc.nextInt();
	switch(ch)

	{
	case 1:
		System.out.println("enter the book info");
		ls.add(ReadBook());
		break;
	case 2:
		System.out.println("enter book id you want deleyou");
		int id=sc.nextInt();
		int find=0;
		for(Object obj:ls)
		{
			if(obj instanceof Book)
			{
				Book b=(Book)obj;
				if(b.id==id)
				{
					ls.remove(b);
					System.out.println("successfully delete:");
					find=1;
					break;
				}
			}
		}
		if(find==0)
		
			System.out.println("this book id is not present");
		break;
			case 3:
		System.out.println("enter your book id you want to display:");
		id=sc.nextInt();
		find=0;
		for(Object obj:ls)
		{
			if(obj instanceof Book)
			{
				Book b=(Book)obj;
				if(b.id==id)
				{
					System.out.println(b);
					System.out.println("succesfully displayed:");
					find=1;
					break;
				}
			}
		}
		if(find==0)
			System.out.println("this book id is not present");
		break;
		
	}
	}
}
	
		
		


