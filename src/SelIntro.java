import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class SelIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Automating the Homepage using Chrome Driver
		
     		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\drivers\\chromedriver.exe");
		
		//Invoke the browser
		
		WebDriver driver = new 	ChromeDriver();
		
		
		//Maximize the browser
		
		driver.manage().window().maximize();
		
		//close the browser
		
		driver.close();
		driver.quit();
		
	

		
		

	}

}
