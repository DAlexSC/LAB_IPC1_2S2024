package clase4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Douglas Soch
 */
public class ManejoArchivoTextoPlano {
    
    void crearArchivo(String ruta_archivo){
        try {
            FileWriter archivo = new FileWriter(ruta_archivo);
            archivo.close();
            System.out.println("Archivo creado correctamente");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    void agregarContenido(String contenido, String ruta_archivo){
        try {
            FileWriter archivo = new FileWriter(ruta_archivo, true); // En el caso que no exista el archivo lo crea y si ya existe el archivo lo sobreescribe
            archivo.write(contenido + "\n");
            archivo.close();
            System.out.println("Contenido agregado correctamente");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    void leerCSV(String ruta_archivo){
        try {
            BufferedReader lector = new BufferedReader(new FileReader(ruta_archivo));
            String linea;

            lector.readLine();
            while ((linea = lector.readLine()) != null) {              
                String[] contenido = linea.split(",");
                System.out.println("Codigo: " + contenido[0]);
                System.out.println("Nombre: " + contenido[1]);
                System.out.println("Genero: " + contenido[2]);
                System.out.println("Experimientos: " + contenido[3]);
                System.out.println("Contrasenia: " + contenido[4]);
            }
            lector.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
