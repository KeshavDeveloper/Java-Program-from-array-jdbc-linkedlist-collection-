package org.collectionDemo;
import java.util.*;
public class Demo1 {
	public static void main(String[] args) {
		ArrayList <String> list=new ArrayList<String>();
		
		list.add("rupak");
		list.add("keshav");
		list.add("rithom");
		list.add("raj");
	
		Iterator i=list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}

}
