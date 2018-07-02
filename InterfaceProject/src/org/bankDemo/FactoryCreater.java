package org.bankDemo;

public class FactoryCreater
{
    public static AbstractFactory getFactory(String choice){  
        if(choice.equalsIgnoreCase("Bank")){  
           return new BankFactory();  
        } else if(choice.equalsIgnoreCase("Loan")){  
           return new LoanFactory();  
        }  
        return null;  
     }  
}
