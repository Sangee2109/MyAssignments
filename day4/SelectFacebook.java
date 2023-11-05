package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFacebook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sangee");
		driver.findElement(By.name("lastname")).sendKeys("K");
		driver.findElement(By.name("reg_email__")).sendKeys("987654321");
		driver.findElement(By.id("password_step_input")).sendKeys("1234");
		
		WebElement dateDD = driver.findElement(By.id("day"));
		Select date = new Select(dateDD);
	    date.selectByVisibleText("21");
	    
	    WebElement monthDD = driver.findElement(By.id("month"));
		Select month = new Select(monthDD);
	    month.selectByIndex(8);
	    
	    WebElement yearDD = driver.findElement(By.id("year"));
		Select year = new Select(yearDD);
	    year.selectByValue("1994");
	    
	    driver.findElement(By.name("sex")).click();
	    Thread.sleep(2000);
	    driver.close();
	    
	}

}
