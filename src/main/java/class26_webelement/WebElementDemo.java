package class26_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		WebElement username=driver.findElement(By.id("email1"));
		
		username.sendKeys("mukesh@email.com");
		
		try 
		{
			Thread.sleep(2000);
			
		} catch (InterruptedException e) 
		{
			
		}
		
		username.clear();
		
		username.sendKeys("otwani@email.com");
		
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		
		username.clear();
		
		username.sendKeys("admin@email.com");
		
		driver.quit();
		

	}

}
