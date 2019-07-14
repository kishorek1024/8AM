package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://money.rediff.com/sectors/bse/teck");
		driver.manage().window().maximize();
		
		/*List<WebElement> rows=driver.findElements(By.tagName("tr"));
		System.out.println(rows.size());*/
		
		WebElement table=driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody"));
		List<WebElement> r=table.findElements(By.tagName("tr"));
		
		
		int i;
		for(i=1; i<=r.size(); i++){
			
			String xpath1="tr[";
			String xpath2="]/td[1]";
			//System.out.println(table.findElement(By.xpath("tr[" + i + "]/td[1]")).getText());
			//System.out.println(driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody/tr[" + i + "]/td[1]")).getText());
			String val=table.findElement(By.xpath(xpath1+i+xpath2)).getText();
			if(val.equals("Infosys Ltd.")==true)
				System.out.println(table.findElement(By.xpath("tr[" + i + "]/td[6]")).getText());
		}
		
		
		
		
		//System.out.println(r.size());
		
		//System.out.println(r.size());
		
		//System.out.println(driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody/tr[3]/td[3]")).getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
