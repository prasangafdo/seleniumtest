package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		// Created by Prasanga Fernando

		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver","/seleniumtest/selenium/chromedriver.exe");

		//driver.get("https://www.seleniumhq.org/download/");
		driver.get("file:///C:/Users/Prasanga%20Fernando/Documents/Development/Web/Bootstrap/form.html?");
		
		//driver.manage().window().maximize();//To maximize the window.
		
		driver.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]")).sendKeys("fprasanga@virtusa.com");
		
		driver.findElement(By.xpath("//*[@id=\"btn-submit\"]")).click();
		
		driver.navigate().back();
		
		
		////*[@id="exampleInputEmail1"]
		
	}

}
