package class25_selenium_gettingStarted;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class API 
{
	
	public void Browserlaunch(WebDriver driver)
	{
		//WebDriverManager.chromedriver().setup();
		   
		  driver.get("https://wallet.hutechweb.com/");
		  driver.manage().window().maximize();
	}
	
		public static void main (String [] args)
		{
			WebDriver driver=new ChromeDriver();
			  
			API api=new API();
			api.Browserlaunch(driver);
		}
				

}
