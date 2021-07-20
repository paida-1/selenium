
package com.Selenium.Examples;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class NopCommerce_Registration {
	@Test
public void TC_registration() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	 /* We can write like this.   
		driver.findElement(By.xpath("//a[@class='userlink']")).click();
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();   */
		
   // This is called Mouseoveractions
		
		Actions act=new Actions(driver);
	    WebElement pop= driver.findElement(By.xpath("//a[@class='userlink']"));   
		act.moveToElement(pop).build().perform();
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();     //
		
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("phani");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("varma");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("phani321@gmail.com");
		driver.findElement(By.xpath("//input[@name='ConfirmEmail']")).sendKeys("phani321@gmail.com");
		driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("hulk");
		driver.findElement(By.xpath("//input[@value='Check Availability']")).sendKeys("click");
		Thread.sleep(1000);
		
		Select country=new Select(driver.findElement(By.xpath("//select[@name='CountryId']")));
		country.selectByVisibleText("India");
		
		
		
		Select Timezone=new Select(driver.findElement(By.xpath("//select[@name='TimeZoneId']")));
		Timezone.selectByVisibleText("(UTC-06:00) Central America");

		driver.findElement(By.xpath("//input[@value='true']")).click();
		
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("varma1234");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("varma1234");
		
		Select companyprimarily=new Select(driver.findElement(By.xpath("//select[@name=\"Details.CompanyIndustryId\"]")));
		companyprimarily.selectByVisibleText("Develops nopCommerce extensions");
		
		Select mainactivity=new Select(driver.findElement(By.xpath("//select[@name='Details.CompanyRoleId']")));
		mainactivity.selectByVisibleText("Technical developer");
		
		Select developingextensions=new Select(driver.findElement(By.xpath("//select[@name='Details.ExtensionsDevelopmentPeriodId']")));
		developingextensions.selectByVisibleText("Over 6 years");
		
		driver.findElement(By.id("is-nop-commerce-extensions-true")).click();
		
		Select peoplework=new Select(driver.findElement(By.xpath("//select[@name='Details.CompanySizeId']")));
		peoplework.selectByVisibleText("More than 15");
		
		driver.findElement(By.xpath("//input[@name='Details.CompanyWebsiteUrl']")).sendKeys("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='register-button']")).click();
		
		
		WebElement ele=driver.findElement(By.xpath("//*[contains(text(),'Almost done! To complete your nopCommerce registration,"
				+ " we just need to verify your email address. You have just been sent an email to confirm your email address. Open the email, "
				+ "and click the link to confirm your address.')]"));
		String Expectedtext=ele.getText();
		
		String Actualtext="Almost done! To complete your nopCommerce registration,"
				+ " we just need to verify your email address. You have just been sent an email to confirm your email address. Open the email,"
				+ " and click the link to confirm your address.";
		
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
