package week2.assignment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebookAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Precondition Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
//Precondition Load URL
		driver.get("http://www.facebook.com");
//Precondition Maximize window
driver.manage().window().maximize();
//Precondtion Add implicit wait to ensure webpage fully loaded
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

//Click on the Create new account button
driver.findElement(By.linkText("Create new account")).click();

//Enter the first name
driver.findElement(By.name("firstname")).sendKeys("Peter");

//Enter the last name
driver.findElement(By.name("lastname")).sendKeys("England");

//Enter the mobile or email address
driver.findElement(By.name("reg_email__")).sendKeys("peter.england@gmail.com");

//Enter the new password
driver.findElement(By.id("password_step_input")).sendKeys("test1234");

//Handle all three dropdown in Date of Birth
WebElement dayWE = driver.findElement(By.id("day"));
Select dayDD = new Select(dayWE);
dayDD.selectByIndex(0);

WebElement monthWE = driver.findElement(By.id("month"));
Select monthDD=new Select(monthWE);
monthDD.selectByValue("1");

WebElement yearWE = driver.findElement(By.id("year"));
Select yearDD = new Select(yearWE);
yearDD.selectByVisibleText("1905");

//Select the radio button in gender
driver.findElement(By.xpath("//input[@value='-1']")).click();
//driver.close();
	}
}
