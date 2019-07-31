package page;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadExcel {

	
	public ReadExcel() {
		
	}
	
	
	
	static List<String> miArrayList = new ArrayList<String>();
		
		
	public  void readExcel(String Filepath , String nameShet) throws Throwable {
		
			File file = new File(Filepath);
			FileInputStream inputstream = new FileInputStream(file);
			@SuppressWarnings("resource")
			XSSFWorkbook newWorkBookk = new XSSFWorkbook(inputstream);
			XSSFSheet newsheet = newWorkBookk.getSheet(nameShet);
			
//			int rowCount = newsheet.getLastRowNum() + newsheet.getFirstRowNum();
			int rowCount = newsheet.getLastRowNum() + newsheet.getFirstRowNum()+1;
			
			 miArrayList.add(Integer.toString(rowCount));
		
//			System.out.println("Fila por correr" + rowCount);
			
			for (int i = 0 ; i < rowCount ; i++) {
				XSSFRow row = newsheet.getRow(i);
				 int numberOfCells = 1;
	             Iterator rowIterator = newsheet.rowIterator();
	             if (rowIterator.hasNext())
	             {
	                 Row headerRow = (Row) rowIterator.next();
	                 //get the number of cells in the header row
	                 numberOfCells = headerRow.getPhysicalNumberOfCells();
	             }
	            
				
//				System.out.println("Fila NRO" + i);
			
	             String dato="";
				for (int j = 0 ; j < numberOfCells ; j++) {
					if(row.getCell(j)!=null) {
						dato = row.getCell(j).getStringCellValue();
						}
					}
					
					 miArrayList.add(dato);
					
					
				
				System.out.println("Listas"+miArrayList);
				
			
			};
			
		

	}	

	private String readExcel2(String Filepath , String nameShet , int rowNumber , int cellNumbre) throws Throwable {
		
		File file = new File(Filepath);
		FileInputStream inputstream = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook newWorkBookk = new XSSFWorkbook(inputstream);
		XSSFSheet newsheet = newWorkBookk.getSheet(nameShet);
		XSSFRow row = newsheet.getRow(rowNumber);
		XSSFCell cell = row.getCell(cellNumbre);
		
		return cell.getStringCellValue();
	}
	
	
	public static List<String> Usuarios(){
		List<String> miArrayList2 = miArrayList;
		return miArrayList2;
	}
			
			 

}
