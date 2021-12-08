package STP11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calcultorjava
{
	WebDriver w;
	@Given("Launch browser and open Url")
	public void launch_browser_and_open_Url() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenum jar\\chromedriver.exe");
		w=new ChromeDriver();
		w.get("https://www.calculator.net/");
	}

	@When("Multiplication Of N1 and N2")
	public void multiplication_Of_N1_and_N2() throws InterruptedException
	{
		w.findElement(By.xpath("//span[contains(text(),'4')]")).click();
	      w.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	      w.findElement(By.xpath("//span[contains(text(),'3')]")).click();
	      w.findElement(By.xpath("//span[contains(text(),'×')]")).click();
	      w.findElement(By.xpath("//span[contains(text(),'5')]")).click();
	      w.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	      w.findElement(By.xpath("//span[contains(text(),'5')]")).click();
	   
		   //w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     Thread.sleep(500);
		  
		  w.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
	}

	@And("Division  Of N1 and N2")
	public void division_Of_N1_and_N2() throws InterruptedException 
	{
		 w.findElement(By.xpath("//span[contains(text(),'4')]")).click();
	      w.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
	      w.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
	      w.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();     
	      w.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[4]")).click();
	      w.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	      w.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
	      w.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
	      
	    Thread.sleep(5000);
		  //w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   
	      w.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
	}

	@And("Addition Of N1 and N2")
	public void addition_Of_N1_and_N2() throws InterruptedException
	{
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
	     
	      //w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        Thread.sleep(5000);
		   
	      w.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
	}

	@When("Substraction  N1 and N2")
	public void substraction_N1_and_N2() throws InterruptedException
	{
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
	      
	      //w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     Thread.sleep(5000);
		   
	      w.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
	      
	}

	@Then("display the Result")
	public void display_the_Result()
	{
		System.out.println("Registration done ");
	}

}
