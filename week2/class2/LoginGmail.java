package week2.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.facebook.com");

driver.findElement(By.id("email")).sendKeys("archu1307@gmail.com");
driver.findElement(By.id("pass")).sendKeys("helloworld");
driver.findElement(By.name("login")).click();


//findElement(By.linkText("))
	}

}
