package week2.class1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
//EdgeDriver ed=new EdgeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
//ed.get("http://www.google.com");
//driver.close();
	}

}
