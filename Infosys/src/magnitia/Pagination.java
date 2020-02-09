package magnitia;

import java.util.List;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination 
{
	public static void main(String[] args) throws Exception
	{
		  // open browser
		  System.setProperty("webdriver.chrome.driver", "E:\\Automaion softwares\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  
		  //launch site
		  driver.get("https://www.google.com");
		  Thread.sleep(5000);
		  driver.manage().window().maximize();
		  
		  //enter search data
		  driver.findElement(By.name("q")).sendKeys("tcs",Keys.ENTER);
		  Thread.sleep(5000);
   
		  //collect all elements of word in all pages (pagination)
		  int noofpages=0;
		  int visible=0;
		  int hidden=0;
		  while(2>1)
		  {
			  noofpages++; 
		      List<WebElement> elements= driver.findElements(By.xpath("//div[@class='rc']/descendant::a/div"));
              for(WebElement ele:elements)
		      {
			     if(ele.isDisplayed())
			     {
				    visible++;
			     }
			     else
			     {
			    	 hidden++;
			     }
		      }
		  //Go to next page
		      try
		      {
		        	driver.findElement(By.linkText("Next")).click();
		      }
		      catch(Exception ex)
		      {
			     break;
		      }
		     

		  }
		
		      System.out.println("Total no of pages :"+noofpages);
		      System.out.println("Visible elements :"+visible);
		      System.out.println("Hidden elements :"+hidden);
		      
		  //close site
		  driver.close();

   }

}
