package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//WithPOM

public class LoginPage {
	

    WebDriver adriver;

    public LoginPage (WebDriver rDriver)  
    {  
     adriver =rDriver;         

      PageFactory.initElements(rDriver,this); 
   } 
    @FindBy(id ="PnlLoginPage_loginControl_UserName")
    WebElement user;

    @FindBy(id="PnlLoginPage_loginControl_Password")
    WebElement Pswrd;
    
    @FindBy(id="PnlLoginPage_loginControl_LoginButton")
    WebElement SignInBttn;
    
    @FindBy(xpath= "//td[@id='ctl00_MainMenuSub_DXI2_I']")
    WebElement clickonCRM;
    
    @FindBy(xpath= "//a[@id='ctl00_userLoginStatus']")
    WebElement ClickonLogout;
    
    public void enterUsername(String usernamead)
    {
    	user.sendKeys(usernamead);
    }
    public void enterPswrd(String password)
    {
    	Pswrd.sendKeys(password);
    }
    public void clickonSignin()
    {
    	SignInBttn.click();
    
    }
    public void clickOnCrm()
    {
    	clickonCRM.click();
    }
    public void clickOnLgout()
    {
    	ClickonLogout.click();
    }
}