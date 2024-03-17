package Iframe;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/saurabh/Downloads/Telegram%20Desktop/iframe%20(1).html");
		
		driver.findElement(By.xpath("//a[@href=http://google.com']")).click();
		driver.navigate().back();
		driver.switchTo().frame("FR1");
		driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']")).sendKeys("Demo-search");
}

}
