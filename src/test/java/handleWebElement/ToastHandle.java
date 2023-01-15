package handleWebElement;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.DriverSetup;

public class ToastHandle extends DriverSetup{
	public static String baseUrl = "https://member.daraz.com.bd/user/login";
	
	@Test
	public void handleToast() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Please enter your Phone Number or Email']"));
		username.sendKeys("01234567891");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Please enter your password']"));
		password.sendKeys("asaddwew");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='LOGIN']")).click();
		Thread.sleep(1000);
		WebElement tostMessage = driver.findElement(By.className("next-feedback-content"));
		assertEquals(tostMessage.getText(), "Please enter a valid phone number.");
		Thread.sleep(2000);
	}

}
