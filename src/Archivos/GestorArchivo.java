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
        
        setLineas();
    }

    public boolean checkFile() {
        return Files.exists(dir);
    }

    public boolean checkDir() {
        return Files.exists(dir);
    }

    public String getAlumno() {
        setLineas();
        return alumno;
    }


    public FileInputStream getInputAlumno() {
        try {
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
            Files.write(dir, texto.getBytes());
        } catch (IOException e) {
            System.out.println("El archivo no pudo ser guardado");
        }

    }

    private void setLineas() {
        try {
            String texto = new String(Files.readAllBytes(dir));
            alumno = texto;
        } catch (IOException e) {
        }
    }

    private void setAlumno(String ruta) {
        alumno = ruta;
        setFile();
    }

    
}
