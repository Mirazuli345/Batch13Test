package handleWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.DriverSetup;

public class IFrameHandle extends DriverSetup {
	public static String baseUrl = "https://jqueryui.com/checkboxradio";

	@Test
	public void handleIframe() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(5000);
//		WebElement iframe = driver.findElement(By.className("demo-frame"));
		WebElement iframe = getElement(By.className("demo-frame"));
		driver.switchTo().frame(iframe);
//		driver.switchTo().frame(0);
		Thread.sleep(2000);
//		WebElement newYorkRadioButton = driver.findElement(By.xpath("//label[normalize-space()='New York']"));
//		WebElement newYorkRadioButton = getElement(By.xpath("//label[normalize-space()='New York']"));
//		newYorkRadioButton.click();
		clickOnElement(By.xpath("//label[normalize-space()='New York']"));
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
//		WebElement textElement = driver.findElement(By.xpath("//p[@class='desc']"));
//		WebElement textElement = getElement(By.xpath("//p[@class='desc']"));
//		System.out.println(textElement.getText());
		System.out.println(getElementText(By.xpath("//p[@class='desc']")));
		Thread.sleep(5000);
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void clickOnElement(By locator) {
		getElement(locator).click();
	}
	
	public String getElementText(By locator) {
		return getElement(locator).getText();
	}

}
