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
        txt = "Dia:  "+this.numeroDia(datos[0])+"\n"+"Periodos: ";
        for(int i=0; i<periodos.length;i++){
            txt = txt+ "\n"+this.horaPeriodo(periodos[i]);
        }
        txt=txt+"\n\n";
        return txt;
    }
    
    private String horaPeriodo(String periodo) {
    	int aux = Integer.parseInt(periodo);
    	 switch (aux) {
    	 	case 1:  return "08:30-09:30";
    	 	case 2:  return "09:40-10:40";
    	 	case 3:  return "10:50-11:50";
    	 	case 4:  return "12:00-13:00";
    	 	case 5:  return "14:30-15:30";
    	 	case 6:  return "15:40-16:40";
    	 	case 7:  return "16:50-17:50";
    	 	case 8:  return "18:00-19:00";
    	 	case 9:  return "19:10-20:10";
    	 	case 10: return "20:20-21:20";
    	 	default: return "SIN INFORMACION";
    	 }
    }
    private String numeroDia(String datos) {
    	int aux = Integer.parseInt(datos);
    	 switch (aux) {
    	 	case 1:  return "lunes";
    	 	case 2:  return "martes";
    	 	case 3:  return "miercoles";
    	 	case 4:  return "jueves";
    	 	case 5:  return "viernes";
    	 	default: return "SIN INFORMACION";
    	 }
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
              if(texto==null) texto ="Sala: "+salas.get(i)+""+"\n"+toHorario(i)+"\n";
              else if(texto!=null){ 
                  texto= texto+"Sala: "+salas.get(i)+"\n"+toHorario(i)+"\n";
              }
              
              }
        return texto;
    }
    
}
