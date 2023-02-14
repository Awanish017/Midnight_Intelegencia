package PageObjects;
//Testing
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrmPage {
WebDriver ldriver;


public CrmPage(WebDriver rdriver)
{ldriver=rdriver;
PageFactory.initElements(rdriver, this);

}

 @FindBy(id= "ctl00_newAddButton_CD")
WebElement NewCstBtn;
 
 @FindBy(xpath="//div[@id='ctl00_mainContentPlaceHolder_cancelButton_CD']")
 WebElement CancelBttn;
 
 public void ClickOnNewCustomer(){
	 NewCstBtn.click();
 }
 public void ClickOnCancelbttn(){
	 CancelBttn.click();
 }
 
}