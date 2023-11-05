package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountLeaftaps {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("ABC");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		Select industry = new Select(industryDD);
	    industry.selectByIndex(3);
	    
		WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select ownership = new Select(ownershipDD);
	    ownership.selectByVisibleText("S-Corporation");
	    
	    WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
		Select source = new Select(sourceDD);
		source.selectByValue("LEAD_EMPLOYEE");
		
		 WebElement marketingDD = driver.findElement(By.id("marketingCampaignId"));
		 Select marketing = new Select(marketingDD);
		 marketing.selectByIndex(6);
		 
		 WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		 Select state = new Select(stateDD);
		 state.selectByValue("TX");
		 
		 Thread.sleep(5000);
		 driver.close();
		 
	}

}
