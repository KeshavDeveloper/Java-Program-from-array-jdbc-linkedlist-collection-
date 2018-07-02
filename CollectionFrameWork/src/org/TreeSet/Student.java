package org.TreeSet;

public class Student implements Comparable
{
	int id;
	String name;
	double percentage;
	
	
	
	Student(int id,String name,double percentage)
	{
		this.id=id;
		this.name=name;
		this.percentage=percentage;
		
	}
	public String toString()
	{
	return id+"\t"+name+"\t"+percentage;
	}
	public int compareTo( Object o)
	{
	Student s=(Student)o;
    if(id>s.id){  
	        return 1;  
    }else if(id<s.id){  
	        return -1;  
	    }else{  
    return 0;  	    }  	}

}
