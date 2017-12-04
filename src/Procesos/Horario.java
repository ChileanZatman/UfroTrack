package Procesos;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;

abstract class Horario{
	
	protected FileInputStream inputStream;
	protected String[][] excell;
	
	public Horario() {
        
		;
	}

   protected void xlsxToArray() {
       //el input ingresado, se obtiene de la clase GestorArchivo
       
       
       XSSFRow row;
       XSSFCell cell;
       try {
           XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

           // get sheet number
           int sheetCn = workbook.getNumberOfSheets();

           for (int cn = 0; cn < sheetCn; cn++) {

               // get 0th sheet data
               XSSFSheet sheet = workbook.getSheetAt(cn);

               // get number of rows from sheet
               int rows = sheet.getPhysicalNumberOfRows();

               // get number of cell from row
               int cells = sheet.getRow(cn).getPhysicalNumberOfCells();

               excell = new String[rows][cells];
     
               for (int r = 0; r < rows; r++) {
                   row = sheet.getRow(r); // bring row
                   if (row != null) {
                       for (int c = 0; c < cells; c++) {
                           cell = row.getCell(c);

                           if (cell != null) {

                               switch (cell.getCellType()) {

                               case XSSFCell.CELL_TYPE_FORMULA:
                                   excell[r][c] = cell.getCellFormula();
                                   System.out.println(excell[r][c]);
                                   break;

                               case XSSFCell.CELL_TYPE_NUMERIC:
                                   excell[r][c] = ""
                                        + cell.getNumericCellValue();
                                   System.out.println(excell[r][c]);
                                   break;

                               case XSSFCell.CELL_TYPE_STRING:
                                   excell[r][c] = ""
                                        + cell.getStringCellValue();
                                   System.out.println(excell[r][c]);
                                   break;

                               case XSSFCell.CELL_TYPE_BLANK:
                                  excell[r][c] = "-----";
                                  System.out.println(excell[r][c]);
                                  break;

                               case XSSFCell.CELL_TYPE_ERROR:
                                  excell[r][c] = ""+cell.getErrorCellValue();
                                  System.out.println(excell[r][c]);
                                break;
                            default:
                               }
                        }
                    }
                }
            }
               
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
  }
   
   protected String tomarCelda (int x, int y) {
	   return excell [y][x];
   }

}