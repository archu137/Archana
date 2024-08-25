package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountLeafTaps {

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
		//Click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();
		//Click on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();
		//Enter an account name
		driver.findElement(By.id("accountName")).sendKeys("John");
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Automation Selenium Tester");
		//Enter a Number Of Employees
		driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("5");
		//Enter a Site Name as “LeafTaps”
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("LeafTaps");
		//Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
		//Verify that the Title is displayed correctly.
		String title = driver.getTitle();
		System.out.println(title);
		//Close the browser window

		
	}

}
