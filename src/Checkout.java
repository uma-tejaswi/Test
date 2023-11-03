import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\drivers\\chromedriver.exe");
		
		//Invoke the browser
		
		WebDriver driver = new 	ChromeDriver();
		
		
		//Maximize the browser
		
		driver.manage().window().maximize();
		
		//launch the sauce demo
		driver.get("https://www.saucedemo.com/");
		
		//login
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		//product detail page
		driver.findElement(By.id("item_4_title_link")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		driver.findElement(By.id("checkout")).click();
		
		//checkout page
		driver.findElement(By.id("first-name")).click();
		driver.findElement(By.id("first-name")).sendKeys("Vasamsetti");
		driver.findElement(By.id("last-name")).click();
		driver.findElement(By.id("last-name")).sendKeys("Uma Tejaswi");
		driver.findElement(By.id("postal-code")).click();
		driver.findElement(By.id("postal-code")).sendKeys("533006");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		
		driver.close();
		
		
		
		

	}

}
