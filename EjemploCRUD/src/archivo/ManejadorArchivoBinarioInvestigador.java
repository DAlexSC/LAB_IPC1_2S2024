package archivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import modelo.Investigador;

/**
 *
 * @author Douglas Soch
 */
public class ManejadorArchivoBinarioInvestigador {

    public void agregarContenido(String ruta_archivo, Investigador investigador){
        try {
            // Se obtiene el listado de investigador
            List<Investigador> listado_investigador = this.obtenerContenido(ruta_archivo);
            listado_investigador.add(investigador);

            FileOutputStream salidaArchivo = new FileOutputStream(ruta_archivo);
            ObjectOutputStream salidaObjeto = new ObjectOutputStream(salidaArchivo);
            salidaObjeto.writeObject(listado_investigador);
            salidaArchivo.close();
            salidaObjeto.close();
        } catch (Exception e) {
            System.out.println("Error al agregar contenido: " + e.getMessage());
        }  
    }
    
    public void modificarContenido(String ruta_archivo, String codigo, Investigador investigador){
        try {
            // Se obtiene el listado de investigador
            List<Investigador> listado_investigador = this.obtenerContenido(ruta_archivo);
            
            for (Investigador invest : listado_investigador) {
                if (invest.getCodigo().equals(codigo)) {
                    invest.setNombre(investigador.getNombre());
                    invest.setGenero(investigador.getGenero());
                    invest.setContrasenia(investigador.getContrasenia());
                }
            }

            FileOutputStream salidaArchivo = new FileOutputStream(ruta_archivo);
            ObjectOutputStream salidaObjeto = new ObjectOutputStream(salidaArchivo);
            salidaObjeto.writeObject(listado_investigador);
            salidaArchivo.close();
            salidaObjeto.close();
        } catch (Exception e) {
            System.out.println("Error al agregar contenido: " + e.getMessage());
        }  
    }
    
    public void eliminarContenido(String ruta_archivo, String codigo){
        try {
            // Se obtiene el listado de investigador
            List<Investigador> listado_investigador = this.obtenerContenido(ruta_archivo);
            
            for (int i = 0; i < listado_investigador.size(); i++) {
                if (listado_investigador.get(i).getCodigo().equals(codigo)) {
                    listado_investigador.remove(i);
                }
            }

            FileOutputStream salidaArchivo = new FileOutputStream(ruta_archivo);
            ObjectOutputStream salidaObjeto = new ObjectOutputStream(salidaArchivo);
            salidaObjeto.writeObject(listado_investigador);
            salidaArchivo.close();
            salidaObjeto.close();
        } catch (Exception e) {
            System.out.println("Error al agregar contenido: " + e.getMessage());
        }  
    }
    
    public ArrayList<Investigador> obtenerContenido(String ruta_archivo){
        ArrayList<Investigador> respuesta = new ArrayList<>();
        try {
            // Verificar si el archivo existe
            File archivo = new File(ruta_archivo);            
            if (archivo.exists()) {
                FileInputStream entradaArchivo = new FileInputStream(ruta_archivo);
                ObjectInputStream entradaObjeto = new ObjectInputStream(entradaArchivo);
                respuesta = (ArrayList<Investigador>)entradaObjeto.readObject();
            }            
        } catch (Exception e) {
            System.out.println("Error al obtener el contenido: " + e.getMessage());
        }
        return respuesta;
    }
    
}
