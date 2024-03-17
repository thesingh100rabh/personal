package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicClass {
	public static WebDriver driver;

public static void precondition(){
	driver = new ChromeDriver();
	driver.manage() .window() .maximize();
	}

public static void precondition1(){
	driver = new FirefoxDriver();
	driver.manage() .window() .maximize();
	}
public static void postcondition() {
	driver.close();
}
public static void postcondition1() {
	driver.quit();
}

}
