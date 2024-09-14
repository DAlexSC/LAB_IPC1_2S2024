/*
 *  Repositorio: https://github.com/DAlexSC/LAB_IPC1_2S2024
 */

package ejemplohilo;

import controlador.EstacionTrabajoControlador;
import modelo.TiempoModelo;
import vista.frmEstacionTrabajo;

/**
 * @author Douglas Soch
 */
public class EjemploHilo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        frmEstacionTrabajo vista = new frmEstacionTrabajo();
        TiempoModelo modelo = new TiempoModelo();
        EstacionTrabajoControlador controlador = new EstacionTrabajoControlador(vista, modelo);
        controlador.init();
        
//        
//        vista.setVisible(true);
//        vista.setLocationRelativeTo(null);
    }

}
