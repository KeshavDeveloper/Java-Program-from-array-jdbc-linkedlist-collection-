package org.bankDemo;

public class HDFC_IMPL implements Bank
{
	private final String BNAME;
	
	public HDFC_IMPL()
	{
		BNAME="HDFC";
		
		
	}
	public String getBankName()
	{
		return BNAME;
	}
	

}
