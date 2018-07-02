package org.demoLinkedlist;

import java.util.LinkedList;

public class Test 
{
	
	public static void main(String[] args) 
	{
		
		LinkedList lt=new LinkedList();
		//addin new lement in Linked List
		lt.add("A");
		lt.add("B");
		lt.add("C");
		lt.addFirst("D");
		lt.addLast("k");
        lt.add(2, "E");
        lt.add("F");
        lt.add("G");
        System.out.println(lt);
        //removing the element from the linked list
        lt.remove("B");
        lt.remove(3);
        lt.removeFirst();
        lt.removeLast();
		
		System.out.println(lt);
		
		
	}

}
