package com.Screenshot.Ex;

import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreenshot_Ex {
	private static final String FileUtilts = null;

	@Test
	public void Screenshot() 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 //   FileUtilts.copyfile(f,new File("C:\\Users\\user\\OneDrive\\Desktop\\jquery.jpeg"));
//	 For screen shot we have to change dependency into another selenium version
	
	}
		
	
}