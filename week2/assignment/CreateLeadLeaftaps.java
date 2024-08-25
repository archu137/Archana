package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadLeaftaps {

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

//Input Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Ms");
		//Click on the Create Lead button

		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
