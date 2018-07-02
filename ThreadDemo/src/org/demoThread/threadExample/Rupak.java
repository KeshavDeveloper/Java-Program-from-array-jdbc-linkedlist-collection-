package org.demoThread.threadExample;

public class Rupak extends Thread
{
public	void run()
	{
	for(int i=0;i<5;i++)
	{
		System.out.println("Rupak:-monJolika ka Paniii Piyegaaa Gaurav????????????????????");
		try { Thread.sleep(500);}catch(Exception e) {}
	}
	}
}
