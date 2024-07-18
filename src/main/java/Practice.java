import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("Application loaded");
		String text=driver.findElement(By.className("submit-btn")).getText();
	    System.out.println(text);
	    boolean status=text.contains("Sign in");
	    System.out.println(status);
	    driver.quit();
	}

}
