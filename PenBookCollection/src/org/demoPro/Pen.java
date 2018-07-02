package org.demoPro;

public class Pen 
{
	
	int penId;
	double price;
	String color;
	
	public Pen(int penId,double price,String color)
	{
		this.penId=penId;
		this.price=price;
		this.color=color;
		
	}
	public String toString()
	{
		return "pen["+penId+","+price+","+color+"]";
	}

}
