package com.TestNg.concepts;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Class_A {
	@AfterSuite
	
	public void closerbrowser() 
	{
		System.out.println("closer browser");
	}
	@Test
	public void TC_03() 
	{
		System.out.println("TC_03");
	}
}
