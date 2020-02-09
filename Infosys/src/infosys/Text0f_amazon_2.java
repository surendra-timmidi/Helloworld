package infosys;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text0f_amazon_2 
{
	public static void main(String[] args) throws Exception 
	{
		//open browser
		  System.setProperty("webdriver.chrome.driver", "E:\\Automaion softwares\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  
		  //launch site
		  driver.get("https://www.flipkart.com");
		  driver.manage().window().maximize();
		  
		  
		List<WebElement>l= driver.findElements(By.xpath("//div[@class='iUmrbN']"));
	    Thread.sleep(10000);
	     
	    JavascriptExecutor jse=driver;
	    jse.executeScript("scroll(1000,0);");
	    Thread.sleep(10000);
	    
	    System.out.println(l.size());


	    
	    

	    
	    for(WebElement l1:l)
	    {
	    	String s1=l1.getText();
		    System.out.println(s1);

	    }
		  
	}

}
