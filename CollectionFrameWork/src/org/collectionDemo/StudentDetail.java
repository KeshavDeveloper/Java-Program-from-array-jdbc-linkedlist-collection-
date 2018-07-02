package org.collectionDemo;

public class StudentDetail 
{
	String name;
	int rollNo;
	int idNo;
	StudentDetail(String name,int rollNo,int idNo)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.idNo=idNo;
		
	}
	public String toString()
	{
		return name+"\t"+rollNo+"\t"+idNo;
	}

}
