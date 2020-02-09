package magnitia;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cache_autocomplete
{
	public static void main(String[] args) throws InterruptedException 
	{
		  /*Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a word to search");
		  String s=sc.nextLine(); */
		  
		  // open browser
		  System.setProperty("webdriver.chrome.driver", "E:\\Automaion softwares\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  
		  //launch site
		  driver.get("http://www.google.co.in");
		  //Maximize window
		  driver.manage().window().maximize();
		  //Enter a word to search
		  driver.findElement(By.name("q")).sendKeys("rajinikanth");
		  Thread.sleep(5000);
		  
		  //locate cache  and collect elements into list
		  List<WebElement> caches= driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		  System.out.println("Count of cache is :"+caches.size());
		  
		  System.out.println("Caches are :");
		  for(WebElement cache:caches )
		  {
			  System.out.println(cache.getText());
		  }
		  
		  //check each suggestion contains given word or not
		  int flag=0;
		  for(WebElement cache:caches)
		  {
			  if(!cache.getText().contains("rajinikanth"))
			  {
				  flag=1;
			  }
			    if(flag==0)
			    {
			    	System.out.println(" cache is correct");
			    }
			    else 
			    {
			    	System.out.println("Cache is incorrect");
			    }			    
		  }
		  
		   for(WebElement cache:caches)	 
		   {
			 //Get text of suggestion to be selected
			 String expected=cache.getText();
			 //drop arrow
			 driver.findElement(By.name("q")).sendKeys(Keys.DOWN);
			 //Get selected suggestion text
			 String actual=driver.findElement(By.name("q")).getAttribute("value");
			 
			 if(expected.equals(actual))
			 {
				 System.out.println(expected + "Test passed :");
			 }
			 else 
			 {
				 System.out.println(expected +" Test failed :");
			 }
			 
		   } 

		  
		  //close site
		  driver.close();
		  
		  
		 
	}

}
