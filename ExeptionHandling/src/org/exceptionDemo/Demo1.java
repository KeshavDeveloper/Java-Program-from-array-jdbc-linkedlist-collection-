package org.exceptionDemo;

public class Demo1 
{
	public static void main(String[] args) 
	{
		try
		{
		int data =50/0;//may throw exception
		}
		catch(ArithmeticException e) {
		System.out.println("the rest of the data is..");
		}
		
	}

}
