package Procesos;

import java.util.ArrayList;

import Archivos.GestorArchivo;
import Ventanas.Inicio;

public class HorarioCarrera extends Horario{
	
	private ArrayList <Integer> posicion;
	private ArrayList <Integer> cantidadAparicionPorModulo;

	public HorarioCarrera() {
		this.posicion = new ArrayList<Integer>();
		this.cantidadAparicionPorModulo = new ArrayList<Integer>();
        GestorArchivo gestor = new GestorArchivo();
        super.inputStream = gestor.getInputCarrera();
        super.xlsxToArray();
	}
	
	private void ocurrencias (String palabraBuscada) {
		for (int y=0; y<this.excell.length; y++) {
			for(int x=1; x<excell[0].length;x++) {
				if (this.tomarCelda(x,y).contains(palabraBuscada)) {
					this.posicion.add(x);
	   			}
			}
		}
	}
	
	private void separarAsignaturas (String palabraBuscada) { //true=codigo / false=profesor
		this.ocurrencias(palabraBuscada);
		int count=0;
		int countAux=0;
		for(int x=0; x<(this.posicion.size())-1;x++) {
			if(this.tomarCelda(this.posicion.get(x), 0).equals(this.tomarCelda(this.posicion.get(x)+1, 0))) {
				count++;
				countAux++;
			}else {
				this.cantidadAparicionPorModulo.add(count+1);
				count=0;
			}
		}	
		this.cantidadAparicionPorModulo.add(this.posicion.size()-countAux);
	}
	

	public ArrayList<Asignatura> listaAsignaturas (String palabraBuscada){
		ArrayList <Asignatura> listaAsignatura = new ArrayList <Asignatura>();
		this.separarAsignaturas(palabraBuscada);
		for(int i=0; i<this.cantidadAparicionPorModulo.size(); i++) {		//cantidad de asignaturas
			listaAsignatura.add(asignaturaEncontrada(i, this.cantidadAparicionPorModulo.get(i))); 
		}
		return listaAsignatura;
	}
	
	 private Asignatura asignaturaEncontrada (int posicionEntreLosModulos,int cantidadHorarioDeEstaAsignatura) {
		 Asignatura asignatura;
		 String profesor;
		 String codigo;
		 String nombre;
		 ArrayList <String> horario = new ArrayList<String>();
		 ArrayList <String> sala = new ArrayList<String>();
		 
		 int posicionInicial=posicionInicial(posicionEntreLosModulos);		//falta determinar eso con un void 
		 profesor=	this.tomarCelda(posicionInicial+1, 3);
		 codigo=	this.tomarCelda(posicionInicial+1, 0);
		 nombre=	this.tomarCelda(posicionInicial+1, 1);
		 
		 for(int i=0;i<cantidadHorarioDeEstaAsignatura;i++) {
			 horario.add(this.tomarCelda(posicionInicial+i+1, 2));
			 sala.add(this.tomarCelda(posicionInicial+i+1, 4));
		 }
		 
		 asignatura = new Asignatura(profesor, codigo, nombre, horario, sala);
		 return asignatura;
	 }
	
	
	private int posicionInicial(int posicionEntreLosModulos) {
		int contador=0;
		if(posicionEntreLosModulos>0) {
			for(int j=0; j<posicionEntreLosModulos; j++) {
				contador=contador+this.cantidadAparicionPorModulo.get(j);
						}
		}else {
			return 0;
		}
		return contador;
	}


}
