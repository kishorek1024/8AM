package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validations {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.bharatmatrimony.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ID")).sendKeys("abcdef");
		
		/*WebElement name=driver.findElement(By.id("NAME"));
		System.out.println(name.getAttribute("class"));
		System.out.println(name.getTagName());
		System.out.println(name.getLocation());
		System.out.println(name.getSize());*/
		
		String a=driver.getTitle();
		System.out.println(a);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		
		driver.navigate().back();
		driver.navigate().forward(); 
		driver.navigate().refresh();
		driver.navigate().to("http://yahoomail");
		
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().window().getPosition();
		driver.manage().window().getSize();


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*boolean a=driver.findElement(By.id("NAME")).isDisplayed();
		if(a==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		boolean b=driver.findElement(By.id("NAME")).isEnabled();
		if(b==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");*/
		
		
		

	}

}
