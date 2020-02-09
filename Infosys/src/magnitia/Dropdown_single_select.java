package magnitia;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_single_select 
{
	public static void main(String[] args) throws Exception
	{
		  // open browser
		  System.setProperty("webdriver.chrome.driver", "E:\\Automaion softwares\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  
		  //launch site
		  driver.get("https://semantic-ui.com/modules/dropdown.html");
		  Thread.sleep(5000);
		  driver.manage().window().maximize();
		  //check single select or multi slect
		  WebElement dd= driver.findElement(By.xpath("//a[@id='selection']/following-sibling::div[2]"));
		 
		   if(dd.getAttribute("class").contains("multiple"))
		   {
			 System.out.println("multi-select dropdown");
		   }
		   else
		  {
			 System.out.println("single-select dropdown");
		  }
		  //Display count and display each item text
		  List <WebElement> items= dd.findElements(By.xpath("child::div[2]/div"));
		  System.out.println("count of items :"+items.size());
		  
		  for(WebElement item:items)
		  {
			String x=  (String) driver.executeScript("return arguments[0].textContent", item);
			System.out.println(x);
			
		  }
		 //select an item in that dropdown(open)
		  for(WebElement item:items)
		  {
			 //open dropdown
			 dd.click(); 
			 Thread.sleep(5000);
			 if(item.isDisplayed())
			 {
				 //remeber dropdown
				String expected= item.getText();
				
				//select one item
				String actual= driver.findElement(By.xpath("child::div[1]")).getText();
				
				if(expected.equals(actual))
				{
					System.out.println( expected+"test passed");
				}
				else
				{
					System.out.println(expected+"test failed");
				}
			 }
		  }
		  
		  
		 //Display test of selected
		 //close site
		 
		 

	}

}
