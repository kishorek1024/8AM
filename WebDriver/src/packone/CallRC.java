package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class CallRC {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("Kishore");
		WebDriverBackedSelenium s=new WebDriverBackedSelenium(driver, "http://");
		s.type("id=pass", "abcdef");
		driver.findElement(By.id("day")).sendKeys("24");
		s.select("id=month", "Apr");
		driver.findElement(By.id("year")).sendKeys("2011");
		
		
		
		
		
		

	}

}
