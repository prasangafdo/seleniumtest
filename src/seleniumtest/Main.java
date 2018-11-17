package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver","/seleniumtest/selenium/chromedriver.exe");

		driver.get("https://www.seleniumhq.org/download/");
		
	}

}
