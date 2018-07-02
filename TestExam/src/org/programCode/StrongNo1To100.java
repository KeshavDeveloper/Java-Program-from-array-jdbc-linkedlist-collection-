package org.programCode;

import java.util.Scanner;

public class StrongNo1To100
{
public static void main(String args[])
		{
		int n;

			System.out.println("enter your number:-");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				if(SNoCheck(i))
				{
					System.out.println(""+i);
					
				}
				
				

			}
		}

			
			
			
			
		
		
		public static boolean SNoCheck(int x)
		{
		int sum=0;
		

			
		while(x != 0)
		{
			int i =1;
			int p = 1;
			int r = x % 10;
			while(i <= r)
			{
				p = p * i;
				i++;
			}
			sum = sum + p;
			x = x / 10;
		}
				
			
			
			if(sum==x)
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
			
			
			
		}

		
		
		
		

				
				
			
			
			
			
			
			

		
	


