package infosys;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test8_getmethods 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automaion softwares\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		 driver.navigate().to("https://www.flipkart.com");
		//driver.get("https://www.flipkart.com");
		//GET TITLE
	     System.out.println(driver.getTitle());
	     //GET URL
	     String s=driver.getCurrentUrl();
	      System.out.println(s);
	     
	     
	     //System.out.println(driver.getPageSource());
	     
	    driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	     
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("red mi note 8 ",Keys.chord(Keys.CONTROL,"a"),
	    		                                                Keys.chord(Keys.CONTROL,"c"),Keys.ENTER);
	    driver.manage().window().maximize();
	    
	    WebElement e=driver.findElement(By.xpath("//a[text()='Login & Signup']"));
	    
	    if(e.isDisplayed()) 
	    {
	    	System.out.println("\"element is visible \"");
	    	if(e.isEnabled())
	    	{
	    		System.out.println("\"Enabled\"");
	    	}
	    	else 
	    	{
	    		System.out.println("Disabled");
	    	}
	    }
	    
	    else 
	    {
	    	System.out.println("\"not visible\"");
	    }
	     
	     Thread.sleep(5000);

	    
	   driver.findElement(By.xpath("//*[contains( text(),'Electronics')]")).click();;
	     
	   /*  Actions a=new Actions(driver);
	     a.moveToElement(w).click();*/
	     Thread.sleep(5000);
	     
	    WebElement e1= driver.findElement(By.xpath("(//a[starts-with(text(),'Mi')])[1]"));
	    if( e1.isSelected())
	    {
	    	System.out.println("selected");
	    }
	     
	    else 
	    {
	    	System.out.println("not selected so  perform click operation");
	    	e1.click();
	    }
	    
	    //Get attribute value
	     String s1=driver.findElement(By.xpath("//img[@title='Flipkart']")).getAttribute("src");
	     System.out.println(s1);
	     
	      String s2= driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[2]")).getCssValue("padding");
	     System.out.println(s2);
	     
	     String s3= driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[3]")).getTagName();
	     System.out.println(s3);
	     
		    int x= driver.findElement(By.xpath("//input[@type='text']")).getSize().getHeight();
		    System.out.println(x);
		    int y= driver.findElement(By.xpath("//input[@type='text']")).getSize().getWidth();
		    System.out.println(y);
		    
		    int z= driver.findElement(By.xpath("//input[@type='text']")).getLocation().getX();
		    System.out.println(z);
		    int q= driver.findElement(By.xpath("//input[@type='text']")).getLocation().getY();
		    System.out.println(q);

		    
		    
	     
	     
	    
	     
	     
	     
	     
	     
		    
	}

}
