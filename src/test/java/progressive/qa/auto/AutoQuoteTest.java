package progressive.qa.auto;

import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



import progressive.qa.base.BaseClass;

public class AutoQuoteTest extends BaseClass {
	
	@Test
	public void autoQuoteTesting() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(productsPage.autoButton));
		productsPage.autoButton.click();
		
		wait.until(ExpectedConditions.visibilityOf(productsPage.zipCodeText));//Without creating the object how are we getting the property of this class
		String zipCodeText = productsPage.zipCodeText.getText();
		
		System.out.println(">>>>>>>>>>>>>>>>>> "+zipCodeText);	
	}
}


	/*@Test
	public void test() {
		driver.findElement(By.xpath("//div[@id='NavContainer']")).click();
		driver.findElement(By.xpath("//input[@uct_overlay']id='prod"));
	}
	
}*/
	

