package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AllWebsite {
	 @AfterClass
	  public void afterClass() {
		 
		  System.out.println("This is executed after all tests");
	  }
	 @Test (priority=1)
	  public void Saucedemo () {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\drivers\\chromedriver.exe");
			
			
			
			WebDriver driver = new 	ChromeDriver();
			
			
			
			
			driver.manage().window().maximize();
			
			
			driver.get("https://www.saucedemo.com/");
			
			
			driver.findElement(By.id("user-name")).click();
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			
			driver.findElement(By.id("password")).click();
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			
			driver.findElement(By.id("login-button")).click();
			
			
			driver.findElement(By.id("item_4_title_link")).click();
			driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			driver.findElement(By.id("shopping_cart_container")).click();
			driver.findElement(By.id("checkout")).click();
			
			
			driver.findElement(By.id("first-name")).click();
			driver.findElement(By.id("first-name")).sendKeys("Vasamsetti");
			driver.findElement(By.id("last-name")).click();
			driver.findElement(By.id("last-name")).sendKeys("Uma Tejaswi");
			driver.findElement(By.id("postal-code")).click();
			driver.findElement(By.id("postal-code")).sendKeys("533006");
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("finish")).click();
			
			driver.close();
			

		  
		 
	  }
	 @Test (priority=3)
	  public void Amazon () {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\drivers\\chromedriver.exe");
			
			
			//Invoke the browser
			
			WebDriver driver = new 	ChromeDriver();
			
			
			//Maximize the browser
			
			driver.manage().window().maximize();
			
			//launch the target demo
			
			driver.get("https://www.amazon.com/");
			
				
			driver.close();

		  
		  
	  }
	 @Test (priority=2)
	  public void Target() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\drivers\\chromedriver.exe");
			
			
			//Invoke the browser
			
			WebDriver driver = new 	ChromeDriver();
			
			
			//Maximize the browser
			
			driver.manage().window().maximize();
			
			//launch the target demo
			
			driver.get("https://www.target.com/");
			driver.close();
		  
		  
	  }
	 @BeforeClass
	  public void beforeClass() {
		 System.out.println("This is executed before any tests");
		  
	  }
	 }

