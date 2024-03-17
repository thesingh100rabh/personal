package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Notification {

	public static void main(String[] args) throws InterruptedException, AWTException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");
Thread.sleep(2000);
Robot rbt = new Robot();
rbt.keyPress(KeyEvent.VK_TAB);
Thread.sleep(2000);
rbt.keyPress(KeyEvent.VK_TAB);
Thread.sleep(2000);
rbt.keyPress(KeyEvent.VK_TAB);
Thread.sleep(2000);
rbt.keyPress(KeyEvent.VK_TAB);
Thread.sleep(2000);
rbt.keyPress(KeyEvent.VK_TAB);
Thread.sleep(2000);
rbt.keyPress(KeyEvent.VK_TAB);
Thread.sleep(2000);

rbt.keyPress(KeyEvent.VK_S);
rbt.keyPress(KeyEvent.VK_A);
rbt.keyPress(KeyEvent.VK_U);
rbt.keyPress(KeyEvent.VK_R);
Thread.sleep(2000);
rbt.keyRelease(KeyEvent.VK_TAB);

rbt.keyRelease(KeyEvent.VK_S);
rbt.keyRelease(KeyEvent.VK_A);
rbt.keyRelease(KeyEvent.VK_U);
rbt.keyRelease(KeyEvent.VK_R);





	}

}
