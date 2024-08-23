/*
 *  Repositorio: https://github.com/DAlexSC/LAB_IPC1_2S2024
 */

package clase4;

import modelos.Gato;
import modelos.Perro;
import interfaz.LoginVistaPorCodigo;
import interfaz.LoginVistaPorDragAndDrop;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import modelos.Animal;
import modelos.Usuario;

/**
 * @author Douglas Soch
 */
public class Clase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Polimorfismo principal
        Calculadora calc = new Calculadora();
        System.out.println(calc.multiplicacion(5, 3)); // Suma con enteros
        System.out.println(calc.multiplicacion(5, 3.5)); // Suma con decimales
        System.out.println(calc.multiplicacion(5, 3.5, 2)); // Respuesta de tipo texto
        
        // Polimorfismo de subtipo
        Animal animal_perro = new Perro();
        Animal animal_gato = new Gato();
        animal_perro.hacerSonido();
        animal_gato.hacerSonido();
        
        // Manejo de binarios
        String ruta_archivo_binario = "C:\\Users\\sochd\\Desktop\\usuario.bin";
        ManejoArchivoBinario archivoBin = new ManejoArchivoBinario();
        archivoBin.agregarContenido(ruta_archivo_binario, new Usuario("ABC", "123", 0));
        archivoBin.agregarContenido(ruta_archivo_binario, new Usuario("DEF", "321", 1));
        List<Usuario> contenido = (List<Usuario>)archivoBin.obtenerContenido(ruta_archivo_binario);
        if (contenido != null) {
            for (Usuario usuario : contenido) {
                System.out.println("*******************");
                System.out.println("Codigo: " + usuario.getCodigo());
                System.out.println("Contrasenia: " + usuario.getContrasenia());
                System.out.println("Tipo de usuario: " + usuario.getTipoUsuario());
                System.out.println("*******************");
            }
        }
        
        // Manejo de textos planos
        String ruta_archivo_plano = "C:\\Users\\sochd\\Desktop\\investigadores.csv";
        ManejoArchivoTextoPlano archivoPlano = new ManejoArchivoTextoPlano();
        archivoPlano.agregarContenido("codigo,nombre,genero,experimientos,contrasenia", ruta_archivo_plano);
        archivoPlano.agregarContenido("QI-02,Pablo Hernandez,M,2,IPCQ02", ruta_archivo_plano);
        archivoPlano.agregarContenido("QI-03,Lucas Tomas,M,5,IPCQ03", ruta_archivo_plano);
        archivoPlano.agregarContenido("QI-04,Luisa Ceballos,M,7,IPCQ04", ruta_archivo_plano);
        archivoPlano.leerCSV(ruta_archivo_plano);
    }
}
