package packone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synch {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.bharatmatrimony.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// Clicking On Telugu Link
		driver.findElement(By.xpath("//a[@href='//www.telugumatrimony.com/']")).click();
		// Importing Webdriverwait
		WebDriverWait ww=new WebDriverWait(driver, 30);
		ww.until(ExpectedConditions.titleContains("Telugu"));	
		ww.until(ExpectedConditions.numberOfElementsToBe(By.tagName("a"), 20));
		ww.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("a"), 50));
		ww.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("NAME"))));
		ww.until(ExpectedConditions.urlContains("Telugu"));
				
		driver.findElement(By.id("REGISTERED_BY")).sendKeys("Brother");
		//Thread.sleep(60000);
		driver.findElement(By.id("NAM")).sendKeys("abcdef");
		
	}

}
