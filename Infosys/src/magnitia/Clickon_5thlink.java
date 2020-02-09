package magnitia;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickon_5thlink 
{
	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\Automaion softwares\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(5000);

		
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");

	    driver.findElement(By.name("q")).sendKeys("rajinikanth",Keys.ENTER);
	    List<WebElement> l= driver.findElements(By.xpath("//div[@class='rc']/descendant::a/div"));
	   
	    int i= l.size();
        System.out.println(i);
       
	    int vrc=0;
	    int visiblecount=0;
	    int hiddencount=0;
	    
	    for(WebElement we:l)
	    {
	    	if(we.isDisplayed())
	    	{
	    		visiblecount++;
	    	}
	    	else 
	    	{
	    		hiddencount++;
	    	}
	    	
	    }
	    System.out.println("Visible count are:"+visiblecount);
    	System.out.println("Hidden count are:"+hiddencount);

 
	    for(WebElement we:l)
	    {
		    if(we.isDisplayed())
		    {
			   
			    vrc++;
				  
			   
			      if(vrc==2)
			      {
				     we.click();
				     Thread.sleep(5000);
				      break;
			      }
		     }
	    }
	   
	    
	}

}
