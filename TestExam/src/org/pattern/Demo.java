package org.pattern;

import java.util.Scanner;

public class Demo 
{
	
	   public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        sc.nextLine();
	        int k=1,l=1,m=1,x=1;
	        for(int i=1;i<=n;i++)
	        {
	            System.out.println();
	            if(i%2!=0)
	            {
	                for(int j=1;j<=i;j++)
	                {

	                    System.out.print(l);
	                    int a=1;
	                    if(a<=j && j!=i)
	                    {
	                        System.out.print("*");
	                    }
	                }

	                k=l+m*2;
	                m++;
	                l--;
	            }
	            else
	            {
	                l=k+1;
	                x=k;
	                for(int j=1;j<=i;j++)
	                {

	                    System.out.print(x);
	                    int a=1;
	                    if(a<=j && j!=i)
	                    {
	                        System.out.print("*");
	                    }
	                }   
	                l--;
	            }
	        }
	    }
	}


