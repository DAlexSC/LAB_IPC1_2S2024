/*
 *  Repositorio: https://github.com/DAlexSC/LAB_IPC1_2S2024
 */

package clase7;

import conceptos_avanzados.CajaPC;
import conceptos_avanzados.CarroMI;
import conceptos_avanzados.MathME;
import construcciones_abstractas.PerroA;

/**
 * @author Douglas Soch
 */
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        CajaPC<Integer> caja = new CajaPC<>();
//        caja.set(1);
//        System.out.println(caja.get());
        
        CajaPC<String> caja = new CajaPC<>();
        caja.set("Hola");
        System.out.println(caja.get());
        // caja.set(1);
        // System.out.println(caja.get());
        
    }

}
