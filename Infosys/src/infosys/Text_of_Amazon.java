package infosys;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_of_Amazon
{
	public static void main(String[] args) throws Exception 
	{
		  //open browser
		  System.setProperty("webdriver.chrome.driver", "E:\\Automaion softwares\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  
		  //launch site
		  driver.get("https://www.amazon.in");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mi mobiles",Keys.ENTER);
		  Thread.sleep(5000);
		 
		 //Collect all items in 1st page
    List<WebElement> items= driver.findElements(By.xpath("//div[@class='sg-row'][2]/div[2]/descendant::div/div/div/div/div/h2/a/span"));
     System.out.println(items.size());
     
     //Display each item text
     for(WebElement item:items)
     {
    	String s= item.getText();
        System.out.println(s);

    	
     }

	}

}
