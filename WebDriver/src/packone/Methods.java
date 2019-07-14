package packone;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {
	public WebDriver driver;
	
	public void launchApp(String url, String sspath) throws Exception{
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(sspath));
	
	}	
	public void closeApp(){
		driver.close();	}	
	public void elementPresent(String loc, boolean exp){
		boolean a=driver.findElement(By.id(loc)).isDisplayed();
		if(a==exp)
			System.out.println("Pass " + "-" + a + "-" + exp);
		
		else
			System.out.println("Fail " + "-" + a + "-" + exp);	}
	public void elementsCount(String loc, int exp){
		List<WebElement> elements=driver.findElements(By.tagName(loc));
		if(elements.size()==exp)
			System.out.println("Pass " + "-" + elements.size() + "-" + exp);
		else
			System.out.println("Fail " + "-" + elements.size() + "-" + exp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
