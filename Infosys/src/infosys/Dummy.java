package infosys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy 
{
	public static void main(String[] args) throws Exception
	{

		 // open browser
		  System.setProperty("webdriver.chrome.driver", "E:\\Automaion softwares\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  //launch site
		  driver.get("https://www.google.co.in");
		  Thread.sleep(5000);

		  
		  driver.switchTo().newWindow(WindowType.TAB);
		  driver.get("https://www.google.co.in");
		  Thread.sleep(5000);
		  
		  driver.switchTo().newWindow(WindowType.TAB);
          driver.get("https://www.google.co.in");
		  Thread.sleep(5000);
		  
	}

}
