package test;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.Value;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helpers.Helpers;
import page.PageLogin;
import page.PageReser;
import page.ReadExcel;
import page.WriteExcel;

public class Test1 {
	
		
			private WebDriver driver;
			
			@BeforeMethod
//			public void setUp() {
			public static void main(String[] args) throws Throwable {

				
				ReadExcel readexcel = new ReadExcel();
				
				readexcel.readExcel("C:\\Users\\Walther\\eclipse-workspace\\Auto\\Drivers\\prueba.xlsx", "hojaprueba");
				
				//Mejorar codigo para obtener filas correctas del excel
				
				
				int NumFilas = Integer.valueOf(readexcel.Usuarios().get(0));
				String UserE = readexcel.Usuarios().get(1);
				String PassE = readexcel.Usuarios().get(2);
				
				//falta el numero de fila

				

				String[] wa={"Walther","jhomira"};
				
//				readexcel.writeExcel("C:\\Users\\Walther\\eclipse-workspace\\Auto\\Drivers\\prueba.xlsx", "hojaprueba", wa);
			
				WriteExcel writeexcel = new WriteExcel();
				
			//	writeexcel.writeCellValue("C:\\Users\\Walther\\eclipse-workspace\\Auto\\Drivers\\prueba.xlsx", "hojaprueba", 0, 1, "wa");
				
						
				for (int j = 0 ; j < NumFilas ; j++) {
					
					String lettra=wa[j];
					writeexcel.writeCellValue("C:\\Users\\Walther\\eclipse-workspace\\Auto\\Drivers\\prueba.xlsx", "hojaprueba",j ,NumFilas, lettra,j);
					
				}
				
				
				
						
				/*
				
				DesiredCapabilities caps = new DesiredCapabilities();
				System.setProperty("webdriver.gecko.driver","C:\\Users\\Walther\\eclipse-workspace\\Auto\\Drivers\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.navigate().to("http://newtours.demoaut.com/");
		        
				//incorrecto
//				PageLogin pagelogin1 = new PageLogin(driver);
//				pagelogin1.login("user","user");
//				Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font/b")).getText().contains("Welcome back to"));
				
			
				
				//correcto
				PageLogin pagelogin1 = new PageLogin(driver);
				Helpers helper = new Helpers();
				PageReser pagereser = new PageReser(driver);
				
				pagelogin1.login(UserE,PassE);
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				
				pagereser.selectdroPas(2);
				pagereser.selectdropFrom("Paris");
				pagereser.selectRadio();
				
		        
				*/
				
			}
			
//			@Test
//			public void pruebauno() {
//				
//			PageLogin pagelogin1 = new PageLogin(driver);
//			pagelogin1.login("user","user");
//			Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font/b")).getText().contains("Welcome back to"));
//			
//			}
//			
//			@AfterMethod
//			public void tearDown() {
//				driver.close();
//			}



}
