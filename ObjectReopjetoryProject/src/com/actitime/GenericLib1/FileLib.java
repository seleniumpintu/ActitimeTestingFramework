package com.actitime.GenericLib1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



/**
 * this class contain File releted mdts, which is used to read data from excel &
 * properties
 * 
 * @author pintu
 *
 */
public class FileLib {
	/**
	 * its used to get the property key value from commonData.properties
	 * 
	 * @param key
	 * @return value
	 * @throws Throwable
	 */
	public String getPropertyKeyValue(String key) throws Throwable {
		FileInputStream fis = new FileInputStream(
				"D:\\SeleniumProject\\WorkSpace\\TestNgProject\\commonData.properties");
		// "./data/commonData.properties"
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}

	/**
	 * its used to read data from excel-workbook, based on user argument
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param celNum
	 * @return
	 * @throws Throwable
	 */
	public String getExcelData(String sheetName, int rowNum, int celNum) throws Throwable {
		FileInputStream fis = new FileInputStream(
				"D:\\SeleniumProject\\WorkSpace\\TestNgProject\\TestData.xlsx");
		// "./data/TestData.xlsx"
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(celNum).getStringCellValue();
		wb.close();
		return data;
	}

	/**
	 * used to write data back to excel based on user argument
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param celNum
	 * @param data
	 * @return
	 * @throws Throwable
	 */
	public void setExcelData(String sheetName, int rowNum, int celNum, String data) throws Throwable {
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.createCell(celNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
		wb.write(fos);
		wb.close();

	}
}
