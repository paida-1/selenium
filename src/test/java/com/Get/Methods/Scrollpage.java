package com.Get.Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrollpage {
	@Test
	public void Scrolling() 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		JavascriptExecutor bob=(JavascriptExecutor)driver;
		
		WebElement ele=driver.findElement(By.partialLinkText("More Cricket & Sports"));
		bob.executeScript("arguments[0].scrolintoview", ele);
		ele.click();
		
		
	}

}
