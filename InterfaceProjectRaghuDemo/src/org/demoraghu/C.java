package org.demoraghu;

 public  class C implements B
{
	
	 public void c()
	 {
	      B.super.k();

		 System.out.println("eh");
	 }
	
	public static void main(String[] args) 
	{
	//A.super.a();
	A a=new C();
	a.c();
	//a.a();
	//B b=new C();
	//b.k();

	
	
			
	}
		
		
	}


