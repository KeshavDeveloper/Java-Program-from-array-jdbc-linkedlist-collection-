
public class ProductUsingToStringMethod 
{
	double price;
	int quantity;
	String type;
	public ProductUsingToStringMethod(double price,int quantity,String type)
	{
		this.price=price;
		this.quantity=quantity;
		this.type=type;
		
	}

	public String toString()
	{
		return price +"\t"+quantity+"\t"+type;
	}
	public static void main(String[] args) 
	{
		ProductUsingToStringMethod p=new ProductUsingToStringMethod(100, 2, "rice");
		System.out.println(p);
		
	}
}
