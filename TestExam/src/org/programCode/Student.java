package org.programCode;

public class Student implements Comparable
{
	int id;
	String name;
	double percentage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String toString()
	{
		return  id+ "\t"+name+"\t"+percentage;
	}
	Student(int id,String name,double percentage)
	{
		this.id=id;
		this.name=name;
		this.percentage=percentage;
	}
	@Override
	public int compareTo(Object o) 
	{
		
	Student s=(Student)o;
		// TODO Auto-generated method stub
	if(this.id>s.id)
	{
		return -1;
	}
	else if(this.id<s.id)
	{
		return 1;
	}
	
	else
		return 0;
		
		
	}
	
}
