package Procesos;

import Archivos.GestorArchivo;

public class HorarioAlumno extends Horario{

	String [][] tablaNombre;
	String [][] tablaCodigo;
	
	public HorarioAlumno() {
		GestorArchivo gestor = new GestorArchivo();
		super.inputStream = gestor.getInputAlumno();
	    super.xlsxToArray();
	    this.tablaNombre = new String[5][10];
	    this.tablaCodigo = new String[5][10];
	}
	
	public void llenarNombre() {
		int countj=0;
		int counti=0;
		for(int y=7; y<this.excell.length-1; y=y+3) {
			countj++;
			for(int x=1; y<this.excell[0].length; x++) {
				counti++;
				if(y==19) {
					countj--;
					counti--;
				}else { // linea de horario de almuerzo
					this.tablaNombre[countj][counti]=this.tomarCelda(x, y);
				}
			}
		}
	}
	
	public void llenarCodigo() {
		int countj=0;
		int counti=0;
		for(int y=6; y<this.excell.length-1; y=y+3) {
			countj++;
			for(int x=1; y<this.excell[0].length; x++) {
				counti++;
				if(y==18) {
					countj--;
					counti--;
				}else { // linea de horario de almuerzo
					this.tablaCodigo[countj][counti]=this.tomarCelda(x, y);
				}
			}
		}
	}
	
	public String tomarNombre() {
		String nombre=this.tomarCelda(2, 2);
		return nombre;
	}
	
	public String rut() {
		String rut=this.tomarCelda(2, 1);
		return rut;
	}
	
	
}
