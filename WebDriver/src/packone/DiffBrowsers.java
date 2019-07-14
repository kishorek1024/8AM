package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DiffBrowsers {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\WD8\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\DELL\\Desktop\\WD8\\Jars\\IEDriverServer.exe");
		WebDriver driver1=new InternetExplorerDriver();
		driver1.get("http://rediff.com");
		driver1.manage().window().maximize();

	}

}
