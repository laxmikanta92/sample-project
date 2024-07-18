package class52_testngbasics;

import org.testng.annotations.Test;
import org.testng.Assert;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssignmentOne {
	WebDriver driver;
    @BeforeMethod
    public void startBrowser()
	{
    	System.out.println("getting started with browser");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("Application loaded");
	}
    @AfterMethod
    public void closeBrowser() 
    {
    	System.out.println("terminating the session");
    	driver.quit();
    	System.out.println("session terminated");
    }
    @Test(priority=1)
    public void verifyText() 
    {
      String text=driver.findElement(By.className("submit-btn")).getText();
      System.out.println("the text contains "+text);
      //boolean status=text.contains("Sign in");
      //assertTrue(status, "doesn't contain sign in");
      Assert.assertEquals(text,"Sign in","doesn't contain sign in");
    }
    @Test(priority=2)
    public void verifyErrorMessageOne() 
    {
    	driver.findElement(By.className("submit-btn")).click();
    	String text=driver.findElement(By.className("errorMessage")).getText();
    	System.out.println("the text contains "+text);
    	boolean status=text.contains("Email and Password is required");
    	Assert.assertTrue(status, "doesn't contain Email and Password is required");
    }
    @Test(priority=3)
    public void verifyErrorMessageTwo() 
    {
    	driver.findElement(By.xpath("//input[@name='email1']")).sendKeys("admin@email.com");
    	driver.findElement(By.className("submit-btn")).click();
    	String text=driver.findElement(By.className("errorMessage")).getText();
    	System.out.println("the text contains "+text);
    	boolean status=text.contains("Password is required");
    	Assert.assertTrue(status,"doesn't contain Password is required");
    }
    @Test(priority=4)
    public void verifyErrorMessageThree() 
    {
    	driver.findElement(By.xpath("//input[@name='password1']")).sendKeys("admin@123");
    	driver.findElement(By.className("submit-btn")).click();
    	String text=driver.findElement(By.className("errorMessage")).getText();
    	System.out.println("the text contains "+text);
    	boolean status=text.contains("Email is required");
    	Assert.assertTrue(status,"doesn't contain Email is required"); 	
    }
   @Test(priority=5)
   public void verifyErrorMessageFour() 
   {
	   driver.findElement(By.xpath("//input[@name='email1']")).sendKeys("admin@email2.com");
	   driver.findElement(By.xpath("//input[@name='password1']")).sendKeys("admin@1234");
	   driver.findElement(By.className("submit-btn")).click();
	   String text=driver.findElement(By.className("errorMessage")).getText();
	   System.out.println("the text contains "+text);
	   boolean status=text.contains("Email and Password Doesn't match");
	   Assert.assertTrue(status,"doesn't contain Email and Password"); 	
   }
   @Test(priority=6)
   public void verifyErrorMessageFive() 
   {
	   driver.findElement(By.xpath("//input[@name='email1']")).sendKeys("admin@email.com");
	   driver.findElement(By.xpath("//input[@name='password1']")).sendKeys("admin@123");
	   driver.findElement(By.className("submit-btn")).click();
	   String text=driver.findElement(By.className("welcomeMessage")).getText();
	   System.out.println("the text contains "+text);
	   boolean status=text.contains("Welcome Admin Manager to Learn Automation Courses");
	   Assert.assertTrue(status,"doesn't contain Welcome Admin Manager to Learn Automation Courses"); 	
   }
   
   
}
