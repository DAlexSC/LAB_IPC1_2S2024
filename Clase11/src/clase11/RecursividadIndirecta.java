package clase11;

/**
 *
 * @author Douglas Soch
 */
public class RecursividadIndirecta {

    public boolean esPar(int n) {
        if (n == 0) {
            return true;
        } else {
            return esImpar(n - 1);
        }
    }

    public boolean esImpar(int n) {
        if (n == 0) {
            return false;
        } else {
            return esPar(n - 1);
        }
    }
}
