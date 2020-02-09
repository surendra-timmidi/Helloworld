package magnitia;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mutlidropdowns 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automaion softwares\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
	    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	    
	    driver.switchTo().frame("iframeResult");
	   WebElement e= driver.findElement(By.xpath("//select[@name='cars']"));
	   Select s=new Select(e);
	   s.selectByIndex(3);
	   s.selectByVisibleText("Audi");
	   List<WebElement> l=s.getAllSelectedOptions();
	  
			
	}

}
