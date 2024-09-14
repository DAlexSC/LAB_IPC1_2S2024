package controlador;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.FaseModelo;
import modelo.TiempoModelo;
import vista.frmEstacionTrabajo;

/**
 *
 * @author Douglas Soch
 */
public class EstacionTrabajoControlador {

    frmEstacionTrabajo vista;
    TiempoModelo modelo;
    ArrayList<FaseModelo> faseEnsamblaje = new ArrayList();
    ArrayList<FaseModelo> fasePintura = new ArrayList();
    String material = "metal";
    String color = "negro";
    int cantidad = 5;

    public EstacionTrabajoControlador(frmEstacionTrabajo vista, TiempoModelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnProducir.addActionListener(listenerProducir());
    }

    public void init() {
        this.faseEnsamblaje.add(new FaseModelo("METAL", 5, 3));
        this.faseEnsamblaje.add(new FaseModelo("MADERA", 25, 1));
        this.faseEnsamblaje.add(new FaseModelo("VIDRIO", 10, 6));
        this.fasePintura.add(new FaseModelo("VERDE", 15, 3));
        this.fasePintura.add(new FaseModelo("NEGRO", 5, 0));
        this.fasePintura.add(new FaseModelo("NA", 0, 0));
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);
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

    private void hiloFases() {
        // Crear un nuevo hilo para manejar todas las fases
        Thread hilo = new Thread(() -> {

            try {
                for (int i = 0; i < this.cantidad; i++) {
                    // Fase 1: Ensamblaje
                    FaseModelo modelEnsamblaje = this.obtenerRegistroFase(this.material.toLowerCase(), true);
                    for (int j = 0; j <= 100; j++) {
                        Thread.sleep((modelEnsamblaje.getTiempo() * 1000) / 100);
                        this.vista.pbEnsamblaje.setValue(j); // Actualiza barra ensamblaje
                    }

                    // Fase 2: Pintura
                    FaseModelo modelPintura = this.obtenerRegistroFase(this.color.toLowerCase(), false);
                    for (int j = 0; j <= 100; j++) {
                        Thread.sleep((modelPintura.getTiempo() * 1000) / 100);
                        this.vista.pbPintura.setValue(j); // Actualiza barra pintura
                    }

                    // Fase 3: Empaquetado
                    for (int j = 0; j <= 100; j++) {
                        Thread.sleep((10 * 1000) / 100);
                        this.vista.pbEmpaque.setValue(j); // Actualiza barra empaquetado
                    }
                    
                    this.vista.pbEnsamblaje.setValue(0);
                    this.vista.pbPintura.setValue(0);
                    this.vista.pbEmpaque.setValue(0);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        hilo.start();
    }

    private ActionListener listenerProducir() {
        return e -> {
            hiloTiempo();
            hiloFases();
        };
    }

    private FaseModelo obtenerRegistroFase(String descripcion, boolean esEnsamblaje) {

        if (esEnsamblaje) {
            for (FaseModelo faseModelo : faseEnsamblaje) {
                if (faseModelo.getDescripcion().toLowerCase().equals(descripcion)) {
                    return faseModelo;
                }
            }
        } else {
            for (FaseModelo faseModelo : fasePintura) {
                if (faseModelo.getDescripcion().toLowerCase().equals(descripcion)) {
                    return faseModelo;
                }
            }
        }

        return null;
    }

}
