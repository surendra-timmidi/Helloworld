package magnitia;


import org.openqa.selenium.WindowType;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test 
{
	public static void main(String[] args) throws Exception 
	{
		// open browser
		 /* System.setProperty("webdriver.chrome.driver", "E:\\Automaion softwares\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  Thread.sleep(5000);*/
		   System.setProperty("webdriver.ie.driver", "E:\\Automaion softwares\\iedriverserver.exe");
		  InternetExplorerDriver driver = new InternetExplorerDriver();

		  //launch site
		  driver.get("https://www.google.co.in");
		  Thread.sleep(5000);
		  
		  driver.switchTo().newWindow(WindowType.TAB);
		  Thread.sleep(5000);

		  driver.get("https://www.google.co.in");
		  
	}

}
