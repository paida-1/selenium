package com.TestNg.concepts;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class_C {
	
	@Test
	
	public void TC_4() 
	{
		System.out.println("TC_4");
	}
	
   @BeforeSuite
	
	public void openbrowser() 
	{
		System.out.println("openbrowser");
	}

}
