package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_class1 {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
driver.close();
	}

}
