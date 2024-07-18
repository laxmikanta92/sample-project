package class25_selenium_gettingStarted;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest3 {

	public static void main(String[] args) {

		/*
		 * Every browser have a driver class
		 * 
		 */

		FirefoxDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().window().minimize();

		driver.manage().window().maximize();

		driver.manage().window().minimize();

		driver.manage().window().maximize();

		driver.manage().window().minimize();

		driver.get("https://www.selenium.dev/");

		String title = driver.getTitle();

		System.out.println("Current title is " + title);

		String url = driver.getCurrentUrl();

		System.out.println("URL is " + url);

		driver.quit();

	}

}
