package org.jspiderDemo.bikeCollection;

import java.util.Scanner;

public class Swaroom 
{
public static void main(String[] args) 
{
	System.out.println("enter your item");
	Scanner sc=new Scanner(System.in);
	int item=sc.nextInt();
	Factory Baja=new Factory();
	Collection c=Baja.makeOrder(item);
	
}
}
