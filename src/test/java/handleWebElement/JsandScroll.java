package handleWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utilities.DriverSetup;

public class JsandScroll extends DriverSetup {
	public static String baseUrl = "https://rahulshettyacademy.com/AutomationPractice/";

	@Test
	public void ScrollUsingJs() throws InterruptedException  {
		driver.get(baseUrl);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		Thread.sleep(5000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//		Thread.sleep(5000);
//		js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
//		Thread.sleep(5000);
		WebElement mouseHover = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mousehover")));
//		js.executeScript("arguments[0].scrollIntoView();", mouseHover);
		scrollToElemnt(mouseHover);
		Thread.sleep(5000);
	}
	
	public void scrollToElemnt(WebElement elemnt) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", elemnt);
	}


}
