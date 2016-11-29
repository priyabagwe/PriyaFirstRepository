package com.wbl.rest.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.io.File;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils {

	private static final String DATA_FILE_PATH = System.getProperty("user.dir");
	public static Object [][]getExcelData(String sheetName, String filename){
		
		Object[][] rowsData;
			try {
				System.out.println(" DATA_FILE_PATH :"+DATA_FILE_PATH);
				XSSFWorkbook book = new XSSFWorkbook(new FileInputStream(DATA_FILE_PATH+"\\restData.xlsx"));
				Sheet sheet = book.getSheetAt(0);
				int numberOfRows = sheet.getLastRowNum();
				rowsData = new Object[numberOfRows][2];
				Row topRow = sheet.getRow(0);
				sheet.removeRow(topRow);
				Iterator<Row> rows = sheet.iterator();
				int i = 0;
				while(rows.hasNext())
				{
					int j = 0;
					Row row = rows.next();
					Iterator<Cell> cells = row.cellIterator();
					while(cells.hasNext())
					{
						Cell cell = cells.next();
						rowsData[i][j] = cell.getStringCellValue();
						j++;
					}
					i++;
				}
				return rowsData;
			}
			 catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			return null;
		}
	
	}
