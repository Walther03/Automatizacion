package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PageReser {
	private WebDriver driver;
	private By textTitle ;
	private By PasDrop;
	private By FromDrop;
	private By radio;
	
	public PageReser(WebDriver driver) {
		// TODO Auto-generated method stub
		this.driver = driver;
		textTitle= By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font/b");
		PasDrop = By.name("passCount")	;	
		FromDrop = By.name("fromPort")	;	
		
		
		 radio = By.name("tripType");							
         
		
		
		
	}
	
	
	public void pageReser() {
		// TODO Auto-generated method stub
		Assert.assertTrue(driver.findElement(textTitle).getText().contains("Welcome back to"));
		
	}
	
	public void selectdroPas(int cant) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement pasajeroscant = wait.until(ExpectedConditions.presenceOfElementLocated(PasDrop));
		Select selectpasajeros  = new Select(pasajeroscant);
		selectpasajeros.selectByVisibleText(Integer.toString(cant));
	}
	
	public void selectdropFrom(String index) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement fromlist = wait.until(ExpectedConditions.presenceOfElementLocated(FromDrop));
		Select selectdropFrom  = new Select(fromlist);
		selectdropFrom.selectByVisibleText(index);
	}
	
	
	public void selectRadio() {
		
		WebElement oCheckBox = driver.findElement(By.cssSelector("input[value='oneway']"));
		 
		 oCheckBox.click();
		 
	}

}
