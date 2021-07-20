package com.Get.Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleTabs_Ex {
	@Test
	public void multipletabs() 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	  	driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//new tab
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"/t");
		driver.get("https://en.wikipedia.org/wiki/Phani");
		
		//switch tab
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"/t");
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("phani");
		
		
	}

}
