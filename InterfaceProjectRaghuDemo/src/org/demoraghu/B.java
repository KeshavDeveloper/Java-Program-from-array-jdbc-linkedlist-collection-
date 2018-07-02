package org.demoraghu;

public interface B extends A
{
	default void k()
	{
		A.super.a();
		
	}

}
