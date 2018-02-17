package pagefactoryobject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory1 {

//this is the webdriver
	WebDriver driver;
	// this is how the elements are located
	@FindBy(how = How.CSS, using = "input[name='email_address']")
	WebElement email_address;
	
	@FindBy(how = How.CSS, using = "input[name='password']")
	WebElement pword;
	
	@FindBy(how = How.CSS, using = "button#tdb5 > span.ui-button-text")
	WebElement sign_in;
	
	
	public HomePageFactory1(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void typeEmail(String email){
		email_address.sendKeys(email);
	}
	
	public void typePassword(String p_word){
		pword.sendKeys(p_word);
	}
	
	public void clickSignIn(){
		sign_in.click();
	}
	
	public void completeLogin(String email, String pword){
		typeEmail(email);
		typePassword(pword);
		clickSignIn();
	}

}
	
	
	