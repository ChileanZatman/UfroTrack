package Procesos;

import Archivos.GestorArchivo;
import java.util.ArrayList;

public class HorarioCarrera extends Horario{
	
	private int posicion[][];
	private int cantidadClases;
	private int cantidadModulos;
	
	public HorarioCarrera() {
            //cantidadClases = 0;
            //cantidadModulos = 0;
            GestorArchivo gestor = new GestorArchivo();
            super.inputStream = gestor.getInputCarrera();
            super.xlsxToArray();
	}
	
	   private void ocurrencias(String palabraBuscada) { //determina la cantidad de ocurrencias
		   int count=0;
		   	for(int y = 0 ; y<(this.excell.length);y++) {
		   		for(int x=1;x<(this.excell[0].length);x++) {
		   			if (this.tomarCelda(x,y).contains(palabraBuscada)) {
		   				count++;
		   			}
		   		}
		   	}
		   	this.posicion = new int [count][1];
		   	llenar(palabraBuscada);
	   }
	   
	   private void llenar(String palabraBuscada) {	// guarda las posiciones de las ocurrencias de la busqueda.
		   int count=0;
			for(int y = 0 ; y<(this.excell.length);y++) {
		   		for(int x=0;x<(this.excell[0].length);x++) {
		   			if (this.tomarCelda(x,y).contains(palabraBuscada)) {
		   				this.posicion[count][0]=x;
		   				this.posicion[count][1]=y;
		   				count++;
		   			}
		   		}
		   	}
	   }
	   
	   private void setCantidadClases(String palabraBuscada, boolean tipoBusqueda) {
		   System.out.println(cantidadClases);
                   if(tipoBusqueda) {	//si busque por codigo
			   this.cantidadClases=Integer.parseInt(this.tomarCelda(this.posicion[0][0],this.posicion[0][1]+5));
		   }
		   else {				//si busque por profesor
			   this.cantidadClases=Integer.parseInt(this.tomarCelda(this.posicion[0][0],this.posicion[0][1]+2));
		   }
	   }
	   
	   private Asignatura asignaturaEncontrada (String palabraBuscada, boolean tipoBusqueda, int modulo) { //true para busqueda por codigo false para profesor
		   this.ocurrencias(palabraBuscada);

		   String profesor;
		   String codigo;
		   String nombre;
		   ArrayList <String> horario = new ArrayList<String>();
		   ArrayList <String> sala = new ArrayList<String>();
		   int clase = ((int) Math.round(this.cantidadClases/modulo))-1;
		   
		  if(tipoBusqueda) {
			  profesor = this.tomarCelda				(this.posicion[clase][0],(this.posicion[clase][1])+3);
			  codigo = this.tomarCelda					(this.posicion[clase][0],(this.posicion[clase][1])+0);
			  nombre = this.tomarCelda					(this.posicion[clase][0],(this.posicion[clase][1])+1);
			  for(int i=0; i<this.cantidadClases; i++) {
				  horario.add(this.tomarCelda			(this.posicion[clase][0],(this.posicion[clase][1])+2));
				  sala.add(this.tomarCelda				(this.posicion[clase][0],(this.posicion[clase][1])+4));
			  }
		  }else {
			  profesor = this.tomarCelda				(this.posicion[clase][0],(this.posicion[clase][1])+0);
			  codigo = this.tomarCelda					(this.posicion[clase][0],(this.posicion[clase][1])-3);
			  nombre = this.tomarCelda					(this.posicion[clase][0],(this.posicion[clase][1])-2);
			  for(int i=0; i<this.cantidadClases; i++) {
				  horario.add(this.tomarCelda			(this.posicion[clase][0],(this.posicion[clase][1])-1));
				  sala.add(this.tomarCelda				(this.posicion[clase][0],(this.posicion[clase][1])+1));  
			  }		
		   }
		  Asignatura asignatura = new Asignatura(profesor, codigo, nombre, horario, sala);
		  return asignatura;
	   }
	   
	   
	   
	   public ArrayList<Asignatura> listaAsignaturas (String palabraBuscada, boolean tipoBusqueda) {
		  
                  this.setCantidadClases(palabraBuscada, tipoBusqueda);
		  this.cantidadModulos = (this.posicion.length/cantidadClases);
		  
		  ArrayList <Asignatura> listaAsignatura = new ArrayList <Asignatura>();
		   for(int i=0; i<this.cantidadModulos; i++) {
			  listaAsignatura.add(asignaturaEncontrada(palabraBuscada, tipoBusqueda, i)); 
		   }
		  return listaAsignatura;
	   }
}