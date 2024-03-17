package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import TakeScreenShot.WebElement;

public class DisableValue_1 {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://www.facebook.com/signup");
JavascriptExecutor js = (JavascriptExecutor)driver;
org.openqa.selenium.WebElement hidden_textField =driver.findElement(By.xpath("//input[@name='custom_gender']"));
js.executeAsyncScript("arguments[0].value ='Saurabh'",hidden_textField);
	}

}
