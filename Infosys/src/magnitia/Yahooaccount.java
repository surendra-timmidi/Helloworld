package magnitia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahooaccount 
{
	public static void main(String[] args) throws Exception 
	{
		 // open browser
		  System.setProperty("webdriver.chrome.driver", "E:\\Automaion softwares\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  
		  //launch site
		  driver.get("https://login.yahoo.com");
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
		  
		  //Do login to yahoo with valid credentials
		  driver.findElement(By.name("username")).sendKeys("timmidisurendra@yahoo.com");
		  driver.findElement(By.name("signin")).submit();
		  Thread.sleep(5000);
		  driver.findElement(By.name("password")).sendKeys("9866130571");
		  WebElement e= driver.findElement(By.name("verifyPassword"));
		  driver.executeScript("arguments[0].click()",e);
		  
		  driver.findElement(By.xpath("//a[@id='uh-mail-link']")).click();
		  Thread.sleep(5000);

		  WebElement wb=driver.findElement(By.xpath("//div[@data-test-id='virtual-list']/ul"));
		  WebElement we=wb.findElement(By.xpath("child::li[3]"));
		  String x=we.findElement(By.xpath("descendant::span[4]")).getAttribute("title");
		  System.out.println("From address is :"+x);
		  
		  driver.findElement(By.xpath("//label[@role='presentation']")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//span[text()='Sign out']")).click();
		  
		  //close site
		  driver.close();
		  
	}

}
