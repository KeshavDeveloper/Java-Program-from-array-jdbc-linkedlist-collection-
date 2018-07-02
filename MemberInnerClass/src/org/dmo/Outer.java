package org.dmo;

public class Outer
{
	private int data=30;
	
	class Inner
	{
		void msg()
		{
			System.out.println("data inner a is"+data);
		}
	}
	void display()
	{
		Inner i=new Inner();
		i.msg();
	}
	void msg()
	{
		System.out.println("data in outer class is"+data);
	}
	public static void main(String args[])
	{
		Outer o=new Outer();
		o.display();
		o.msg();
	}

}
