package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	// Locators 
	By header=By.xpath("//h2");
	By username=By.xpath("//tr[1]/td[2]/input");
	By password=By.xpath("//tr[2]/td[2]/input");
	By submit=By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input");
	String URL="https://demo.guru99.com/v4/";
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public void URL() {
		driver.get(URL);
	}
	public void verifyLogin() {
		driver.findElement(username).sendKeys("mngr512103");
		driver.findElement(password).sendKeys("ahUdAsA");
		driver.findElement(submit).click();
	}
	

}
