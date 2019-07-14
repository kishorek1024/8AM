package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BO {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\WD8\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("Kishore");
		driver.findElement(By.id("pass")).sendKeys("abcdef");
		
		driver.findElement(By.id("day")).sendKeys("24");
		driver.findElement(By.id("month")).sendKeys("Apr");
		
		driver.findElement(By.id("u_0_9")).click();
		driver.findElement(By.id("email")).clear();
		

	}

}
