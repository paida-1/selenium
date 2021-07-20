package com.Alert_Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertMessage {
	@Test
	public void AlertMessageEx() 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    driver.findElement(By.partialLinkText("Sign in")).click();
	    driver.findElement(By.name("proceed")).click();
	    
	    Alert a=driver.switchTo().alert();
	    a.accept();
	    driver.close();
	}

}
