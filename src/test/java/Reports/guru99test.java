package Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Reports.ExtentReportManager.class)
public class guru99test {
	WebDriver driver;
	@Test
	void OpenApp() {
		
		
		driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/V4/");
		
	}
	@Test(priority=1)
	void Login() {
		driver.findElement(By.name("uid")).sendKeys("mngr529637");
		driver.findElement(By.name("password")).sendKeys("YdygUmy");
		driver.findElement(By.name("btnLogin")).click();
		
	}
	@Test(priority=2)
	void TearDown() {
		driver.close();
		
	}

}
