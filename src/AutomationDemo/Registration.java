package AutomationDemo;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver =new ChromeDriver();
driver.manage(). window().maximize();
driver.get("https://demo.automationtesting.in/Register.html");
driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("SAURABH");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("SINGH");
Thread.sleep(2000);
driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("NEW DELHI");
Thread.sleep(2000);
driver.findElement(By.xpath("//INPUT[@type='email']")).sendKeys("sbm.tara@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//INPUT[@type='tel']")).sendKeys("7978710169");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='radio']")).click();




	}

}
