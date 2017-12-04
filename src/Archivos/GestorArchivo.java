package Archivos;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GestorArchivo {

    private FileInputStream inputStream;
    private final Path file,dir;
    private String alumno,carrera;

    public GestorArchivo() {
        dir = Paths.get("src/Archivos");
        file = Paths.get("src/Archivos/ruta.txt");
        carrera = "src/Archivos/Horario_Carrera.xlsx";
        setLinea();
    }

    public boolean checkFile() {
        return Files.exists(file);
    }
    

    public boolean checkDir() {
        return Files.exists(dir);
    }

    public String getAlumno() {
        setLinea();
        return alumno;
    }


    public FileInputStream getInputAlumno() {
        try {
            setLinea();
            System.out.println(alumno);
            inputStream = new FileInputStream(alumno);

        } catch (FileNotFoundException e) {

        }
        return inputStream;
    }

    public FileInputStream getInputCarrera() {
        try {
            inputStream = new FileInputStream(carrera);

        } catch (FileNotFoundException e) {
            System.out.println("error en getInputCarrera");

        }
        return inputStream;
    }

    private void setFile() {
        String texto = alumno;
        try {
            Files.write(file, texto.getBytes());
        } catch (IOException e) {
            System.out.println("El archivo no pudo ser guardado");
        }
        setLinea();

    }
    public void deleteFile(){
        try{
        Files.delete(file);
        }catch(IOException e){
            System.out.println("Error deleteFile");
        }
    }

    private void setLinea() {
        try {
            String texto = new String(Files.readAllBytes(file));
            System.out.println("setLineas texto:"+texto);
            alumno = texto;
        } catch (IOException e) {
        }
    }

    public void setAlumno(String ruta) {
        alumno = ruta.replace("\\", "/");
        setFile();
    }

    
}
