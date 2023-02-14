package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {



	WebDriver driver=null;

	@Given("User is on login page")
	public void user_is_on_login_page() {

		System.setProperty("webdriver.chrome.driver","C:/Users/abc/workspace/CucumberJava/src/test/resources/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rc.vsmidnight.com");

		System.out.println("Open RC Vsmidnight Login Page");
	}
	@When("Enter user name and Password")
	public void user_enter_user_name_and_password() {
		driver.findElement(By.id("PnlLoginPage_loginControl_UserName")).sendKeys("vsuser");
		System.out.println("Enter UserName");
		driver.findElement(By.id("PnlLoginPage_loginControl_Password")).sendKeys("Inthemidnighthour");
		System.out.println("Enter Password");

	}

	@And("Click on Login button")
	public void user_click_on_login_button() {
		driver.findElement(By.id("PnlLoginPage_loginControl_LoginButton")).click();
		System.out.println("Click on Sign In Button");

	}

	@Then("User is navigated on Home page")
	public void user_is_navigated_on_home_page() throws InterruptedException {
		System.out.println("VsMidnight Dashboard page opened successfully");
		driver.findElement(By.linkText("Estimates")).click();
		System.out.println("Estimate Search Screen Page Open");
		driver.findElement(By.id("ctl00_newAddButton_B")).click();
		System.out.println(" Create new Estimate Page is opened");


		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Customer Search']")).click();
		driver.wait(3000);
		driver.findElement(By.name("customerGridView$DXFREditorcol0")).click();

		//Click on Country Dropdown


	}

}
