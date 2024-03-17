package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElement {

	public static void main(String[] args) throws IOException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/digital-downloads");
			TakesScreenshot ts= (TakesScreenshot)driver;
			org.openqa.selenium.WebElement electronics = driver.findElement(By.xpath("//a[contains(text(),'Electronics')]"));
			File from = electronics.getScreenshotAs(OutputType.FILE);		
			File to = new File("G:\\screenShot\\Electronics.png");
			FileHandler.copy(from, to);
				}
}
