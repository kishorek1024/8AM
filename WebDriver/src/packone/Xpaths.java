package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpaths {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("html/body/div/div/div[2]/a")).click();

	}

}
