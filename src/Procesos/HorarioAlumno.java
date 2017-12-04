package Procesos;

import Archivos.GestorArchivo;

public class HorarioAlumno extends Horario{

	String [][] tablaNombre;
	String [][] tablaCodigo;
	String [][] tablaSala;
	
	
	public HorarioAlumno() {
		GestorArchivo gestor = new GestorArchivo();
		super.inputStream = gestor.getInputAlumno();
	    super.xlsxToArray();
	    this.tablaNombre = new String[5][10];
	    this.tablaCodigo = new String[5][10];
	    this.tablaSala = new String[5][10];
            llenarNombre();
            llenarSala();
         
	}
	
	private void llenarNombre() {
		int countj=0;
		int counti=0;
		
		for(int y=7; y<this.excell.length; y=y+3) {
			for(int x=1; x<this.excell[0].length; x++) {
				if(y==19) {			// linea de horario de almuerzo
					y=y+3;
					counti=1;
					this.tablaNombre[counti-1][countj]=this.tomarCelda(x, y);
				}else if(x!=6){
					//System.out.println("x "+x+" y"+y);
					this.tablaNombre[counti][countj]=this.tomarCelda(x, y);
					counti++;
				}
			}
			counti=0;
			countj++;
		}
	}
	
	private void llenarSala() {
		int countj=0;
		int counti=0;
		
		for(int y=8; y<this.excell.length; y=y+3) {
			for(int x=1; x<this.excell[0].length; x++) {
				if(y==20) {			// linea de horario de almuerzo
					y=y+3;
					counti=1;
					this.tablaSala[counti-1][countj]=this.tomarCelda(x, y);
				}else if(x!=6){
					//System.out.println("x "+x+" y"+y);
					this.tablaSala[counti][countj]=this.tomarCelda(x, y);
					counti++;
				}
			}
			counti=0;
			countj++;
		}
	}
	
	
	public String getNombreAlumno() {
		String nombre=this.tomarCelda(2, 2);
		return nombre;
	}
	
	public String getRut() {
		String rut=this.tomarCelda(2, 1);
		return rut;
	}
        public String[][] getNombre(){
            return tablaNombre;
        }
        public String[][] getCodigo(){
            return tablaCodigo;
        }
        public String[][] getSala(){
            return tablaSala;
        }
	
	
}
