package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.agoda.com/");
Thread.sleep(9000);
driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@leadingicon='CloseSymbolFill']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("////i[@class='ficon IconBox__icon ficon-20 ficon-check-in]")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//div[@aria-label='Check-in 11 Mar 2024 Monday']")).click();


}

}
