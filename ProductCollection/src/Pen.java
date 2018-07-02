
public class Pen 
{
	int pid;
	double price;
	String color;
	

	public Pen(int pid, double price, String color) 
	{
		this.pid = pid;
		this.price = price;
		this.color = color;
	}
	@Override
	public String toString() 
	{
		return "Pen [" + pid + "," + price + "," + color + "]";
	}


}
