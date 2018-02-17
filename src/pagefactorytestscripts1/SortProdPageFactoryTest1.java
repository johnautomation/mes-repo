package pagefactorytestscripts1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagefactoryobject1.SortProdPageFactory1;

public class SortProdPageFactoryTest1 {
	WebDriver driver;
	SortProdPageFactory1 sort_prod;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://107.170.213.234/catalog/login.php");
		driver.manage().window().maximize();

	}

	@Test
	public void VerifySortProd_Name() {
		//setUp();
		System.out.println("Browsers was successfully launched");
		sort_prod = new SortProdPageFactory1(driver);
		sort_prod.getManufName().selectByVisibleText("Microsoft");
      System.out.println("product was succesfully sorted");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}