package class25_selenium_gettingStarted;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		
		/*
		 *  Every browser have a driver class
		 * 
		 */
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		String title=driver.getTitle();
		
		System.out.println("Current title is "+title);
		
		String url=driver.getCurrentUrl();
		
		System.out.println("URL is "+url);
		
		driver.quit();
		

	}

}
