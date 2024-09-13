package construcciones_abstractas;

/**
 *
 * @author Douglas Soch
 */
public class AnimalHerencia {

    String nombre;

    // Metodo que sera sobreescrito
    public void hacerSonido() {
        System.out.println("Animal hace sonido");
    }

    // Metodo concreto
    void comer() {
        System.out.println(nombre + " esta comiendo");
    }
}
