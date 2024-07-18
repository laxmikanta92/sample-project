package class25_selenium_gettingStarted;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Wallet1 {
	WebDriver driver;
	
  @Test(priority=0)
  public void Browserlaunch() {
	//WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://wallet.hutechweb.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 
  }

 
  
 @Test(priority=2)
 public void signin() throws InterruptedException 
 {
	 	 
	 driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("9066600062");
	 
	 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
     
	 driver.findElement(By.xpath("//input[@name=\"OTP\"]")).sendKeys("123456");
	
	 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
 }
 @Test(priority = 1)
 public void Signup() throws InterruptedException 
 {
	 
	  driver.findElement(By.xpath("//button[@type=\"button\"][2]")).click();
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("mahalaxmi..");
		
		driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("9066600062");
		
	    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	    
		driver.findElement(By.xpath("//input[@name=\"OTP\"]")).sendKeys("123456");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
}



  @Test(priority = 3)
  public void CreateOrg() throws InterruptedException 
  {
	  
	  driver.findElement(By.xpath("//input[@aria-invalid=\"false\"]")).sendKeys("Delcom technologies");
	  
	  driver.findElement(By.xpath("//input[@name=\"orgcode\"]")).sendKeys("DEL");
	  
	  driver.findElement(By.xpath("//input[@name='cin']")).sendKeys("U64120GJ1987PLC010167");
	  
	  driver.findElement(By.xpath("(//div[@id=\"demo-multiple-name\"])[1]")).click();
	  
	  driver.findElement(By.xpath("//li[.=\"Logistics\"]")).click();
	  
	  driver.findElement(By.xpath("(//div[@id=\"demo-multiple-name\"])[2]")).click();
	  
	  driver.findElement(By.xpath("//li[.=\"Public Limited\"]")).click();
	  
	  driver.findElement(By.xpath("//input[@value=\"Yes\"]")).click();
	  
	  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	  
  }
  @Test(priority = 5)
  public void KYCVerification() throws InterruptedException
  {
	  driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("09BMWPD0058A1Z8");
	  
	  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	  
	  driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
	  
	  driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();
	  
	  driver.findElement(By.xpath("//input[@name=\"PAN\"]")).sendKeys("BMWPD0058A");
	  
	  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	  
	  driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
	  	
	  driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();
	  
	  driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("HGLPM0144M");
	  
	  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	  
	  driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
	  
	  driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();
	  
	  driver.get("https://wallet.hutechweb.com/verificationSuccess");



	 
  }
}