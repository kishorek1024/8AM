package gridd;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_Sample {

	public static void main(String[] args) throws Exception{
		
		DesiredCapabilities d=new DesiredCapabilities().firefox();
		
		//WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), d);
		
		
		URL u=new URL("http://localhost:4444/wd/hub");
		
		RemoteWebDriver r=new RemoteWebDriver(u, d);
		
		WebDriver driver=r;
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
