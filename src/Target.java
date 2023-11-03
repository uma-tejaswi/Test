import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\drivers\\chromedriver.exe");
		
		
		//Invoke the browser
		
		WebDriver driver = new 	ChromeDriver();
		
		
		//Maximize the browser
		
		driver.manage().window().maximize();
		
		//launch the target demo
		
		driver.get("https://www.target.com/");
		
		String ProName=	driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[2]/a")).getText();
		
		//System.out.println(ProName);
		
		
		ArrayList<String> proArray = new ArrayList<String>();
		
		List <WebElement> ProList = driver.findElements(By.xpath("//*[@class='styles__DesktopLinkContainer-sc-8s5b77-4 bfEzUq']"));
		//0th index - icon
		//	System.out.println(ProList);
			
		int proSize = ProList.size();
		System.out.println(proSize);
		for(int i=1; i<=proSize+1; i++) 
		{
			
			/*if(i==3) {
				i++;
			}*/
			System.out.println("The value of i is: " +i);
			
		String ProNames =	driver.findElement(By.xpath("//*[@id='headerPrimary']/div["+i+"]/a")).getText();
		System.out.println(ProNames);

		
	}
	
	}
}