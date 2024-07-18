package class25_selenium_gettingStarted;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest5 {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("https://www.w3.org/TR/webdriver1/#get-title");
		
		driver.get("https://www.selenium.dev/");
		
		driver.get("https://www.selenium.dev/documentation/selenium_manager/");
		
		driver.navigate().back();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.navigate().refresh();
		
		driver.navigate().refresh();
		
		String title=driver.getTitle();
		
		System.out.println("Current title is "+title);
		
		String url=driver.getCurrentUrl();
		
		System.out.println("URL is "+url);
		
		driver.quit();
		

	}

}
