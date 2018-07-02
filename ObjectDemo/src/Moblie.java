
public class Moblie 
{
	String model;
	double price;
	String colour;
	
	public Moblie(String model,double price,String colour)
	{
		this.model=model;
		this.price=price;
		this.colour=colour;
	}
	
	public String toString()
	{
		return this.model+ "\t"+this.price+"\t"+this.colour;
	}
	public static void main(String[] args) 
	{
		Moblie m=new  Moblie("SAMSUNG",10000.00,"PURPLE");
		System.out.println(m);
		
	}
	

}
