package pagefactoryobject1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SortProdPageFactory1 {
	
	WebDriver driver;
	
	@FindBy(how=How.NAME, using="manufacturers_id")
	WebElement Prod_DropDown;
	
	public SortProdPageFactory1(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public Select getManufName(){
		return new Select(Prod_DropDown);
	}
}