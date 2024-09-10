/*
 *  Repositorio: https://github.com/DAlexSC/LAB_IPC1_2S2024
 */

package clase6;

import controlador.MenuPrincipalControlador;
import modelo.TiempoModelo;
import vista.frmMenuPrincipal;

/**
 * @author Douglas Soch
 */
public class Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmMenuPrincipal vista = new frmMenuPrincipal();
        TiempoModelo modelo = new TiempoModelo();
        MenuPrincipalControlador controlador = new MenuPrincipalControlador(vista, modelo);
        controlador.init();
    }

}
