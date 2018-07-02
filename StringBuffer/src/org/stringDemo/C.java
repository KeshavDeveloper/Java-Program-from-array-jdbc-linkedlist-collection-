package org.stringDemo;

public class C extends B implements D
{
	
	static void c()
	{
		//C c=(C)b;
		C.b();
		
		System.out.println(" i am in C.....");
	}
	 public void d()
	 {
		 D.super.concreteD();
		 System.out.println(" i am in D interface within C.....");
		 //D d=new C();
		// System.out.println(d.name);
	 }
	 

}
