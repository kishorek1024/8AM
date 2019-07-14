package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElements {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		/*driver.findElement(By.id("email")).sendKeys("Kishore");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("abcdef");
		driver.findElement(By.id("email")).clear();*/
		
		WebElement uid=driver.findElement(By.id("email"));
		uid.sendKeys("Kishore");
		uid.clear();
		uid.sendKeys("abcdef");
		
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("abcdef");
		pwd.clear();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
