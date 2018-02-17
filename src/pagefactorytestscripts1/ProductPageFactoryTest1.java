package pagefactorytestscripts1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagefactoryobject1.HomePageFactory1;
import pagefactoryobject1.ProductPageFactory1;

public class ProductPageFactoryTest1 {

	WebDriver driver;
	HomePageFactory1 home_page;
	ProductPageFactory1 prod_page;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://107.170.213.234/catalog/login.php");
		driver.manage().window().maximize();
	}

	@Test
	public void verifyProductDetailsTest() {
		//setUp();
		System.out.println("Browser was successfully launched");
		home_page = new HomePageFactory1(driver);
		home_page.completeLogin("johnyk2020@gmail.com", "merkato");
		prod_page = new ProductPageFactory1(driver);
		prod_page.clickNew_ProductLink();
		prod_page.clickBladeRunner_prod();
		prod_page.addBladeRunnerToCart();
		prod_page.checkoutBladeRunnerProd();
		prod_page.clickOnDeliveryInfo();
		prod_page.clickPaymentCashOnDelivery();
		prod_page.clickOnPaymentToConf();
		prod_page.clickOnOrderConf();
		prod_page.clickCheckBoxBladeRunner();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}