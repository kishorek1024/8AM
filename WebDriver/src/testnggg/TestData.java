package testnggg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestData {
	public WebDriver driver;
	
	@DataProvider(name="TestData")
	public Object[][] data(){
		Object[][] obj=new Object[3][0];
		obj[0][0]="Kishore"; obj[0][1]="abcdefgh";
		obj[1][0]="Qshore"; obj[1][1]="Kishore";
		obj[2][0]="Kumar"; obj[2][1]="xyz12345";		
		return obj;	}
	
  @Test(dataProvider="TestData")
  public void f(String uid, String pwd) {
	  driver.findElement(By.id("email")).sendKeys(uid);
	  driver.findElement(By.id("pass")).sendKeys(pwd);
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
