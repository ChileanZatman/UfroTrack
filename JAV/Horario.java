package UfroTrack;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

abstract class Horario{
	
	private String[][] excell;
	public int posicion[][];
	
	public Horario() {
		this.posicion = new int [10][10];
		this.excell = null;
		this.xlsxToArray("C:/Users/tarro/Desktop/horario_academico.xlsx");
	}

   protected void xlsxToArray(String ruta) {
       XSSFRow row;
       XSSFCell cell;
       try {
           FileInputStream inputStream = new FileInputStream(ruta);
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
                                   break;

                               case XSSFCell.CELL_TYPE_NUMERIC:
                                   excell[r][c] = ""
                                        + cell.getNumericCellValue();
                                   break;

                               case XSSFCell.CELL_TYPE_STRING:
                                   excell[r][c] = ""
                                        + cell.getStringCellValue();
                                   break;

                               case XSSFCell.CELL_TYPE_BLANK:
                                  excell[r][c] = "[BLANK]";
                                  break;

                               case XSSFCell.CELL_TYPE_ERROR:
                                  excell[r][c] = ""+cell.getErrorCellValue();
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
   
   protected void ocurrencias(String palabraBuscada) { // guarda las posiciones de las ocurrencias de la busqueda.
	   int count=0;
	   	for(int y = 6 ; y<(this.excell.length);y++) {
	   		for(int x=1;x<(this.excell[0].length);x++) {
	   			if (this.tomarCelda(x,y).contains(palabraBuscada)) {
	   				count++;
	   				this.posicion[count][count]=x;
	   				this.posicion[count][count+1]=y;
	   			}
	   		}
	   	}
   }
   public void imprimirPosicion() {
	   for (int y=0;y<this.posicion.length;y++) {
		   for(int x=0;x<this.posicion.length;x++) {
			   if(this.posicion[x][y]!=0) {
				   System.out.println(x+":"+y+"::"+this.posicion[x][y]);
			   }
		   }
	   }
   }
   
   public void devolverCeldas() {
	   
   }

   
   
}
