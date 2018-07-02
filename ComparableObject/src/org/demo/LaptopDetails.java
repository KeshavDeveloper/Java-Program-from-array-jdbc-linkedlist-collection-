package org.demo;

public class LaptopDetails implements Comparable
{
	String brand;
	int ram;
	int price;
public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString()
	{
		return brand+"\t"+ram+"\t"+price;
	}
	
	public LaptopDetails(String brand,int ram,int price)
	{
		this.brand=brand;
		this.ram=ram;
		this.price=price;
	}
	@Override
	public int compareTo(Object o) {
		LaptopDetails l=(LaptopDetails)o;
		if(this.ram>l.ram)
		{
			return 1;
		}
		else if(this.ram<l.ram)
		{
			return -1;
		}
		else
			return 0;
		
	
	}
	

}
