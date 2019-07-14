package testnggg;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.asserts.SoftAssert;

public class Test1 {
	public WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.findElement(By.id("email")).sendKeys("Kishore");
	  SoftAssert s=new SoftAssert();
	  boolean a=driver.findElement(By.id("pass")).isDisplayed();
	  s.assertEquals(a, true);
	  boolean b=driver.findElement(By.id("pass")).isEnabled();
	  s.assertEquals(b, true);
	  System.out.println(driver.getTitle());
	  s.assertAll();
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
