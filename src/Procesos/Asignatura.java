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
        test(getNombre()+""+getCodigo()+""+getProfesor());
        
        
    
    }
    public void test(String x){
        System.out.println(x);
    }
    public String toHorario(int index){
        test(horarios.get(index));
        String txt = null;
        String[]datos = horarios.get(index).split("|");
        String[]periodos = datos[2].split(",");
        txt = "Dia:  "+datos[0]+"\n"+"Periodos: ";
        for(int i=0; i<periodos.length;i++){
            txt = txt+ "\n"+"-"+periodos[i];
        }
        return txt;
    }
    
    public String getNombre(){
        return this.nombre+"";
    }
    public String getProfesor(){
        return this.profesor+"";
    }
    public String getCodigo(){
        return this.codigo+"";
    }
    public String getHorarios(){
        String texto = null;
        for (int i = 0; i < this.horarios.size(); i++) {
              if(texto==null) texto =salas.get(i)+""+"\n"+toHorario(i)+"\n";
              else if(texto!=null){ 
                  texto= texto+salas.get(i)+"\n"+toHorario(i)+"\n";
              }
              
              }
        return texto;
    }
    
}
