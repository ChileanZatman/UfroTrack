package Procesos;


public class Asignatura {
    private final String profesor,codigo,nombre;
    private final String[]horarios;
    private final String[]salas;
    public Asignatura(String prof, String cod, String nom, String[]hor, String[]sal){
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
    public String[] getHorarios(){
        return this.horarios;
    }
    public String[] getSalas(){
        return this.salas;
    }
    
}
