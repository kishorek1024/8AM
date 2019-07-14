package gridd;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_BS {

	public static void main(String[] args) throws Exception{
		
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability("os", "WINDOWS");
		d.setCapability("os_version", "XP");
		d.setCapability("browser", "Chrome");
		d.setCapability("browser_version", "39");
		d.setCapability("browserstack.debug", true);
		
		URL u=new URL("https://sumit421:bscdPUA5Y3zW94ybSiKi@hub-cloud.browserstack.com/wd/hub");
		RemoteWebDriver r=new RemoteWebDriver(u, d);
		WebDriver driver=r;
		
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
