package com.Selenium.Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FB_Registration {
	@Test
	public void TC_FBregistration() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(test(),'creat new account')]")).sendKeys("click");
		Thread.sleep(5);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("text007");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("test007@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("test@1234");
		
		Select day=new Select(driver.findElement(By.xpath("//input[@id='password_step_input']")));
		day.selectByVisibleText("14");
		
		Select month=new Select(driver.findElement(By.xpath("//input[@id='month']")));
        month.selectByVisibleText("sep");
        
        Select year=new Select(driver.findElement(By.xpath("//input[@id='year']")));
        year.selectByVisibleText("2001");
        
        driver.findElement(By.xpath("//input[@value='2']"));
        driver.findElement(By.xpath("//input[@name='websubmit']"));
        

	    WebElement ele=driver.findElement(By.xpath(" "));
		String Expectedtext=ele.getText();
		
		String Actualtext=" ";
		
		if(Expectedtext.equals(Actualtext))
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
		
	
        
	}

}
