package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector {
	public static void main(String[] args) {
		//open the browser
		WebDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//enter into web driver
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("input[id='small-searchterms']"));
		driver.close();
	}

}

