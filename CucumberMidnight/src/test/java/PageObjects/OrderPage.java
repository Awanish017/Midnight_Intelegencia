package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
	WebDriver ldriver;
	
	public OrderPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	
	}


	


	@FindBy(xpath="//a[normalize-space()='Orders']")
	WebElement clickonorder;
	
	@FindBy(xpath="//span[normalize-space()='Extended Search']")
	WebElement extendbutnclick;
	
	@FindBy(xpath="//span[normalize-space()='Cancel']")
	WebElement extendserchcancel;
	
	@FindBy(xpath="//div[@id='ctl00_newAddButton_CD']")
	WebElement clickonOrderbttn;
	
	@FindBy(xpath="//div[@id='ctl00_mainContentPlaceHolder_cancelButton_CD']//span[contains(text(),'Cancel')]")
	WebElement ordercanclebtn;
	
	public void clickonOrder()
	{
		clickonorder.click();
	}
	public void clickonExtendedSearchBttn()
	{
		extendbutnclick.click();
	}
	public void cancelextendedbutton()
	{
		extendserchcancel.click();
	}
	public void NewOrder()
	{
		clickonOrderbttn.click();
	}
	public void OrderCancelbttn()
	{
		ordercanclebtn.click();
	}
}
