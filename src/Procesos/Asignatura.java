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
    
    
    public String getNombre(){
        return this.nombre;
    }
    public String getProfesor(){
        return this.profesor;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public ArrayList<String> getHorarios(){
        return this.horarios;
    }
    public ArrayList<String> getSalas(){
        return this.salas;
    }
    
}
