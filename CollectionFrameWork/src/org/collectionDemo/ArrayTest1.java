package org.collectionDemo;

import java.util.ArrayList;
import java.util.Collections;            //all the methods inside collections class are static and by calling the class name we call the method.

public class ArrayTest1 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(12);
		al.add(32);
		al.add(8);
		al.add(10);
		al.add(5);                         
		al.add(6);
		Object obj=Collections.min(al);
		System.out.println(obj);
		
		
		//binary search method first it is sorted and it display
		int rs=Collections.binarySearch(al, 45);
		
		
		
		
		
		System.out.println("list of elements");
		System.out.println(al);
		System.out.println("reversee");
		Collections.reverse(al);
		System.out.println(al);
		
		System.out.println(al);
		System.out.println("after the sorting");
		Collections.sort(al);
		
		System.out.println(al);
	}

}
