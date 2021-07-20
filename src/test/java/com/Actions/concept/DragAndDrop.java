package com.Actions.concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	@Test
	public void DragandDropbox() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    driver.findElement(By.partialLinkText("Droppable")).click();
	    Thread.sleep(2000);
	    
	   
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
	    WebElement drag=driver.findElement(By.id("draggable"));
	    WebElement drop=driver.findElement(By.id("droppable"));
	    
	    
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.partialLinkText("Resizable")).click();
		
	    
	    
	    
		
	}

}
