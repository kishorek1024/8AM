package packone;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		// Clicking on DataPolicy Link
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		//driver.quit();
		// Getting session ID's of Windows
		Set<String> windows=driver.getWindowHandles();
		ArrayList a=new ArrayList(windows);
		
		driver.switchTo().window((String)a.get(0)).findElement(By.id("email")).sendKeys("Kishore");
		Thread.sleep(5000);
		driver.switchTo().window((String)a.get(1)).findElement(By.id("pass")).sendKeys("abcdef");
		
		
		/*int i;
		for(i=0; i<a.size(); i++){
			System.out.println(driver.switchTo().window((String)a.get(i)).getTitle());
			List<WebElement> links=driver.switchTo().window((String)a.get(i)).findElements(By.tagName("a"));
			System.out.println(links.size());
			driver.switchTo().window((String)a.get(i)).close();
		}
*/
	}

}
