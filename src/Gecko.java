import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gecko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\Documents\\drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the browser
		
		driver.manage().window().maximize();
		
		driver.quit();
		
		
		

	}

}
