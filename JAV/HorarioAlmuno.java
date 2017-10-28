package UfroTrack;

public class HorarioAlmuno extends Horario {

	public static void main(String[] args) {
	       HorarioAlmuno horario = new HorarioAlmuno();
	       System.out.println(horario.tomarCelda(3,3));
	       horario.ocurrencias("ECUA");
	       horario.imprimirPosicion();
	      
	      
	   }
}
