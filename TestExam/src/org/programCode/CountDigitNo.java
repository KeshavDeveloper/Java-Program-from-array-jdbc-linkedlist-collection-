package org.programCode;

public class CountDigitNo
{
	
	public static void main(String[] args) 
	{
		
		int x=256;
		int count=0;
		int sum=0;
		while(x>0)
		{
			int r=x%10;
			sum=sum+r;
			x=x/10;
			count++;
			
		}
		System.out.println(count+ "digit");
		
	}

}
