package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser 
{

	 @Test (dataProvider = "data-provider")
	    public void myTest (String val, String cal) throws InterruptedException {
	       ChromeDriver driver = new ChromeDriver();
	       driver.get("https://practicetestautomation.com/practice-test-login/");
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("//input[@id=\'username\']")).sendKeys(val);
	       driver.findElement(By.xpath("//input[@id=\'password\']")).sendKeys(cal);
	       driver.findElement(By.xpath(" //button[@id=\'submit\']")).click();
	       
	    
	      driver.quit();
	      
	    }
	 @DataProvider (name = "data-provider")
     public Object[][] dpMethod(){
	 return new Object[][] {
		                    {"First-Value","Hello"},{"student","Password123"}
		                    
	 };
     }
	 
	
}
