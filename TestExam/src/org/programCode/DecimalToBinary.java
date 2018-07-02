package org.programCode;

import java.util.Scanner;
class DecimalToBinary



{
	public static void main(String args[])
	{
     	System.out.println("enter a number");
     	Scanner sc=new Scanner(System.in);
     	int dno=sc.nextInt();
     	convertBinary(dno);
  	}
	public static void convertBinary(int num)
	{
     		int binary[] = new int[40];
     		int index = 0;
     		while(num > 0)
     		{
       			binary[index++] = num%2;
       			num = num/2;
     		}
     		for(int i = index-1;i >= 0;i--)
     		{
       			System.out.print(binary[i]);
     		}
  	}
 
  	
}







 





