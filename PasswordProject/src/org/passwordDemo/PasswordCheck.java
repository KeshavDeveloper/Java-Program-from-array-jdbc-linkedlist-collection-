package org.passwordDemo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheck 
{
	//public static final String special_char= "[!@#$%^*()[\\\\]|;',./{}\\\\\\\\:\\\"<>?]";
    
	public static String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}";



	
	public static boolean  check(String pass)
	{
		if(pass.length()>=7 && pass.length()<=15)
		{
			for (int p = 0; p < pass.length(); p++) 
			{
	            if (Character.isUpperCase(pass.charAt(p))&&Character.isLowerCase(pass.charAt(p))
	            		&&Character.isDigit(pass.charAt(p))&&specialCharacters.contains(Character.toString(pass.charAt(p))))
	            {
	            	return true;
	            }
	            else
	            	return false;
	        
	            }
	            //return true;
	        }
		
	return true;
		
		}
	
	public static boolean prirority1(String pass)
	{
		if(pass.length()>=7 && pass.length()<=15)
		{
			for (int p = 0; p < pass.length(); p++) 
			{
	            if (Character.isUpperCase(pass.charAt(p))&&Character.isLowerCase(pass.charAt(p))||Character.isDigit(pass.charAt(p))||specialCharacters.contains(Character.toString(pass.charAt(p))))
	            {
	            	return true;
	            }
	            else
	            	return false;
	        }
		}
		return true;
		
	}
	public static boolean prirority2(String pass)
	{
		if(pass.length()>=7 && pass.length()<=15)
		{
			for (int p = 0; p < pass.length(); p++) 
			{
	            if (Character.isUpperCase(pass.charAt(p))&&Character.isLowerCase(pass.charAt(p))||Character.isDigit(pass.charAt(p))
	            		&&specialCharacters.contains(Character.toString(pass.charAt(p))))
	            {
	            	return true;
	            }
	            else
	            	return false;
	        }
	       
			
		}
		return true;

		
	}
	public static boolean prirority3(String pass)
	{
		if(pass.length()>=7 && pass.length()<=15)
		{

			for (int p = 0; p < pass.length(); p++) 
			{
	            if (Character.isUpperCase(pass.charAt(p))&&Character.isLowerCase(pass.charAt(p))&&Character.isDigit(pass.charAt(p))
	            		||specialCharacters.contains(Character.toString(pass.charAt(p)))&&Character.isUpperCase(pass.charAt(p))&&Character.isLowerCase(pass.charAt(p))||
	            		Character.isDigit(pass.charAt(p))&&specialCharacters.contains(Character.toString(pass.charAt(p)))&&Character.isLowerCase(pass.charAt(p)))
	            {
	            	return true;
	            }
	            else
	            	return false;
	        
	        }
			
		}
		return true;

		
	}
}
		
	
	


