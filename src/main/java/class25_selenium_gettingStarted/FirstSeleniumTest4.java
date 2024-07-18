package class25_selenium_gettingStarted;

import org.openqa.selenium.edge.EdgeDriver;

public class FirstSeleniumTest4 {

	public static void main(String[] args) {

		/*
		 * Every browser have a driver class
		 * 
		 */

		EdgeDriver driver = new EdgeDriver();

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
