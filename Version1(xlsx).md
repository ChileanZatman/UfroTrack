# UfroTrack

//https://trello.com/b/Ww8NZu62/ufrotrack

package UfroTrack;

package UfroTrack;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HorarioAlumno {
    public static void readXLSFile() throws IOException
    {
		InputStream ExcelFileToRead = new FileInputStream("C:/Users/rvale/Downloads/horario_academico.xls.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);

		XSSFSheet sheet=wb.getSheetAt(0);
		XSSFRow row; 
		XSSFCell cell;

		Iterator rows = sheet.rowIterator();

		while (rows.hasNext())
		{
			row=(XSSFRow) rows.next();
			Iterator cells = row.cellIterator();
			
			while (cells.hasNext())
			{
				cell=(XSSFCell) cells.next();
		
                            switch (cell.getCellType()) {
                                case XSSFCell.CELL_TYPE_STRING:
                                    System.out.print(cell.getStringCellValue()+" ");
                                    break;
                                case XSSFCell.CELL_TYPE_NUMERIC:
                                    System.out.print(cell.getNumericCellValue()+" ");
                                    break;
                            //U Can Handel Boolean, Formula, Errors
                                default:
                                    break;
                            }
			}

		}
	
	}

   public static void main(String[] args) throws IOException {
		
		
		readXLSFile();
}
}
