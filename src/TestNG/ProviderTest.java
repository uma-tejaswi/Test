package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProviderTest {
	
	
   
  @Test (dataProvider="getData")
  public void credentials(String email, String password){
	  
	  System.out.println(email);
	  System.out.println(password);
  }
  
  @DataProvider
  public Object[][] getData()
  {
	  
	  
	  Object[][] data = new Object[2][2];
	  
	  
	data[0][0]= "u.vasamsetti@gmail.com";
	data[0][1] = "uma";
	
	
	data[1][0] = "vasamsettiteja@gmail.com";
	data[1][1] = "teja";
	
	
	
	
	return data;
	
	
  }
  
}