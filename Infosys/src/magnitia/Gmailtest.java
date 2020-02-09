package magnitia;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailtest
{
	public static void main(String[] args) throws Exception 
	{
		  //open browser
		  System.setProperty("webdriver.chrome.driver", "E:\\Automaion softwares\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  
		  //launch site
		  driver.get("https://accounts.google.com");
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
		  
		  //Do login
		  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("timmidisurendra@gmail.com",Keys.ENTER);
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8142572805",Keys.ENTER);
		  Thread.sleep(5000);
		  
		 
		  //collect all rows 
		  List<WebElement> rows= driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr"));
		  int urm=0;
		  int rm=0;
		  
		     for(WebElement row:rows )
		     {
			     WebElement e=driver.findElement(By.xpath("child::td[5]/div[1]"));  
		  
		         //Get invisible text using javascript
		         String s1= (String) driver.executeScript("var y=arguments[0].textContent;return(y);",e);
		         System.out.println(s1);
		      
		          if(s1.startsWith("unread"))
		          {
		         	 urm++;  
		          }
		          else 
		          {
		    	    rm++;
		           }
		      }  
		      System.out.println("Unread mail count are :"+urm);
			  System.out.println("Read mail count are :"+rm);
	    	      
	   
	}
		  
		 
}


