
public class Emplyee 
{

 

int id;
double salary;
String name;
	
	public Emplyee(int id,double salary,String name)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	
	public String toString()
	{
		return this.id+ "\t"+this.salary+"\t"+this.name;
	}
	public static void main(String[] args) 
	{
		Emplyee e=new  Emplyee(142,10000.00,"RUPAK");
		System.out.println(e);
		
	}
	

}



