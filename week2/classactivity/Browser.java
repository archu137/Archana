package week2.classactivity;

public class Browser {

	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched successfully"+browserName);
	return browserName;
	}
	public void loadUrl()
	{
		System.out.println("Application URL launched successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Browser s1=new Browser();
s1.loadUrl();
s1.launchBrowser("Edge");
EdgeBrowser s2=new EdgeBrowser();
	}
}