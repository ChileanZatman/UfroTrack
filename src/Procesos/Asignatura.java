package Procesos;

import java.util.ArrayList;


public class Asignatura {
    private final String profesor,codigo,nombre;
    private final ArrayList<String>horarios;
    private final ArrayList<String>salas;
    public Asignatura(String prof, String cod, String nom, ArrayList<String>hor, ArrayList<String>sal){
        this.profesor =prof;
        this.codigo = cod;
        this.nombre = nom;
        this.horarios = hor;
        this.salas=sal;
    
    }
    public String toHorario(int index){
        String txt = null;
        String[]datos = horarios.get(index).split("|");
        String[]periodos = datos[1].split(",");
        txt = "Dia:  "+datos[0]+"\n"+"Periodos:  "+periodos[0]+" y "+periodos[1];
        return txt;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public String getProfesor(){
        return this.profesor;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public String getHorarios(){
        String texto = null;
        for (int i = 0; i < this.horarios.size(); i++) {
              if(texto==null) texto =salas.get(i)+""+"\n"+toHorario(i);
              else{ texto= texto+salas.get(i)+"\n"+toHorario(i);
              }
              
              }
        return texto;
    }
    
}
