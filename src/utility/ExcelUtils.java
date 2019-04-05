package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

public class ExcelUtils {
	public static HSSFWorkbook ExcelWBook;
	public static HSSFSheet ExcelWSheet;
	public static HSSFRow row;
	public static HSSFCell cell;
	public static DataFormatter formatter;

	// Metoda koja nam postavlja excell fajl
	// i poslato ime worksheeta
	public static void setExcelFile(String path, String str) throws IOException {
		try {
			// Ucitavanje nekog fajla cija je putanja poslata kao Path
			FileInputStream file = new FileInputStream(path);

			// Otvaranje fajla kao excell fajla
			ExcelWBook = new HSSFWorkbook(file);

			// uzimanje worksheet-a iz datog excell fajla
			ExcelWSheet = ExcelWBook.getSheet(str);

			// inicijalizacija dataformatter objekta
			formatter = new DataFormatter();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static String getCell(int row, int col) {
		cell = ExcelWSheet.getRow(row).getCell(col);
		String CellData = formatter.formatCellValue(cell);
		return CellData;
	}

	public static void setCellData(String Result, int RowNum, int ColNum) throws Exception
	{ try {
			row = ExcelWSheet.getRow(RowNum);
			cell = row.getCell(ColNum, MissingCellPolicy.RETURN_BLANK_AS_NULL);
			if (cell == null) {
				cell = row.createCell(ColNum);
				cell.setCellValue(Result);
			} else {
				cell.setCellValue(Result);
			}

			FileOutputStream fileOut = new FileOutputStream(Constant.PATH + Constant.NAME);
			ExcelWBook.write(fileOut);

			fileOut.flush();

			fileOut.close();

		} catch (Exception e) {
			throw (e);
		}
	}

	public static HSSFSheet getWSheet() {
		return ExcelWSheet;
	}

}
