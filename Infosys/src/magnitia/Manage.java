package magnitia;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage 
{
	public static void main(String[] args) throws Exception 
	{

		 // open browser
		  System.setProperty("webdriver.chrome.driver", "E:\\Automaion softwares\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  
		  //launch site
		  driver.get("http://www.google.co.in");
		  Thread.sleep(5000);
		  
		  driver.switchTo().newWindow(WindowType.TAB);
		  
		  //maximize
		  Window w=  driver.manage().window();
		  w.maximize();
		  
		  //Get size
		  int h= w.getSize().getHeight();
		  int w1=w.getSize().getWidth();
		  System.out.println("size :"+h+" "+w1);

		  //set size
           Dimension d1=new Dimension(734, 1321);
           w.setSize(d1);
          
          //Get position
          int x= w.getPosition().getX();
          int y= w.getPosition().getY(); 
          System.out.println("position :"+x+" "+y);
          
          //set poisition
           Point p=new Point(-8, -8);
           w.setPosition(p);
           Thread.sleep(5000);
           
           // fullscreen
           //w.fullscreen();
		  
		
		  
		
		  
		  
	}

}
