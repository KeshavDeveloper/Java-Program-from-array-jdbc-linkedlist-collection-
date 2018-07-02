package org.demoObject;

public class IteratorPatternDemo {


		public static void main(String[] args) {  
	          CollectionOfName cmpnyRepository = new CollectionOfName();  
	            
	          for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){  
	              String name = (String)iter.next();  
	              System.out.println("Name : " + name);  
	           }      
	    }  
	

	}


