package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Importing Actions Class
		Actions a=new Actions(driver);
		
		WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
		
		a.contextClick(email).build().perform();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.DOWN).build().perform();
		
		a.sendKeys(Keys.ENTER).build().perform();
		
		a.dragAndDrop(email, email).build().perform();
		
		a.clickAndHold(email).build().perform();
		a.release().build().perform();
		
		//a.doubleClick(button).build().perform();
		/*a.sendKeys(Keys.F5).build().perform();
		a.sendKeys(Keys.CONTROL+"t").build().perform();*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*// Creating Webelement for Companies Menu
		WebElement companies=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/a/div"));
		// Move Cursor to Companies Menu
		a.moveToElement(companies).build().perform();
		// Clicking on About Companies Link
		driver.findElement(By.xpath("//a[@title='About Companies']")).click();*/

	}

}
