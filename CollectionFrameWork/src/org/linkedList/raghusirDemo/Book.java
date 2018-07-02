package org.linkedList.raghusirDemo;

public class Book 
{
	String name;
	int id;
	int price;
	Book(int id,int price,String name)
	{
		this.id=id;
		this.price=price;
		this.name=name;
		
	}
	public String toString()
	{
		return id+ "\t"+price+"\t"+name;
	}

}
