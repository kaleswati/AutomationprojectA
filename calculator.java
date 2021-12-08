package TextNG_program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class calculator 
{
  @Test
  public void Cal() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenum jar\\chromedriver.exe");
	  WebDriver w=new ChromeDriver();
      w.get("https://www.calculator.net/");  
      w.findElement(By.xpath("//span[contains(text(),'4')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'2')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'3')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'×')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'5')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'2')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'5')]")).click();
   
	   w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     // Thread.sleep(500);
	  
	  w.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
	  
      w.findElement(By.xpath("//span[contains(text(),'4')]")).click();
      w.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
      w.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
      w.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();     
      w.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[4]")).click();
      w.findElement(By.xpath("//span[contains(text(),'2')]")).click();
      w.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
      w.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
      
      //Thread.sleep(5000);
	  w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
      w.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
      
      w.findElement(By.xpath("//span[contains(text(),'–')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'2')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'3')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'4')]")).click();     
      w.findElement(By.xpath("//span[contains(text(),'2')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'3')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'4')]")).click();
      w.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/span[4]")).click();
      w.findElement(By.xpath("//span[contains(text(),'3')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'4')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'5')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'3')]")).click();     
      w.findElement(By.xpath("//span[contains(text(),'4')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'5')]")).click();
     
      w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         //Thread.sleep(5000);
	   
      w.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
    
      w.findElement(By.xpath("//span[contains(text(),'2')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'3')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'4')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'8')]")).click();     
      w.findElement(By.xpath("//span[contains(text(),'2')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'3')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'–')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'–')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'2')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'3')]")).click();
      w.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();     
      w.findElement(By.xpath("//span[contains(text(),'9')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'4')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'8')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'2')]")).click();
      w.findElement(By.xpath("//span[contains(text(),'3')]")).click();
      
      w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      //Thread.sleep(5000);
	   
      w.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
      
      w.close();
      

  }
}
