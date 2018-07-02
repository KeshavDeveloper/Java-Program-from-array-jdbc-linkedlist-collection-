package org.demoPro;

public class Book 
{
	
	int bookId;
	String bName;
	double price;
	public Book(int bookId,String bName,double price)
	{
		this.bookId=bookId;
		this.bName=bName;
		this.price=price;
	}
	public String toString()
	{
		return "Book ["+bookId+","+bName+","+price+"]";
		
	}

}
