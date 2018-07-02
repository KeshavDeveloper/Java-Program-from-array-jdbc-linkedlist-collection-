package org.demoPro;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class MainTestRunner 
{
	static Scanner sc=new Scanner(System.in);
	
	
	static Book readBook()
	{
		System.out.println("enter id name,price");
		return new Book(sc.nextInt(),sc.next(),sc.nextDouble());
	}
	static Pen readPen()
	{
		System.out.println("enter id price color");
		return new Pen(sc.nextInt(),sc.nextDouble(),sc.next());
	}
		
	public static void main(String[] args) 
	{
		LinkedList ls=new LinkedList();
		while(true)
		{
			
			
			System.out.println("\n 1.Book \n 2.Pen \n 3.Display");
			System.out.println("enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1: bookOperation(ls);
					break;
			case 2: penOperation(ls);
					break;
					
			case 3: Iterator it=ls.iterator();
					
					while(it.hasNext())
					{
						System.out.println(it.next());
					}
			}
			System.out.println("Do you want to continue?????");
			
				String res=sc.next();
				if(res.equalsIgnoreCase("no"))
				
					break;
				
			
		}
			
			
			
			
		}
		private static  void penOperation(LinkedList ls)
		{
			System.out.println("1.addpen \n 2.deletepen \n  3.displaypen");
			System.out.println("enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
						System.out.println("enter the pen info");
						
						ls.add(readPen());
						break;
			case 2:
				
							System.out.println("enter your pen id you want to delete");
							
							int id=sc.nextInt();
							int find=0;
							for(Object obj:ls)
							{
								if(obj instanceof Pen)
								{
									Pen b=(Pen)obj;
									
									if(b.penId==id)
									{
										ls.remove(b);
										System.out.println("successFully deleted");
										find =1;
										break;
									}
								}
							}
							if(find==0)
							System.out.println(" this pen id is not present in here");
							break;
			case 3:
				
						System.out.println("enter the pen id you want to display");
						id=sc.nextInt();
						find=0;
						for (Object obj:ls)
						{
							if(obj instanceof Pen)
							{
								Pen b=(Pen)obj;
								if(b.penId==id)
								{
									System.out.println(b);
									System.out.println("successFully display");
									
									find =1;
									break;
								}
								
							}
						}
								if(find==0)
								
									System.out.println("this pen id is not present ");
									break;
								
					
			}
		}
		private static  void bookOperation(LinkedList ls)
		{
			
			System.out.println("1.addbook \n 2.deleteBook  \n  3.displaybook");
			System.out.println("enter your choice");
			int ch=sc.nextInt();
			
			
			switch(ch)
			{
			
			case 1:
				
							System.out.println("ente the boook infoo");
							
							ls.add(readBook());
							break;
							
			case 2:
				
				
							System.out.println("enter the  book id you want to delete");
							int id=sc.nextInt();
							int find=0;
							for(Object obj:ls)
							{
								
								
								if(obj instanceof Book)
								{
									Book b=(Book)obj;
									if(b.bookId==id)
									{
										ls.remove(b);
										System.out.println("succesFully deleted");
										find =1;
										
										
										break;
										
									}
								}
								
							}
							if(find==0)
							
								System.out.println("book is is not present");
								break;
								
							
			case 3:
				
				
								System.out.println("enter the book id to display ");
								
								id=sc.nextInt();
								find =0;
								for(Object obj:ls)
								{
									if(obj instanceof Book)
									{
										Book b=(Book)obj;
										if(b.bookId==id)
										{
											System.out.println(b);
											System.out.println("success fully displayed");
											find=1;
											break;
											
													
										}
									}
								}
								if(find ==0)
								
									System.out.println("this book is not present here");
									
								break;
								
								
								
			}
			
		}
		
		 
		
		
	}


