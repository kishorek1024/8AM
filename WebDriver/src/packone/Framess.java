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

public class Framess {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		WebElement f1=driver.findElement(By.name("packageListFrame"));
		WebElement f2=driver.findElement(By.name("packageFrame"));
		List<WebElement> links=driver.switchTo().frame(f1).findElements(By.tagName("a"));
		
		int i;
		for(i=0; i<links.size(); i++){
			links.get(i).click();
			driver.switchTo().parentFrame();
			List<WebElement> links2=driver.switchTo().frame(f2).findElements(By.tagName("a"));
			System.out.println(links2.size());
			driver.switchTo().parentFrame();
		}
		
		/*File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\DELL\\Desktop\\WD8\\app.png"));*/
		
		/*List<WebElement> frames=driver.findElements(By.tagName("frame"));
		int i; int j;
		for(i=0; i<frames.size(); i++){
			List<WebElement> links=driver.switchTo().frame(frames.get(i)).findElements(By.tagName("a"));
			System.out.println(links.size());
			for(j=0; j<links.size(); j++){
				System.out.println(links.get(j).getText());
			}
			System.out.println("______________________________________________");
			driver.switchTo().parentFrame();
		}*/
		
		/*WebElement f1=driver.findElement(By.name("packageListFrame"));
		driver.switchTo().frame(f1).findElement(By.xpath("//a[@href='java/applet/package-frame.html']")).click();
		
		//driver.switchTo().frame(driver.findElement(By.name("packageListFrame"))).findElement(By.xpath("//a[@href='java/applet/package-frame.html']")).click();
		
		driver.switchTo().parentFrame();
		// Creating Webelement for Second Frame
		WebElement f2=driver.findElement(By.name("packageFrame"));
		driver.switchTo().frame(f2).findElement(By.xpath("//*[@href='AppletStub.html']")).click();*/
	}

}






