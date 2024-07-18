package class26_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		WebElement username=driver.findElement(By.id("email1"));
		
		username.clear();
		
		username.sendKeys("mukesh@email.com");
		
		System.out.println(username.isDisplayed());
		
		System.out.println(username.isEnabled());
		
		// radio button and checkboxes
		//System.out.println(username.isSelected());
		
		System.out.println(username.getAttribute("placeholder"));
		
		System.out.println(username.getCssValue("border"));

	}

}
