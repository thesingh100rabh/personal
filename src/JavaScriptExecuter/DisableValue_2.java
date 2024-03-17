package JavaScriptExecuter;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DisableValue_2 {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://www.skillrary.com/");
Actions a =new Actions(driver);
//JavascriptExecutor js = (JavascriptExecutor)driver;
WebElement gear =driver.findElement(By.xpath("[class='menu_container']"));
a.moveToElement(gear);
driver.findElement(By.xpath("//a[text()=\' SkillRary Demo APP\'] ")).click();

	}

}
