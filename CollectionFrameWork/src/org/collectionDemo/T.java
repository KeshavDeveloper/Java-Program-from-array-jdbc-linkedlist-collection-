package org.collectionDemo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Set;
public class T 
{
	public static void main(String[] args) 
	{
		Map m=new HashMap();
		m.put(1, "keshav");
		m.put(2, "rupak");
		m.put(3, "gaurav");
		Set keys=m.keySet();
		for(Object o:keys)
		{
			System.out.println(o);
		}
		
		
	
	}
	

}
