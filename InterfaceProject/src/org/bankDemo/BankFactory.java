package org.bankDemo;

public class BankFactory extends AbstractFactory
{
	
	public Bank getBank(String bank){  
	      if(bank == null){  
	         return null;  
	      }  
	      if(bank.equalsIgnoreCase("HDFC")){
    return new HDFC_IMPL();  
  } else if(bank.equalsIgnoreCase("ICICI")){  
     return new ICICI_IMPL();  
  } else if(bank.equalsIgnoreCase("SBI")){  
     return new SBI_IMPL();  
  }  
  return null;  
}  
public Loan getLoan(String loan) {  
  return null;  
} 

}
