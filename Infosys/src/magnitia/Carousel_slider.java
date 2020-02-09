package magnitia;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Carousel_slider 
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
		  
		  //handle banner if exists
		  try 
		  {
             driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		  }
		  catch(Exception ex)
		  {
			  System.out.println("No banner");
		  }
		  
		  //Locate carousel slider
		  WebElement we= driver.findElement(By.xpath("(//div[contains(@style,'transform')])[1]"));
		  String s=we.getTagName();
		  
		  //check which tag used for slider
		  if(s.equals("div"))
		  {
			  System.out.println("Developed using <div> tag");
			  //Display count of sliders
			  List<WebElement> sliders= we.findElements(By.xpath("child::div"));
			  int count=0;
			  for(WebElement slide:sliders)
			  {
				  if(slide.getAttribute("data-clone").equals("false"))
				  {
					  count++;
				  }
			  }
			  Thread.sleep(5000);
			  System.out.println("Count of sliders is:"+count);
		   }
		   else 
		   {
			  System.out.println("Developed using <ul> tag");
			  List<WebElement> slides= we.findElements(By.xpath("child::li"));
			  System.out.println("Count of slides:"+slides.size());
		   }
		  
		   //check 2D or 3D type of slider
		   String s1= we.getCssValue("transform");
		   if(s1.contains("matrix") && !s1.contains("matrix3D"))
		   {
			   System.out.println("2D slider");
		   }  
		   else 
		   {
			   System.out.println("3D slider");
		   }
		   //System.out.println(s1);
           //test direction of slider
		   String s3=s1.substring(7,30);
		   System.out.println(s3);
		   
		 String[] s4=  s3.split(",");
		 
		 Float x=Float.parseFloat(s4[4]);
		 Float y=Float.parseFloat(s4[5]);
		 
		 
		 
		   
		  //close 
		  driver.close();
		 
	}

}
