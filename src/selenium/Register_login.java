package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_login {

	public static void main(String[] args) throws InterruptedException {
WebDriver test = new ChromeDriver();
test.manage().window().maximize();
test.get("https://demowebshop.tricentis.com/");
Thread.sleep(2000);
test.findElement(By.className("ico-register")).click();
Thread.sleep(2000);
test.findElement(By.id("gender-male")).click();
test.findElement(By.id("FirstName")).sendKeys("RESHU");
test.findElement(By.id("LastName")).sendKeys("User");
test.findElement(By.name("Email")).sendKeys("testop35@yopmail.com");
Thread.sleep(2000);
//String pass ="test@212";
test.findElement(By.id("Password")).sendKeys("test@9040");
test.findElement(By.id("ConfirmPassword")).sendKeys("test@9040");
Thread.sleep(2000);
test.findElement(By.name("register-button")).click();
//test.findElement(by)









	}

}
