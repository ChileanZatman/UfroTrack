package Archivos;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GestorArchivo
{
    private FileInputStream inputStream;
    private final Path file;
    private final Path dir;
    private String[] lineas;//linea[0]= alumno, linea[1] = carrera
    public GestorArchivo(){
        dir = Paths.get("C:/Users/Public/Documents/Ufrotrack");
        file = Paths.get("C:/Users/Public/Documents/Ufrotrack/rutas.txt");
        setLineas();
    }
    public boolean checkFile(){
        return Files.exists(dir);
    }
    public boolean checkDir(){
    return Files.exists(dir);
    }
    public String getAlumno() {
            setLineas();
            return lineas[0];
    }
    public String getCarrera() {
            setLineas();
            return lineas[1];
    }
    public FileInputStream getInputAlumno(){
        try{
                 inputStream = new FileInputStream(lineas[0]);
                 
        }catch(FileNotFoundException e){
        
        }
        return inputStream;
    }
    public FileInputStream getInputCarrera(){
    try{
                 inputStream = new FileInputStream(lineas[1]);
                 
        }catch(FileNotFoundException e){
        
        }
        return inputStream;
    }
    private void setFile(){
        String texto = lineas[0]+"\n"+lineas[1];
        try{
            Files.write(dir, texto.getBytes());
        }catch (IOException e) {
            System.out.println("El archivo no pudo ser guardado");
        }
        
    }
    private void setLineas(){
        try{
        String[] texto = new String(Files.readAllBytes(dir)).split("\n");
        lineas = texto;
        }
        catch(IOException e){
        }
    }
    private void setAlumno(String ruta){
        lineas[0]=ruta;
        setFile();
    }
    private void setCarrera(String ruta){
        lineas[1]=ruta;
        setFile();
    }
}
