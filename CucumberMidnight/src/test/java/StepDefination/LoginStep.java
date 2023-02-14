package StepDefination;



import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.CrmPage;
import PageObjects.EstmatePage;
import PageObjects.LoginPage;
import PageObjects.OrderPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginStep extends Base {
	
	
	
	@Given("User Launch Chorme Browser")
	public void user_launch_chorme_browser() {
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        CRMpg =new CrmPage(driver);
       login = new LoginPage(driver);
       Estpg= new EstmatePage(driver);
       Orderpg =new OrderPage(driver);
      
	   
	}

	@When("User Open URL {string}")
	public void user_open_url(String url) {
		driver.get(url);
	   
	}

	@When("User Enter User Name {string}")
	public void user_enter_user_name(String user1) {
        login.enterUsername(user1);
	    
	}

	@When("User Enter Password {string}")
	public void user_enter_password(String pwd) {
	    login.enterPswrd(pwd);
	}

	@When("User Click on Login Button")
	public void user_click_on_login_button() {
		login.clickonSignin();
	    
	}

	@Then("Page titel should be {string}")
	public void page_titel_should_be(String exptedTittle) {
		String actualtitle=driver.getTitle();
		
		if(actualtitle.equals(exptedTittle))
		{
			Assert.assertTrue(true);  
		}
		else {
			Assert.assertTrue(false);
		   }
	}

	

	@Then("Click on Logout button")
	public void click_on_logout_button() {
		login.clickOnLgout();
	    
	}

	@Then("Close the Browser")
	public void close_the_browser() {
	    driver.close();
	}
	
/////////////CRM----Module//////////////////////////////////////////////////////////	
	
	@When("User Click on CRM Module")
	public void user_click_on_crm_module() {
		login.clickOnCrm();
	    
	}
	@When("Click on New Customer Button")
	public void click_on_new_customer_button() {
		
		CRMpg.ClickOnNewCustomer();
	    
	}

	@When("Click on Cancel Button")
	public void click_on_cancel_button() {
		CRMpg.ClickOnCancelbttn();
	    
	}

	///////////////////////Estimate module////////////////////////////////////////
	@When("Click on Estimate MOdule")
	public void click_on_estimate_m_odule() {
		Estpg.clickOnEstModule();
	    
	}

	@When("Click on New Estimate Butto")
	public void click_on_new_estimate_butto() {
	   Estpg.clickOnNewEstmt();
	}
/////////////////////////////////// Order Module/////////////////////////////////////
	
	@Then("Click OrderModule")
	public void click_order_module() {
	   Orderpg.clickonOrder();
	}

	@Then("Click on ExtendedSearch Button")
	public void click_on_extended_search_button() {
	    Orderpg.clickonExtendedSearchBttn();
	}

	@Then("Click on Extendesearch Cancel button")
	public void click_on_extendesearch_cancel_button() {
	    Orderpg.cancelextendedbutton();
	}

	@Then("Click on New Order Button")
	public void click_on_new_order_button() {
		Orderpg.NewOrder();
	    
	}

	@Then("Click on Order Cancel button")
	public void click_on_order_cancel_button() {
	    Orderpg.OrderCancelbttn();
	}

}
