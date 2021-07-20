package com.TestNg.concepts;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Class_B {
	@BeforeTest
	
	public void TC_2() 
	{
		System.out.println("TC_2");
	}
	
@BeforeTest
	
	public void TC_1() 
	{
		System.out.println("TC_1");
	}
	

}
