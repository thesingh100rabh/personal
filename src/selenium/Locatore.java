package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locatore extends BasicClass{

	public static void main(String[] args) throws InterruptedException {
		precondition();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		// driver.findElement(By.id("pollanswers-1")).click();
	// driver.findElement(By.id("pollanswers-2")).click();
	// driver.findElement(By.id("pollanswers-3")).click();
	// driver.findElement(By.id("pollanswers-4")).click();
List<WebElement> community_poll = driver.findElements(By.cssSelector("input[value='Add to cart']"));
for(WebElement web : community_poll) {
	web.click();
	Thread.sleep(2000);
}	driver.close();

		//postcondition();
	}

}
