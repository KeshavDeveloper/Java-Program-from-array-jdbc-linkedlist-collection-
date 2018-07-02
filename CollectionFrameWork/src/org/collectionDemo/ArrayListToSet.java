package org.collectionDemo;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListToSet 
{
	public static void main(String[] args) 
	{
		
		List l=new ArrayList();
		l.add("ram");
		l.add("ram");
		l.add("gopal");
		l.add("kjhg");
		System.out.println(l.toString());
		Set s=new LinkedHashSet(l);
		System.out.println(s);
		
		
		
	}
	

}
