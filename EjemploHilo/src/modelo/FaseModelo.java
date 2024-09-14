package modelo;

/**
 *
 * @author Douglas Soch
 */
public class FaseModelo {

    String descripcion;
    int tiempo;
    double costo;

    public FaseModelo(String descripcion, int tiempo, double costo) {
        this.descripcion = descripcion;
        this.tiempo = tiempo;
        this.costo = costo;
    }

    public FaseModelo() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
}
