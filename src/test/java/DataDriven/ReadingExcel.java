package DataDriven;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new EdgeDriver();
		FileInputStream File=new FileInputStream("C:\\Users\\Sony\\eclipse-workspace\\app1\\TestData\\Data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(File);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		System.out.println("TotalRows");
		System.out.println("TotalColumns");
		int totalrows=sheet.getLastRowNum();
		int totalcells=sheet.getRow(1).getLastCellNum();
		for(int r=0;r<totalrows;r++) {
			XSSFRow currentrow=sheet.getRow(r);
			for(int c=0; c<totalcells;c++)
			{
				String value=currentrow.getCell(c).toString();
				System.out.print(value+"     ");
			}
			System.out.println();
		}

	}

		
		

	}


