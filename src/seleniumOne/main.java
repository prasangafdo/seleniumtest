package seleniumOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver","/selenium/chromedriver.exe");
	}

}
