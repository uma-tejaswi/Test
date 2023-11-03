package TestNG;

import org.testng.annotations.Test;

public class HomeLoan {
  @Test
  public void Villa() {
	  
	  System.out.println("This is a villa loan");
  }
  
  @Test(groups = {"Smoke"})
  public void Duplex() {
	  
	  System.out.println("This is a duplex loan");
  }
  
  @Test
  public void Villa1() {
	  
	  System.out.println("This is a villa loan");
  }
  
  @Test
  public void Villa2() {
	  
	  System.out.println("This is a villa loan");
  }
  
  
}
