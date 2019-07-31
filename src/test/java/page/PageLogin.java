package page;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class PageLogin {

	private WebDriver driver;
	private By userField ;
	private By passField ;
	private By loginButton;
	public PageLogin(WebDriver driver) {
		 this.driver = driver;
		 userField = By.name("userName");
		 passField = By.name("password");
		 loginButton = By.name("login");
	}
	
	
	public void login(String user, String pass) {
		// TODO Auto-generated method stub
		
		driver.findElement(userField).sendKeys(user);
		driver.findElement(passField).sendKeys(pass);
		driver.findElement(loginButton).click();
		File scren = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

				try{
					FileUtils.copyFile(scren,new File("prueba.png"));
				}catch(IOException e){

				e.printStackTrace();

				}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
}
