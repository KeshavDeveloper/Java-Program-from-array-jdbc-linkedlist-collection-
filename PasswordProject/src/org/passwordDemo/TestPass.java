package org.passwordDemo;

import java.util.Scanner;

public class TestPass 
{
	public static void main(String[] args) 
	{
		PasswordCheck pc=new PasswordCheck();
		System.out.println("enter your passord");
		Scanner sc=new Scanner(System.in);
		String password=sc.nextLine();
		System.out.println("plz enter your password to conform");
		String conformPassword=sc.nextLine();
		//boolean f=true;
	    if (password.equals(conformPassword)) 
	    {
	    	if(pc.check(password))
	    	{
	    		System.out.println("very strong");
	    	}
	    	else if(pc.prirority1(password))
	    			{
	    		System.out.println("very weak");
	    			}
	    	else if(pc.prirority2(password))
	    	{
	    		System.out.println("weak");
	    	}
	    	else if(pc.prirority3(password))
	    	{
	    		System.out.println("strong");
	    	}
	    }
	    else
	    	System.out.println("invalid password");

		
		
	}

}
