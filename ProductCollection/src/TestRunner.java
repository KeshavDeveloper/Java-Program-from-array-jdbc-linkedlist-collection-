import java.util.Scanner;

public class TestRunner 
{
	static Scanner sc=new Scanner(System.in);
	static Book readBook()
	{
	
		
		System.out.println("enter your id name and price of your Book:");
		return new Book(sc.nextInt(),sc.next(),sc.nextDouble());
		
	}
	static Pen readPen()
	{
		System.out.println(" Enter id ,price and color of Pen");
		return new Pen(sc.nextInt(),sc.nextDouble(),sc.next());
	}
	public static void main(String[] args) 
	{

	

}
}
