package org.collectionDemo;

import java.util.*;

public class CollectionTest1 
{
	
	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("keshav");
		a.add("rupak");
		a.add("Gaurav");
		a.add("raj");
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("binaya");
		a1.add("ram");
		a.addAll(a1);
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
	}

}
