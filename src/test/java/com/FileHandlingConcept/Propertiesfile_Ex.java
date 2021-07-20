package com.FileHandlingConcept;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Propertiesfile_Ex {
	@Test
	public void Properties() throws IOException 
	{
		FileInputStream fils=new FileInputStream("F:\\Testing\\eclipse\\New folder\\Selenium_Peoject\\selenium.properties") ;
		java.util.Properties prop=new java.util.Properties();
		prop.load(fils);
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("dude"))).click();
		driver.findElement(By.xpath(prop.getProperty("boss"))).click();
		driver.close();
	}

}
