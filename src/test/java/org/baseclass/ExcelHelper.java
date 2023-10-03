package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {
	
	public static void writeInNewCell(String FileName,String sheetName,int rowNo,int cellNo,String value) throws IOException {
		
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\Mavenday2\\ExcelSheet1\\"+FileName+".xlsx");
		
		FileInputStream fin= new FileInputStream(f);
		
		Workbook bk = new XSSFWorkbook(fin);

		Sheet sh = bk.getSheet(sheetName);

		Row r = sh.getRow(rowNo);
		
		Cell c = r.createCell(cellNo);
		
		c.setCellValue(value);
		
		FileOutputStream fout=new FileOutputStream(f);
		
		bk.write(fout);

	}
	

	public static void updateExcel(String FileName,String sheetName,int rowNo,int cellNo) throws IOException {
		
	File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Mavenday2\\ExcelSheet1\\" + FileName + ".xlsx");

	FileInputStream fin= new FileInputStream(f);
	
	Workbook bk = new XSSFWorkbook(fin);

	Sheet sh = bk.getSheet(sheetName);

	Row r = sh.getRow(rowNo);
	
	Cell c = r.getCell(cellNo);
	
	c.getStringCellValue();
	
	FileOutputStream fout=new FileOutputStream(f);
	
	bk.write(fout);
	
	}
	public static void writeInNewRow(String FileName, String sheetName, int rowNo, int cellNo, String value)
			throws IOException {

		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Mavenday2\\ExcelSheet1\\" + FileName + ".xlsx");

		FileInputStream fin= new FileInputStream(f);
		
		Workbook bk = new XSSFWorkbook(fin);

		Sheet sh = bk.getSheet(sheetName);

		Row r = sh.createRow(rowNo);

		Cell c = r.createCell(cellNo);

		c.setCellValue(value);

		FileOutputStream fout = new FileOutputStream(f);

		bk.write(fout);
	}

	public static void writeInNewSheet(String FileName, String sheetName, int rowNo, int cellNo, String value)
			throws IOException {

		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Mavenday2\\ExcelSheet1\\" + FileName + ".xlsx");
		
		Workbook bk = new XSSFWorkbook();

		Sheet sh = bk.createSheet(sheetName);

		Row r = sh.createRow(rowNo);

		Cell c = r.createCell(cellNo);

		c.setCellValue(value);

		FileOutputStream fout = new FileOutputStream(f);

		bk.write(fout);

	}


	public static void writeInNewFile(String FileName, String sheetName, int rowNo, int cellNo, String value)
			throws IOException {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Mavenday2\\ExcelSheet1\\" + FileName + ".xlsx");

		Workbook bk = new XSSFWorkbook();

		Sheet sh = bk.createSheet(sheetName);

		Row r = sh.createRow(rowNo);

		Cell c = r.createCell(cellNo);

		c.setCellValue(value);

		FileOutputStream fout = new FileOutputStream(f);
		bk.write(fout);

	}

	public static String readData(String FileName ,String SheetName, int rowNo, int cellNo) throws IOException {

		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Mavenday2\\ExcelSheet1\\"+ FileName + ".xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook bk = new XSSFWorkbook(fin);

		Sheet sh = bk.getSheet(SheetName);

		Row r = sh.getRow(rowNo);

		Cell c = r.getCell(cellNo);

		int type = c.getCellType();
		String input = "";
		if (type == 1) {

			input = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {

			Date da = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("MMM-dd-yyy");
			input = sim.format(da);
		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			input = String.valueOf(l);

		}
		return input;

	}

}
