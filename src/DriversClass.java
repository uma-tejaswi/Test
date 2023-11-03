import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class DriversClass {
	
	public void ChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Documents\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome Driver launched successfully");
		
	}
	public void GeckoDriver() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\Documents\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Gecko Driver launched successfully");
	}
	public void EdgeDriver() {
System.setProperty("webdriver.edge.driver","C:\\Users\\ADMIN\\Documents\\drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		System.out.println("Edge Driver launched successfully");
		
		
	}	

}
