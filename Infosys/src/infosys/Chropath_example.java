package infosys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Chropath_example
{
	public static void main(String[] args) 
	{

		//open browser
		 /* System.setProperty("webdriver.chrome.driver", "E:\\Automaion softwares\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();*/
		
		 FirefoxOptions ff= new FirefoxOptions();
         ff.setBinary("C:\\Program Files\\Mozilla Firefox.exe");
		 System.setProperty("webdriver.gecko.driver", "E:\\Automaion softwares\\geckodriver.exe");
		 FirefoxDriver driver=new FirefoxDriver();

		  
		  //launch site
		  driver.get("https://www.flipkart.com");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mi mobiles");
		  
		  
		  
	}

}
