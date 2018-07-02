package org.exceptionDemo;

public class TestExceptionDemo 
{

	void m()
	{
		try {
			
		
		throw new java.io.IOException("device error...");
		}catch(Exception e)
		{
			System.out.println("excepto 1 is handled.....");
		}
	}
	void n()
	{
		m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println("exception 2 handled.....");
		}
	}
	public static void main(String[] args) 
	{
		
		
		TestExceptionDemo td=new TestExceptionDemo();
		td.p();
		System.out.println("normal flow.......");
		
		
	}
	
	
}
