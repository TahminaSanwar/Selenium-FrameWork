package progressive.qa.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ProductsPage;

public class BaseClass {
	// public static void main(String[] args) {
	// System.setProperty("webdriver.chrome.driver",
	// "C:\\Users\\sanwa\\eclipse-workspace2\\SeleniumPractice\\driver\\chromedriver.exe");
	// WebDriverManager.chromedriver().setup();
	// this will take care of the first line where we showed the path
	// WebDriver driver = new ChromeDriver();
	// driver.get("https://www.progressive.com/");
	// }
	// we can delete the upper portion and start directly from (under) testNG. Under
	// main method we can not test more than one test cases.
	public static WebDriver driver;
	public ProductsPage productsPage;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.progressive.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		initElements();//Question
	}

	@AfterMethod
	public void quttingBrowser() {
		 driver.quit();
	}

	private void initElements() {//WHY??
		productsPage = new ProductsPage(driver);
	}
}
