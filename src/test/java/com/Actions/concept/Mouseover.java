package com.Actions.concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouseover {
	@Test
	public void TC_registration() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.nopcommerce.com/en");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		
			
	   // This is called Mouseoveractions
			
			Actions act=new Actions(driver);
		    WebElement pop= driver.findElement(By.xpath("//a[@class='userlink']"));   
			act.moveToElement(pop).build().perform();
			driver.findElement(By.xpath("//a[@class='ico-register']")).click();     //
			
			driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("phani");
			driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("varma");
			

      }
}
