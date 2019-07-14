package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Misc {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		List<WebElement> values=driver.findElements(By.tagName("option"));
		System.out.println(values.size());
		
		WebElement month=driver.findElement(By.id("month"));
		
		List<WebElement> valuescount=driver.findElement(By.id("month")).findElements(By.tagName("option"));
		
		List<WebElement> month_values=month.findElements(By.tagName("option"));
		System.out.println(month_values.size());
		
		
		
		/*driver.findElement(By.id("month")).sendKeys("Apr");
		WebElement month=driver.findElement(By.id("month"));
		
		Select s=new Select(month);
		s.selectByIndex(4);*/
		

	}

}
