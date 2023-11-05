package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTapsLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
        Thread.sleep(3000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Geetha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source = new Select(sourceDD);
	    source.selectByIndex(4);
	    
	    WebElement marketingDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketing = new Select(marketingDD);
		marketing.selectByVisibleText("Automobile");
		
		WebElement ownershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownership = new Select(ownershipDD);
		ownership.selectByValue("OWN_CCORP");
		
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		
		if(title.contains("View Lead"))
		{
			System.out.println("Verification successful");
		}
		else System.out.println("Login failed");	

		Thread.sleep(3000);
		driver.close();
	}

}
