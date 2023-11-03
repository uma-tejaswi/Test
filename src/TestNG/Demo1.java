package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	

  @Test
  public void TestDemo1() {
	  
	  System.out.println("This is a TestDemo1");
	  
  }
  
  @Test
  public void TestDemo2() {
	  
	  System.out.println("This is a TestDemo2");
	  
  }
  
  @BeforeTest
  @Test
  
  public void beforeTest() {
	  
	  System.out.println("This is executed 1st");
  }
  
  @AfterTest
  @Test
  
  public void afterTest() {
	  
	  System.out.println("This is executed last");
  }
  
  
  @BeforeSuite
  @Test
  public void bfsuite() {
	  
	  System.out.println("This is executed beofre suite");
  }
  
  @AfterSuite
  @Test
  public void afsuite() {
	  
	  System.out.println("This is executed after suite");
  }
}
