package stepsDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginstepsDefinations {
	WebDriver driver;

	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.phptravels.net/admin	");
		System.out.println("User is already on login page");
		   
	}

	@When("^title of login page is$")
	public void title_of_login_page_is() throws Throwable {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Administator Login",title);
		
	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username ,String pwd) throws Throwable {
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement login_Btn = driver.findElement(By.xpath("//button/span[text()='Login']"));
		email.sendKeys(username);
		password.sendKeys(pwd);
//		driver.findElement(By.xpath("//span[contains(text(),'Email Address')]")).sendKeys(username);
//		driver.findElement(By.xpath("//span[contains(text(),'Password')]")).sendKeys(password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
	}
	
	@Then("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		WebElement HomePage=driver.findElement(By.xpath("//p[contains(text(),'DASHBOARD')]"));
		HomePage.getText();
		if(HomePage.getText().contains("DASHBOARD"))
		{
			System.out.println("User is on Home Page");
			
		}else {
			System.out.println("User is not on Home  Page");
		}
		
	   
	}
}
