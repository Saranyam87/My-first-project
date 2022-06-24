package com.automationpractice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day3 {
	WebDriver driver;
	
	public void startBrowser(String url)
    {
  	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\write\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.get(url);
    }
	
	public void classNameMethod()
	{
		startBrowser("http://automationpractice.com");
		int Sliders= driver.findElements(By.className("homeslider-container")).size();
		System.out.println(Sliders);
	}
	
	public void xpathValidation()
	{
		startBrowser("https://itera-qa.azurewebsites.net/");
		driver.findElement(By.xpath("/html/body/nav/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys("saranya");
		driver.findElement(By.id("phone")).sendKeys("9943005888");
		driver.findElement(By.xpath("//input[@placeholder='Enter email']")).sendKeys("saranyam1987@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("****");	
	    driver.findElement(By.id("address")).sendKeys("E3104,sreevatsa Global Village,Chinnavedamapatti,Coimbatore-641609");
	    //driver.findElement(By.name("btn btn-primary")).click();
	
	    driver.findElement(By.id("female")).click();//gender
	    driver.findElement(By.id("friday")).click();
	    driver.findElement(By.xpath("//option[@value='6']")).click();//country planned to travel
	    driver.findElement(By.xpath("//label[@for='2years']")).click();// years of exp
	    driver.findElement(By.xpath("//label[@for='selenium']")).click();//automation tools
	    driver.findElement(By.xpath("//label[@for='cucumber']")).click();//automation tools
	    driver.findElement(By.id("inputGroupFile02")).click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Day3 d=new Day3();
	    d.xpathValidation();
	} 


}
