package com.baseutils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
		
	public static void broswerLaunch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Inheritance\\jar\\New folder\\version13\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void maximizeWindow()
{
	driver.manage().window().maximize();
}

	public static void getUrl( String url)
{
	driver.get(url);
}

	public static void textBox(By by,String str)
{
	driver.findElement(by).sendKeys(str);
}

	public static void click (WebElement r)
{
	r.click();
}

	public static WebElement element(By by)
{
	return driver.findElement(by);
}


	public static void wait1()
{
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
}

	public static void close()
	{
		driver.close();
	}



	



}
