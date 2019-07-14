package junit;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Junit_App {
	public WebDriver driver;
	@Before
	public void launchApp(){
		driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@After
	public void closeApp(){
		driver.close();
	}
	@Test
	public void T1(){
		driver.findElement(By.id("email")).sendKeys("Kishore");
		boolean a=driver.findElement(By.id("pass")).isDisplayed();
		Assert.assertEquals(true, a);
		boolean b=driver.findElement(By.id("pass")).isEnabled();
		Assert.assertEquals(true, b);		
	}
	@Ignore
	@Test
	public void T2(){
		driver.findElement(By.id("email")).sendKeys("Kishore");
		boolean a=driver.findElement(By.id("pass")).isDisplayed();
		Assert.assertEquals(true, a);
		boolean b=driver.findElement(By.id("pass")).isEnabled();
		Assert.assertEquals(true, b);	
	}
	@Test
	public void T3(){
		driver.findElement(By.id("email")).sendKeys("Kishore");
		boolean a=driver.findElement(By.id("pass")).isDisplayed();
		Assert.assertEquals(true, a);
		boolean b=driver.findElement(By.id("pass")).isEnabled();
		Assert.assertEquals(true, b);	
	}
	
	
	
	
	
	
	
	
	
	
	

}
