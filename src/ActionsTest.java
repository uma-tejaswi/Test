import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//Chrome Driver
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\drivers\\chromedriver.exe");
		
		//Invoke the browser
		
		WebDriver driver = new 	ChromeDriver();
		
		
		//Maximize the browser
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		
		
		//Actions Class
		Actions build = new Actions(driver);
		
		WebElement alerts =driver.findElement(By.xpath("//span[text()=\"Alerts\"]"));
		
		build.scrollToElement(alerts).build().perform();
		
driver.findElement(By.id("promtButton")).click();
		
		//Alerts - get the text
		String alert=driver.switchTo().alert().getText();
		System.out.println(alert);
		
		Thread.sleep(2000);
		/*//Dismiss
		driver.switchTo().alert().dismiss();
		
		//Accept
		driver.switchTo().alert().accept();*/
		
		
		driver.switchTo().alert().sendKeys("Test");
		
		driver.quit();
		
	}

}
