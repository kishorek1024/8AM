package packone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DBCon {

	public static void main(String[] args) throws Exception{
		// Registering Oracle DB Drivers
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","DB1","kishore");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from Table11");
		//System.out.println("sno   sname  smarks");

		while(rs.next()){
			WebDriver driver=new FirefoxDriver();
			driver.get("http://facebook.com");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("email")).sendKeys(rs.getString(1));
			driver.findElement(By.id("pass")).sendKeys(rs.getString(2));
			Thread.sleep(5000);
			driver.close();
			
			
			
		}
	}

			

	}


