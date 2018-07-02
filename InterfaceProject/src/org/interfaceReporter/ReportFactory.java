package org.interfaceReporter;

import java.util.Scanner;

public class ReportFactory 
{
 
	static IReport getObject()
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("enter type of Report:-");
	String type=sc.next();
	if(type.equalsIgnoreCase("pdf")||type.equalsIgnoreCase("PDf")||type.equalsIgnoreCase("Pdf"))
	{
		PdfReporter p=new PdfReporter();
		return p;
	}
	else if(type.equalsIgnoreCase("Browser")||type.equalsIgnoreCase("browser"))
	{
		BrowserReporter b=new BrowserReporter();
		return b;
	}
	else if(type.equalsIgnoreCase("excel")||type.equalsIgnoreCase("Excel"))
	{
		ExcelReporter e=new ExcelReporter();
		return e;
	}
	else
		return null;
		
	}
	
	
	
	
	
}
