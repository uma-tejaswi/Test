package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	
   
  @Test (dataProvider="getData")
  public void credentials(String username, String password) {
	  
	  System.out.println(username);
	  System.out.println(password);
  }
  
  @DataProvider
  public Object[][] getData()
  {
	  //1st username and passowrd
	  //2nd username and password
	  //3rd username and password
	  
	  Object[][] data = new Object[3][2];
	  
	  //1st Set
	data[0][0]= "firstusername";
	data[0][1] = "firstpassword";
	
	//2nd Set
	data[1][0] = "secondusername";
	data[1][1] = "secondpassword";
	
	//3rd Set
	data[2][0] = "thirdusername";
	data[2][1] = "thirdpassword";
	
	return data;
	
	
  }
  
}