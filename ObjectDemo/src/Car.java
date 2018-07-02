import java.util.*;

public class Car 
{
	public String toString()
	{
		return "BMW";
	}
	public static void main(String[] args) 
	{
		Car c=new Car();
		
		String h=c.toString();
		System.out.println(h);
	}
}
