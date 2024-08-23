package clase4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import modelos.Usuario;

/**
 *
 * @author Douglas Soch
 */
public class ManejoArchivoBinario {

    void agregarContenido(String ruta_archivo, Usuario usu){
        try {
            // Se obtiene el listado de usuario
            List<Usuario> listadousu = this.obtenerContenido(ruta_archivo);
            listadousu.add(usu);

            FileOutputStream salidaArchivo = new FileOutputStream(ruta_archivo);
            ObjectOutputStream salidaObjeto = new ObjectOutputStream(salidaArchivo);
            salidaObjeto.writeObject(listadousu);
            salidaArchivo.close();
            salidaObjeto.close();
        } catch (Exception e) {
            System.out.println("Error al agregar contenido: " + e.getMessage());
        }  
    }
    
    ArrayList<Usuario> obtenerContenido(String ruta_archivo){
        ArrayList<Usuario> respuesta = new ArrayList<>();
        try {
            // Verificar si el archivo existe
            File archivo = new File(ruta_archivo);            
            if (archivo.exists()) {
                FileInputStream entradaArchivo = new FileInputStream(ruta_archivo);
                ObjectInputStream entradaObjeto = new ObjectInputStream(entradaArchivo);
                respuesta = (ArrayList<Usuario>)entradaObjeto.readObject();
            }            
        } catch (Exception e) {
            System.out.println("Error al obtener el contenido: " + e.getMessage());
        }
        return respuesta;
    }
    
}
