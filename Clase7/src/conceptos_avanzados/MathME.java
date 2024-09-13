package conceptos_avanzados;

/**
 * Ejemplo - Miembro estatico
 * 
 * @author Douglas Soch
 */
public class MathME {

    static public double PI = 3.14159;
    static final double CONSTANTE = 2; // No se puede modificar su valor debido a que tiene la palabra reservada 'final'

    static public double multiplicar(double a, double b) {
        return a * b;
    }

}
