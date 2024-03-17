package Framework;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadrivenframework {
	@Test(dataProvider= "login")
	public void receiver(String email,String password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("rememberMe")).click();
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.close();	

}
	@DataProvider(name = "login")
	public Object [][] sender(){
		File file =new File("C:\\Users\\saurabh\\Documents\\data.xlax");
		FileInputStream fis =new FileInputStream(file);
		Workbook wb =WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("sheet");
		int row = sheet.getPhysicalNumberOfRows();
		int colon = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][]obj=new Object[row][colon];
		for (int i=0;i<row;i++);
		for(int j=0;j<colon;j++);
		obj[i][j]=sheet.getRow(i).getCellComment(j).tostring();
		
	}
}
return obj;
}
}
