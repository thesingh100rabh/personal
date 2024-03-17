package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {

	public static void main(String[] args) {
		
		//open the browser
WebDriver driver = new ChromeDriver();
//maximize the browser
driver.manage().window().maximize();
// enter into the DWS webpage
driver.get("https://demowebshop.tricentis.com/");
driver.close();

	}

}

