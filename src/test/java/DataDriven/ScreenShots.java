package DataDriven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/V4/");
		


		

		//complete page appeared on Screen		
		TakesScreenshot TS=(TakesScreenshot)driver;
		File Loginpage=TS.getScreenshotAs(OutputType.FILE);
		
		File LoginTrg= new File("C:\\Users\\Sony\\eclipse-workspace\\app1\\screenshot\\login.png");
		FileUtils.copyFile(Loginpage, LoginTrg);
		
		//Element on screen
		WebElement Ikons=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/table"));
		File IKON1=Ikons.getScreenshotAs(OutputType.FILE);
		File SCTrg= new File("C:\\Users\\Sony\\eclipse-workspace\\app1\\screenshot\\4icons.png");
		FileUtils.copyFile(IKON1, SCTrg);

	}

}
