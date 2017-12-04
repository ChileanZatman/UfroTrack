package Procesos;

import java.util.ArrayList;

import Archivos.GestorArchivo;
import Ventanas.Inicio;

public class HorarioCarrera extends Horario{
	
	private ArrayList <Integer> posicion;
	private ArrayList <Integer> cantidadAparicionPorModulo;
	private boolean encuentro;

	public HorarioCarrera() {
        GestorArchivo gestor = new GestorArchivo();
        super.inputStream = gestor.getInputCarrera();
        super.xlsxToArray();
        this.encuentro=false;
        this.posicion = new ArrayList<Integer>();
		this.cantidadAparicionPorModulo = new ArrayList<Integer>();
	}
	
	private void ocurrencias (String palabraBuscada) {
		for (int y=0; y<this.excell.length; y++) {
			for(int x=1; x<excell[0].length;x++) {
				if (this.tomarCelda(x,y).equalsIgnoreCase(palabraBuscada)) {
					this.posicion.add(x);
					this.encuentro=true;
	   			}
			}
		}
	}
	
	public boolean encuentro(String palabraBuscada) {
		this.ocurrencias(palabraBuscada);
		return this.encuentro;
	}
	
	private void separarAsignaturas (String palabraBuscada) { //true=codigo / false=profesor
		this.ocurrencias(palabraBuscada);
		int count=0;
		int countAux=0;
		for(int x=0; x<(this.posicion.size())-1;x++) {
			if(this.tomarCelda(this.posicion.get(x), 0).equalsIgnoreCase(this.tomarCelda(this.posicion.get(x)+1, 0))) {
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
		if(this.encuentro) {
			for(int i=0; i<this.cantidadAparicionPorModulo.size(); i++) {		//cantidad de asignaturas
				listaAsignatura.add(asignaturaEncontrada(i, this.cantidadAparicionPorModulo.get(i))); 
			}
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
		 profesor=	this.tomarCelda(posicionInicial, 3);
		 codigo=	this.tomarCelda(posicionInicial, 0);
		 nombre=	this.tomarCelda(posicionInicial, 1);
		 
		 for(int i=0;i<cantidadHorarioDeEstaAsignatura;i++) {
			 horario.add(this.tomarCelda(posicionInicial+i, 2));
			 sala.add(this.tomarCelda(posicionInicial+i, 4));
		 }
		 
		 asignatura = new Asignatura(profesor, codigo, nombre, horario, sala);
		 return asignatura;
	 }
	
	
	private int posicionInicial(int posicionEntreLosModulos) {
		int contador=0;
		if(posicionEntreLosModulos>0) {
			for(int j=0; j<posicionEntreLosModulos; j++) {
				contador=contador+this.cantidadAparicionPorModulo.get(j)+1;
			}
		}else {
			return 1;
		}
		return contador;
	}


}
