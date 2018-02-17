package pagefactorytestscripts1;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagefactoryobject1.HomePageFactory1;



public class HomePageTest1  {
	
	WebDriver driver;
	HomePageFactory1 home_page;

	@BeforeTest
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://107.170.213.234/catalog/login.php");
		driver.manage().window().maximize();
	}
	
	@Test
	public void assertHomepage(){
		//setUp();
		System.out.println("Browser was successfully launched");
		home_page = new HomePageFactory1(driver);
		home_page.completeLogin("johnyk2020@gmail.com", "merkato");
		System.out.println("Attempted login");
		assertEquals(driver.getTitle(), "iBusiness");
		
		
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}

}