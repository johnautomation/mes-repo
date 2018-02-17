package pagefactoryobject1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductPageFactory1 {

	WebDriver driver;
	
	@FindBy(how=How.LINK_TEXT, using="new products")
	WebElement new_product;
	@FindBy(how=How.LINK_TEXT, using="Blade Runner - Director's Cut")
	WebElement blade_prod;
	@FindBy(how=How.ID, using="tdb5")
	WebElement add_bladecart;
	@FindBy(how=How.ID, using="tdb6")
	WebElement checkout_blade;
	@FindBy(how=How.ID, using="tdb6")
	WebElement shipping_info;
	@FindBy(how=How.NAME, using="payment")
	WebElement cashondelivery;
	@FindBy(how=How.ID, using="tdb6")
	WebElement payment_info;
	@FindBy(how=How.ID, using="tdb5")
	WebElement order_confirm;
    @FindBy(how=How.NAME, using="notify[]")
    WebElement check_order;
    @FindBy(how=How.ID, using="tdb5")
    WebElement order_proc;
	
    public ProductPageFactory1(WebDriver driver){
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
	
    public void clickNew_ProductLink() {
		new_product.click();
	}

	public void clickBladeRunner_prod() {
		blade_prod.click();
	}

	public void addBladeRunnerToCart() {
		add_bladecart.click();
	}

	public void checkoutBladeRunnerProd() {
		checkout_blade.click();
	}

	public void clickOnDeliveryInfo() {
		shipping_info.click();
	}

	public void clickPaymentCashOnDelivery() {
		cashondelivery.click();
	}

	public void clickOnPaymentToConf() {
		payment_info.click();
	}

	public void clickOnOrderConf() {
		order_confirm.click();
	}

	public void clickCheckBoxBladeRunner() {
		check_order.click();
	}
	
	
}

	