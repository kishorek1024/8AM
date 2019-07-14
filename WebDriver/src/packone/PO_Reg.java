package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_Reg {
	
	public By Fullname=By.xpath("//input[starts-with(@name,'name')]");
	public By rediffid=By.xpath("//input[starts-with(@name,'login')]");
	
	@FindBy(xpath="//input[starts-with(@name,'name')]") WebElement FN;
	@FindBy(xpath="//input[starts-with(@name,'login')]") WebElement RediffID;

}
