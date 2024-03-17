package SeleniumWaitCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Omayo {

		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://omayo.blogspot.com/");
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
			WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='dropbtn']")));
			dropdown.click();
			WebElement flip = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='http://flipkart.com/']")));
			//flip.click();
			
			WebElement button =wait.until(ExpectedConditions.elementToBeClickable(By.id("[id=timerButton]")));
			button.click();
			driver.close();

				}

	
	}

