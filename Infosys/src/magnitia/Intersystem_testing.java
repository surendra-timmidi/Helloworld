package magnitia;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intersystem_testing 
{

	public static void main(String[] args) throws Exception 
	{
		 // open browser
		  System.setProperty("webdriver.chrome.driver", "E:\\Automaion softwares\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  
		  //launch site
		  driver.get("https://www.gmail.com");
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
		  /*
		  //Do login
		  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("timmidisurendra@gmail.com",Keys.ENTER);
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8142572805",Keys.ENTER);
		  Thread.sleep(5000);
		  //click on gmail icon
		  /*driver.findElement(By.xpath("//div[@class='gb_Hf']/a")).click();
		  Thread.sleep(10000);
		  
		  /*Set<String> set= driver.getWindowHandles();
		  ArrayList<String> al=new ArrayList<String>(set);
		  driver.switchTo().window(al.get(1));
		  System.out.println(al);
		  Thread.sleep(5000);
		  //click on compose
		  driver.findElement(By.xpath("//div[@role='button'][@gh='cm']")).click();
		  Thread.sleep(5000);
          //fill fields
		  driver.findElement(By.name("to")).sendKeys("timmidisurendra@yahoo.com");
		  Thread.sleep(5000);
		  driver.findElement(By.name("subjectbox")).sendKeys("Hello");
		  Thread.sleep(5000);

		  driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("All is well");
		  Thread.sleep(5000);
          //click on send button
		  driver.findElement(By.xpath("//div[@role='button'][contains(@data-tooltip,'Send')]")).click();
		  Thread.sleep(5000);*/
		  
		  //open new tab
		  Set<String> s=driver.getWindowHandles();
		  System.out.println(s.size());
		  WebDriver d1=driver.switchTo().newWindow(WindowType.TAB);
		  d1.get("https://www.google.co.in");
		  Thread.sleep(5000);
		  Set<String> sa=driver.getWindowHandles();
		  System.out.println(sa.size());
		  

		  //launch yahoo site
		 // driver.get("https://login.yahoo.co");
		  

		  //close site
		 // driver.close();
 
	}

}
