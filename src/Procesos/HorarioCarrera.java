package Procesos;

import java.util.ArrayList;

import Archivos.GestorArchivo;

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
				if (this.tomarCelda(x,y).contains(palabraBuscada)) {
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
	
	private void separarAsignaturas (String palabraBuscada) {
		this.ocurrencias(palabraBuscada);
		int count=0;
		System.out.println(this.posicion.size());
		for(int x=0; x<(this.posicion.size());x++) {
			if(this.tomarCelda(this.posicion.get(x), 0).contains(this.tomarCelda(this.posicion.get(x)+1, 0))) {
				System.out.println(this.tomarCelda(this.posicion.get(x), 0));
				count++;
			}else {
				this.cantidadAparicionPorModulo.add(count+1);
				count=0;
			}
		}
	}

	public ArrayList<Asignatura> listaAsignaturas (String palabraBuscada){
		ArrayList <Asignatura> listaAsignatura = new ArrayList <Asignatura>();
		this.separarAsignaturas(palabraBuscada);
		if(this.encuentro) {
			int posicionInicial=this.posicion.get(0);
			for(int i=0; i<this.cantidadAparicionPorModulo.size(); i++) {		//cantidad de asignatura
				listaAsignatura.add(asignaturaEncontrada(posicionInicial, i, this.cantidadAparicionPorModulo.get(i))); 
				posicionInicial=posicionInicial+this.cantidadAparicionPorModulo.get(i);
			}
		}
		return listaAsignatura;
	}
	
	
	 private Asignatura asignaturaEncontrada (int primeraPosicion, int posicionEntreLosModulos,int cantidadHorarioDeEstaAsignatura) {
		 Asignatura asignatura;
		 String profesor;
		 String codigo;
		 String nombre;
		 ArrayList <String> horario = new ArrayList<String>();
		 ArrayList <String> sala = new ArrayList<String>();
		 
		 profesor=	this.tomarCelda(primeraPosicion, 3);
		 codigo=	this.tomarCelda(primeraPosicion, 0);
		 nombre=	this.tomarCelda(primeraPosicion, 1);
		 
		 for(int i=0;i<cantidadHorarioDeEstaAsignatura;i++) {
			 horario.add(this.tomarCelda(primeraPosicion+i, 2));
			 sala.add(this.tomarCelda(primeraPosicion+i, 4));
		 }
		 
		 asignatura = new Asignatura(profesor, codigo, nombre, horario, sala);
		 return asignatura;
	 }
	

}