package org.demoThread.threadExample;

public class ThreadDemo 
{
	public static void main(String[] args) {
		
	
	Rupak r=new Rupak();
	Gaurav g=new Gaurav();
	//try {Thread.sleep(1000);}catch(Exception e){}

	r.start();
	try {Thread.sleep(2000);}catch(Exception e){}
	g.start();
	
	}
}

