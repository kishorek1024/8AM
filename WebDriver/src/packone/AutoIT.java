package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIT {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://transfer.pcloud.com/");
		driver.manage().window().maximize();
		
		// Clicking on Upload Image
		driver.findElement(By.xpath("//img[@src='//pcdn-transfer.pcloud.com/Zfb/img/add_files_ico.png']")).click();
		// Calling and executing AutoIT exe file
		Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\WD8\\0627.exe");
	}

}
