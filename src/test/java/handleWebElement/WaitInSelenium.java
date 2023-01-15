package handleWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utilities.DriverSetup;

public class WaitInSelenium extends DriverSetup {
	public static String baseUrl = "https://qavbox.github.io/demo/delay/";

	@Test
	public void seleniumWait() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(baseUrl);
		By lateText = By.xpath("//h2[@id='two']");
		By delayText = By.xpath("//h2[@id='delay']");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		
		WebElement lateTextElement = driver.findElement(lateText);
		
		System.out.println("Line 1 " +lateTextElement.getText());
		wait.until(ExpectedConditions.textToBePresentInElement(lateTextElement, "I am here!"));
		System.out.println("Line 2 " +lateTextElement.getText());
		
		
		driver.findElement(By.xpath("//input[@name='commit1']")).click();
		WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(delayText));
		System.out.println(textElement.getText());
		
		
	}

}
