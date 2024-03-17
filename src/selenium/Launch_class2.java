package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_class2 {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage() .window().maximize();
driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_g50zekzm1_e&adgrpid=155259812313&hvpone=&hvptwo=&hvadid=676742245162&hvpos=&hvnetw=g&hvrand=622395238948454600&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007751&hvtargid=kwd-29089120&hydadcr=5496_2408769");
driver.close();
	}

}
