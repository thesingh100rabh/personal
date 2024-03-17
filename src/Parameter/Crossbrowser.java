package Parameter;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
	WebDriver driver;
@Parameters("Browser")
	@Test()
	public void dws2(String durl ) {
		//open the browser
		if(durl.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if (durl.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else {
			driver = new FirefoxDriver();
		}

	}

}
