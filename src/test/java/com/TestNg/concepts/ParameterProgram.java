package com.TestNg.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterProgram {
	@Parameters({"url","username","password"})
	@Test(testName="FB login")
	
	public void loginpage(String url, String username, String password) 
	{
	
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	driver.findElement(By.xpath("//*[@name='login']")).click();	
	}

}
