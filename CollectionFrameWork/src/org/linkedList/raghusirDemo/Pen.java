package org.linkedList.raghusirDemo;

public class Pen 
{
	String color;
	int id;
	int price;
	Pen(int id,int price,String color)
	{
		this.id=id;
		this.price=price;
		this.color=color;
		
	}
	public String toString()
	{
		return id+ "\t"+price+"\t"+color;
	}

}
