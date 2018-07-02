package org.bankDemo;

public class SBI_IMPL implements Bank
{
	  private final String BNAME;  
      public SBI_IMPL(){  
                BNAME="SBI BANK";  
        }  
       public String getBankName(){  
                  return BNAME;  
       }  

}
