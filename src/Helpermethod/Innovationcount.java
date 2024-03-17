package Helpermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Innovationcount {
	@Test(priority=3,invocationCount=3)//execute as many time as invocationCount provided
	public void demo() {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.automationtesting.in/Alerts.html");
		 driver.close();
		 Reporter.log("demo",true);
	}
	@Test(priority=2)
	public void redbus() {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.redbus.in/");
		 driver.close();
		 Reporter.log("redbus",true);
}
	@Test(priority=1)
	public void flipcart() {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 driver.close();
		 Reporter.log("flipcart",true);
	}
	@Test(priority=0)
	public void flipcart1() {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 driver.close();
		 Reporter.log("flipcart1",true);
}
}


