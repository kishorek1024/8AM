package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleElements {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int i;
		for(i=0; i<links.size(); i++){
			String a=links.get(i).getText();
			if(a.startsWith("K")==true)
				System.out.println(a);
			//System.out.println(links.get(i).getText() + "-" + links.get(i).getAttribute("href"));
		}	
		//System.out.println(links.size());
		
		/*List<WebElement> dropdowns=driver.findElements(By.tagName("select"));
		System.out.println(dropdowns.size());
		
		List<WebElement> imgs=driver.findElements(By.tagName("img"));
		System.out.println(imgs.size());*/
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
