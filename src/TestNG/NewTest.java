package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	  @AfterClass
	  public void afterClass() {
		 
		  System.out.println("This is executed after all tests");
	  }
	  
  @Test (priority=3)
  public void f() {
	  
	  System.out.println("Bye");
  }
  
  @Test (priority=2)
  public void HelloWorld() {
	  
	  System.out.println("Hello World");
  }
  
  @Test (priority=1)
  public void hi() {
	  
	  System.out.println("Hi");
  }
  @BeforeClass
  public void beforeClass() {
	 /* System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\drivers\\chromedriver.exe");
		
	  
		
		//Invoke the browser
		
		WebDriver driver = new 	ChromeDriver();
		
		
		//Maximize the browser
		
		driver.manage().window().maximize();
		
		//launch the target demo
		
		driver.get("https://www.target.com/");*/
	  System.out.println("This is executed before any tests");
	  
  }



}
