package org.collectionDemo;

import java.util.*;

public class InteratorObject 
{
	public static void main(String[] args) 
	{
		StudentDetail sd1=new StudentDetail("aneek",12,45);
		StudentDetail sd2=new StudentDetail("rupak",12,45);
		StudentDetail sd3=new StudentDetail("keshubaba",12,45);
		


		
		
		ArrayList a=new ArrayList();
		
		a.add(sd1);
		a.add(sd2);
		a.add(sd3);
		Iterator i=a.iterator();
		while(i.hasNext())
		{
	
			
			System.out.println(i.next());
		
		
		
	}

}
}
