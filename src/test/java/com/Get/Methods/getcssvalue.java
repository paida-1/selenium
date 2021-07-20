package com.Get.Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getcssvalue {
	@Test
	public void cssvalue() 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		String colour=driver.findElement(By.name("FirstName")).getCssValue("color");
		System.out.println("Font colour:"+colour);
		
		String font_size=driver.findElement(By.name("FirstName")).getCssValue("font-size");
		System.out.println("Font size:"+font_size);
		
		String dude=driver.findElement(By.name("FirstName")).getCssValue("width");
		System.out.println("width:"+dude);
		
		String pop=driver.findElement(By.name("FirstName")).getCssValue(" background-color");
		System.out.println("bgcolour:"+pop);
		
		String bob=driver.findElement(By.name("FirstName")).getCssValue("vertical-align");
		System.out.println("v-align:"+bob);
		
	} 

}
