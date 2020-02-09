package magnitia;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links 
{
	public static void main(String[] args) throws Exception 
	{
		  // open browser
		  System.setProperty("webdriver.chrome.driver", "E:\\Automaion softwares\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  
		  //launch site
		  driver.get("http://www.flipkart.com");
		  Thread.sleep(5000);
		  driver.manage().window().maximize();
		 
		 //Collect all links in 1st page
	     List<WebElement> l=driver.findElements(By.xpath("(//a)|(//href)|(//img)|(//base)|(//area)|(//link)|(//script)"));
         System.out.println("Total links in page :"+l.size());

	      int workinglinks=0;
	      int brokenkinks=0;
	      int notstartwithhttp=0;
	      int hrefblank=0;
	      int hrefisnull=0;
	 
	        //check for each link
	        for(WebElement l1:l)
	          {
	        	//check href attribute availability
	        	 if(l1.getAttribute("href")!=null)
	        	  { 
	        	  
	        		   String x=l1.getAttribute("href");
	        		//check href is not blank
	        		 if(!x.equals(""))
	        		  {
	        			 //check href value starts with http|hhtps
	        			 if(x.startsWith("http")||x.startsWith("https"))
	        			 {
	        				URL u=new URL(x);
	        				HttpURLConnection h=(HttpURLConnection) u.openConnection();
	        				h.connect();
	        				String s=h.getResponseMessage();
	        				h.disconnect();
	        				 
	        				      if(s.equalsIgnoreCase("ok")||s.equalsIgnoreCase("Accepted")||s.equalsIgnoreCase("Found"))
	        				       {
	        					      workinglinks++; 
	        				       }
	        				      else
	        				       {
	        					      brokenkinks++;
	        				       }
	        			  }
	        			  else 
	        			  {
	        				 notstartwithhttp++;
	        			  }
	        		   }
	        		   else 
	        		   {
	        			hrefblank++; 
	        		   }
	        			 
	        	    }
	        	 else 
	        	 {
	        		 hrefisnull++;
	        	 }
	        		 
	        	   
	           } 

	        System.out.println("Count of working links"+workinglinks);
	        System.out.println("count of broken links"+notstartwithhttp);
	        System.out.println("count of hrefblank"+hrefblank);
	        System.out.println("count of hrefnull"+hrefisnull);
	}

}
