package infosys;

import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Test2_Crossbrowsers

 { 
	public static void main(String[] args) throws Exception
	
	
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");

		String s=sc.nextLine();
		
		WebDriver driver=null;
		if(s.equalsIgnoreCase("chrome")) 
		{
			 System.setProperty("webdriver.chrome.driver", "E:\\Automaion softwares\\chromedriver.exe");
	         driver = new ChromeDriver();
		}
		
		else if(s.equalsIgnoreCase("ie")) 
		{
			System.setProperty("webdriver.ie.driver", "E:\\Automaion softwares\\iedriverserver.exe");
		   driver = new InternetExplorerDriver();
		}
		
		
		else if(s.equalsIgnoreCase("firefox")) 
			
		{    FirefoxOptions ff= new FirefoxOptions();
             ff.setBinary("C:\\Program Files\\Mozilla Firefox.exe");
			System.setProperty("webdriver.gecko.driver", "E:\\Automaion softwares\\geckodriver.exe");
			 driver=new FirefoxDriver(ff);

		}
		else if (s.equalsIgnoreCase("msedge")) 
		{
			EdgeOptions eo=new EdgeOptions();
			eo.setBinary("C:\\Program Files (x86)\\Microsoft\\Edge Beta\\Application\\msedge.exe");
			
			System.setProperty("webdriver.edge.driver", "E:\\Automaion softwares\\msedgedriver.exe");
			 driver=new EdgeDriver(eo);
		}
		
		else
		{
			OperaOptions op=new OperaOptions();
			op.setBinary("C:\\Users\\User\\AppData\\Local\\Programs\\Opera\\65.0.3467.78\\opera.exe");
			 System.setProperty("webdriver.opera.driver", "E:\\Automaion softwares\\operadriver.exe");
	          driver = new OperaDriver(op);

		}
		
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
