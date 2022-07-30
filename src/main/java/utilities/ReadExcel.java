package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.formula.EvaluationSheet;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcel {
	
	static XSSFWorkbook wb;
	static XSSFSheet sheet ;
	public static FileInputStream fis;
	public static File src =new File("./excel/testdata");
	public static String getStringData(int rowNum,int colNum) throws IOException, Throwable
	{
	fis=new FileInputStream(src);
	wb=new XSSFWorkbook(fis);
	sheet=wb.getSheetAt(0);
	String data=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
	return data;
	
	}
}