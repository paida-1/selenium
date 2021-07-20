package com.Get.Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class get_TagandAttribute {
	@Test
	public void TagAttribute() 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		String tag=driver.findElement(By.name("FirstName")).getTagName();
		System.out.println("Tagname:"+tag);
		
		driver.findElement(By.name("FirstName")).sendKeys("phani");
		
		String attr=driver.findElement(By.name("FirstName")).getAttribute("value");
		System.out.println("attri:"+attr);
		
	}

}
