package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableClick {

	public static void main(String[] args) {
String given_url= ""
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
WebElement window64 = driver.findElement(By.linkText("jdk-11.0.21_windows-x64_bin.exe"));
	JavascriptExecutor js = (javascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(false);",window64);
	window64.click();
	WebElement disable = driver .findElement(null)
	}

}
