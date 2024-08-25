package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountLeaftaps1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Initialize the web driver
		ChromeDriver driver=new ChromeDriver();
//Load URL
		driver.get("http://www.leaftaps.com/opentaps");
//Maximise the browser
		driver.manage().window().maximize();

//Find Webelement for username, password and login

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();
		//Click on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();
		//Enter an account name
		driver.findElement(By.id("accountName")).sendKeys("Archana");
		//Select "Employee" as the source using SelectByValue.
				WebElement sourceWE = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
				Select sourceDD = new Select(sourceWE);
				sourceDD.selectByValue("LEAD_EMPLOYEE");

		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Automation Selenium Tester");

		//Select "ComputerSoftware" as the industry.
		WebElement industryWE = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select industryDD = new Select(industryWE);
		industryDD.selectByVisibleText("Computer Software");
//Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement ownershipWE = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select ownershipDD=new Select(ownershipWE);
		ownershipDD.selectByVisibleText("S-Corporation");
		
//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		WebElement marketingWE = driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
		
		Select marketingDD=new Select(marketingWE);
		marketingDD.selectByIndex(5);
		//Select "Texas" as the state/province using SelectByValue
		WebElement stateWE = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select stateDD=new Select(stateWE);
		stateDD.selectByValue("TX");
		
		//Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
//Verify that the Title is displayed correctly.
		String title = driver.getTitle();
		System.out.println(title);
		//Close the browser window
	}
}