package org.jspiderDemo.bikeCollection;

public class Factory 
{
	
	   Collection    makeOrder(int item)
	     {
	    	 
	    	 for(int i=0;i<item;i++)
	    	 {
	    		 Bike b=new Bike();
	    		 System.out.println("item is created");
	    	 }
	    	 Collection cOBike =new Bike();

	    	 return cOBike;
	     }
	

}
