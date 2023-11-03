package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Carloan {
  @Test
  public void Maruti() {
	  
	  System.out.println("This is Maruti Loan");
  }
  
  @Test(groups = {"Smoke"})
  public void Honda() {
	  
	  System.out.println("This is Honda Loan");
  }
  
  @BeforeTest
  @Test
  
  public void beforeTest() {
	  
	  System.out.println("This is executed 1st of Loans");
  }
  
  @AfterTest
  @Test
  
  public void afterTest() {
	  
	  System.out.println("This is executed last of Loans");
  }
}
