package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Class1fblogin {
	WebDriver driver=null;
	int s1=3000;
	String url="https://www.facebook.com/";
	@Given("open url facebook")
	public void open_url_facebook() throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		 co.addArguments("--disable-notifications");
		 driver=new ChromeDriver(co);
		 driver.get(url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 Thread.sleep(s1);	
	    
	}

	@And("^valid (.*)and (.*)$")
	public void valid_thrinadhram00206_gmail_com_and_thrinadh(String uid,String pwd) throws InterruptedException {
		 driver.findElement(By.id("email")).sendKeys(uid);
		    Thread.sleep(s1);                 
		    driver.findElement(By.id("pass")).sendKeys(pwd);  
		    Thread.sleep(s1);    
		    }

	@Then("click on login")
	public void click_on_login() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(s1);    
	}

	@Given("Select Groups")
	public void select_groups() throws InterruptedException {
	 driver.findElement(By.xpath("//span[text()='Groups']")).click();
	 Thread.sleep(s1);
	}

	@And("Navigate back")
	public void navigate_back() throws InterruptedException {
	  driver.navigate().back();
	  Thread.sleep(s1);
	}

	@Given("Select Events")
	public void select_events() throws InterruptedException {
	 driver.findElement(By.xpath("//span[text()='Events']")).click();
	 Thread.sleep(s1);
	 driver.navigate().back();   
	 Thread.sleep(s1);
	}

	@And("close browser")
	public void close_browser() {
	 driver.close();   
	}


}
