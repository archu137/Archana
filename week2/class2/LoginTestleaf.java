package week2.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginTestleaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.leaftaps.com/opentaps");
	
//Maximise the browser
driver.manage().window().maximize();

//Find Webelement for username, password and login

driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();

driver.findElement(By.linkText("CRM/SFA")).click();

//Click Leads Tab

driver.findElement(By.linkText("Leads")).click();

//Click Create Lead button

driver.findElement(By.linkText("Create Lead")).click();

//Input Mandatory fields - Company Name

driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");

//Input First Name

driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Archana");

//Input Last Name

driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jayaraj");

//Find WebElement Source dropdown

WebElement sourceWE = driver.findElement(By.id("createLeadForm_dataSourceId"));

Select sourceDD = new Select(sourceWE);

//Select Employee

sourceDD.selectByIndex(4);
	
//Find WebElement Marketing Campaign dropdown
WebElement marketingWE = driver.findElement(By.id("createLeadForm_marketingCampaignId"));

//Select Automobile from Dropdown

Select marketingDD=new Select(marketingWE);
marketingDD.selectByVisibleText("Automobile");

//Find WebElement Ownership
WebElement ownershipWE = driver.findElement(By.id("createLeadForm_ownershipEnumId"));

Select ownershipDD=new Select(ownershipWE);
ownershipDD.selectByValue("OWN_CCORP");

//Click on the Create Lead button

driver.findElement(By.className("smallSubmit")).click();
String title = driver.getTitle();
System.out.println(title);
driver.close();
	}
}
