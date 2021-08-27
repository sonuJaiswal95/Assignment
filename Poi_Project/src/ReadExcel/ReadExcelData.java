package ReadExcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\selenium\\Exceldata\\Testdata.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		 XSSFSheet sheet1 =wb.getSheetAt(0);
	String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
	System.out.println("Data from excel is "+data0);
	
	String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
	System.out.println("Data from excel is "+data1);
	wb.close();


	}

}
