package org.stringDemo;

public interface D 
{
	static String name="keshav";
	
	public void d();
	default  void concreteD()
	{
		System.out.println(" i am implementing complete method D.......");
	}
	

}
