package org.interfaceReporter;

public class ReportGenerator
{
	public static void main(String[] args) 
	{
		
		IReport i=ReportFactory.getObject();
		i.report();
	}

}
