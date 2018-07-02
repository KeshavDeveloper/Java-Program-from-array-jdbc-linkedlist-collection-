package org.stringDemo;

public class B  extends A
{
	
	
	static void  b()
	{
		
		System.out.println("i am in b......");
	}
	static void z(A a1)
	{
		B b=(B)a1;
		b.a();
		
		
		System.out.println(" i am overiding a() method.....");
	}
	
	
	

}
