import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\drivers\\chromedriver.exe");
		
		
		//Invoke the browser
		
		WebDriver driver = new 	ChromeDriver();
		
		
		//Maximize the browser
		
		driver.manage().window().maximize();
		
		//launch the target demo
		
		driver.get("https://www.ilovepdf.com/jpg_to_pdf");
		
		driver.findElement(By.id("pickfiles")).click();
		
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\ADMIN\\Documents\\AutoIT\\FileUpload.exe");
		
		
	}

}
