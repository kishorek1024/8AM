package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class CallPO {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
		PO_Reg p=PageFactory.initElements(driver, PO_Reg.class);
		p.FN.sendKeys("KishoreKumar");
		p.RediffID.sendKeys("kishorekumar@rediff.com");
		
		PO_Home home=PageFactory.initElements(driver, PO_Home.class);
		
		
		/*PO_Reg p=new PO_Reg();
		driver.findElement(p.Fullname).sendKeys("Kishore");
		driver.findElement(p.rediffid).sendKeys("kishorekumar@rediff.com");
*/
	}

}
