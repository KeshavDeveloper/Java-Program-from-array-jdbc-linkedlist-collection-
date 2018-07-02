package org.collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class DescendinElemnet
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
		System.out.println(al);    // naturally the elements are  sorted in ascending order
		Collections.sort(al,new DescendinCompElement());// to do in desceending orde we need comparable type element    that is DescendingComp elemntsr
		System.out.println(al);
		
	}

}
