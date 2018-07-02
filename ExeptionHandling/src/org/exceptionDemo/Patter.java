package org.exceptionDemo;

public class Patter 
{
	
	public static void main(String[] args)
	{
	int space=4,star=1,rspace=1;
	for(int i=1;i<=5;i++)
	{
		System.out.println();
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=star;k++)
		{
			System.out.print("*");
			//System.out.println();
		}
		star=star+2;
		space--;
		
		
	}
}
}

