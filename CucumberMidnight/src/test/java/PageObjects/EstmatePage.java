package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EstmatePage {
	WebDriver ldriver;
	public EstmatePage(WebDriver rdriver){
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Estimates']")
	WebElement ClkEstimate;
	@FindBy(xpath="//span[normalize-space()='New Estimate']")
	WebElement NewEstmate;
	

	public void clickOnEstModule()
	{
		ClkEstimate.click();
	}
public void clickOnNewEstmt()
{
	NewEstmate.click();
	}

}
