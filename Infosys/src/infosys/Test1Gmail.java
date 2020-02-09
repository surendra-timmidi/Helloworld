package infosys;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test1Gmail 
{

	public static void main(String[] args) throws Exception 
	{
       
System.setProperty("webdriver.chrome.driver", "E:\\Automaion softwares\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
         
driver.get("https://accounts.google.com");
driver.manage().window().maximize();
Thread.sleep(5000);


driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("timmidisurendra@gmail.com");

Thread.sleep(5000);

driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
Thread.sleep(5000);

driver.findElement(By.name("password")).sendKeys("8142572805");
Thread.sleep(5000);

driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
Thread.sleep(5000);

driver.findElement(By.xpath("(//*[@focusable='false'])[6]")).click();
Thread.sleep(5000);

driver.findElement(By.xpath("(//span[@class='gb_r'])[6]")).click();
Thread.sleep(10000);

ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs2.get(1));


driver.findElement(By.xpath("//div[@role='button'][@gh='cm']")).click();
Thread.sleep(5000);

driver.findElement(By.name("to")).sendKeys("khaja5224.kdp@gmail.com");
Thread.sleep(5000);
driver.findElement(By.name("subjectbox")).sendKeys("Hello");
Thread.sleep(5000);

driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("do well");
Thread.sleep(5000);

driver.findElement(By.xpath("//div[@role='button'][contains(@data-tooltip,'Send')]")).click();
Thread.sleep(5000);
	}

}
