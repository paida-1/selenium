package com.Get.Methods;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Linktext {
	@Test
	public void linktest() 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		java.util.List<WebElement> ele= driver.findElements(By.tagName("a"));
		
		for(int i=0;i<ele.size();i++) 
		{
			String pop=ele.get(i).getAttribute("href");
			System.out.println(pop);
			
			String bob=ele.get(i).getText();
			System.out.println(bob);
		}
	}

}
