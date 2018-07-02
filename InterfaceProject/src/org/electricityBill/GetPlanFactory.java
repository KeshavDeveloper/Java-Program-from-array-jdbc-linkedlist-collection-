package org.electricityBill;

public class GetPlanFactory 
{
	  
	
	public Plan getplan(String type)
	{
		
		if(type==null)
		{
			return null;
		}
		if(type.equalsIgnoreCase("DOMESTIC"))
		{
			return new DomesticPlan();
			
		}
		 else if(type.equalsIgnoreCase("COMMERCIAL"))
		{
			return new CommercialPlan();
			
		}
		 else if(type.equalsIgnoreCase("INSTITUTIONAL"))
		{
			return new InstitutionalPlan();
		}
		 else
			 return null;
		
		
		
		
	}

}
