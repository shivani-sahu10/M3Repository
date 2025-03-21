package genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	

	public String readExcelData(String excelpath,String Sheetname,int rowNo,int cellNo) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis  = new FileInputStream(excelpath);
	
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(Sheetname);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String data = cell.toString();
		
		return data;
		
		
	}
	
	public  String readPropertydata(String propPath,String Key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(Key);
		return data;
	}
	
	public int lastRowCount(String excelPath,String Sheetname)throws EncryptedDocumentException,IOException{
	FileInputStream fis= new FileInputStream(excelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(Sheetname);
	int rc = sheet.getLastRowNum();
	return rc;
}
	public int randomNumber() {
		Random random = new Random();
		int number = random.nextInt(1000, 9999);
		return number;
		
		//int number = random.nextInt(1000);
	//	int rn = number+1000;
		
		
	}
public long readExcelData1(String excelpath,String Sheetname,int rowNo,int cellNo) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis  = new FileInputStream(excelpath);
	
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(Sheetname);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		long data = (long)cell.getNumericCellValue();
		
		
	return data;
}
}
	


