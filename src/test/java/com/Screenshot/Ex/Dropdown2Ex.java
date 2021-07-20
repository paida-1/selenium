package com.Screenshot.Ex;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown2Ex {
	@Test
	public void DropdownEx()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement ele= driver.findElement(By.xpath("//select[@id='Details_CompanyIndustryId']"));
		Select industry=new Select(ele);
		
		java.util.List<WebElement> company=industry.getOptions();
		System.out.println(company.size());
		
    	for(int i=1;i<company.size();i++)
		{
			String name=company.get(i).getText();
			System.out.println("name");
		}
	}

}
