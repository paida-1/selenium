package com.Selenium.Examples;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipcartproject {
	@Test
	
	public void Flipcartex() 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	     Actions act=new Actions(driver);
	     act.sendKeys(Keys.ESCAPE).build().perform();
	     
	     driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung mobiles");
	     act.sendKeys(Keys.ENTER).build().perform();
	     
	     java.util.List<WebElement> ele=driver.findElements(By.className("_1YokD2 _3Mn1Gg"));
	     
	 	for(int i=0;i<ele.size();i++) 
		{
			
			String bob=ele.get(i).getText();
			System.out.println(bob);
		}
		//driver.close();
	}

}
