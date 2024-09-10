package controlador;

import java.awt.event.ActionListener;
import modelo.TiempoModelo;
import vista.frmMenuPrincipal;

/**
 *
 * @author Douglas Soch
 */
public class MenuPrincipalControlador {

    private frmMenuPrincipal vista;
    private TiempoModelo modelo;

    public MenuPrincipalControlador(frmMenuPrincipal vista, TiempoModelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    public void init() {
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);
        this.vista.btnCargar.addActionListener(listenerCargar());
    }

    private void hiloTiempo() {
        // Crear un nuevo hilo para simular una tarea
        Thread hilo = new Thread(() -> {

            try {
                while (true) {
                    this.vista.lblTiempo.setText(this.modelo.currentTime());
                    Thread.sleep(1000);
                    this.modelo.incrementSecond();
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        });
        hilo.start();
    }

    private void hiloBarraProgreso() {
        // Crear un nuevo hilo para simular una tarea
        Thread hilo = new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                try {
                    // 100 * 50 = 5000 ms
                    Thread.sleep(50); // Simula el tiempo de la tarea
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // Actualiza la barra de progreso
                this.vista.pbCarga.setValue(i);
            }
        });
        hilo.start();
    }

    private ActionListener listenerCargar() {
        return e -> {
            hiloTiempo();
            hiloBarraProgreso();
        };
    }

}
