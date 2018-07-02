
public class Empolyee 
{
	private int id;
	private double salary;
	private String name;
	
	
	public int getid()
	{
		return id;
		
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return this.id+ "\t"+this.salary+ "\t" +this.name;

	}
	public static void main(String[] args)
	{
		Empolyee e=new Empolyee();
		
		e.setid(123);
		e.setSalary(10000.50);
		e.setName("RUPAK KUMAR");
		System.out.println(e);
		
		
	}

}
