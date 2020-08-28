package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	@SuppressWarnings("resource")
	public static Object[][] getTableArray(String sheetName) throws IOException {
		String[][] tabArray = null;
		String excelResource = "";

		Workbook wb = null;
		DataFormatter dataFormatter = new DataFormatter();
		File srcFile = new File(excelResource);
		FileInputStream fin = new FileInputStream(srcFile);
		if (srcFile.getName().substring(srcFile.getName().indexOf(".")).equals(".xlsx")) {
			wb = new XSSFWorkbook(fin);
		} else {
			wb = new HSSFWorkbook(fin);
		}

		Sheet ws = wb.getSheet(sheetName);
		int rowCount = ws.getLastRowNum() - ws.getFirstRowNum();
		Row sr = ws.getRow(1);
		int noOfCols = sr.getLastCellNum();
		int actualRowCount = 0;
		List<Integer> actualTestDataRow = new ArrayList<Integer>();
		for (int i = 1; i <= rowCount; i++) {
			sr = ws.getRow(i);
			if (sr.getCell(1).toString().equals("Yes")) {
				actualTestDataRow.add(i);
				actualRowCount++;

			}
		}
		tabArray = new String[actualRowCount][noOfCols];
		for (int i = 0; i < actualRowCount; i++) {
			sr = ws.getRow(actualTestDataRow.get(i));
			for (int j = 0; j < noOfCols; j++) {

				tabArray[i][j] = dataFormatter.formatCellValue(sr.getCell(j)).toString().trim();

			}

		}
		return tabArray;

	}
}
