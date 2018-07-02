package org.demoThread.threadExample;

public class Gaurav extends Thread
{
	public void run()
	 {
	for(int i=0;i<5;i++)
	{
		
		System.out.println("Gaurav:- ha  Piyenge");
		try {  Thread.sleep(1000);}catch(Exception e) {}
	}
	 }
}
