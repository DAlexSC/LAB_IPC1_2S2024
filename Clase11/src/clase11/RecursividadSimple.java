package clase11;

/**
 *
 * @author Douglas Soch
 */
public class RecursividadSimple {

    // 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 = 55
    public int sumaNaturales(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumaNaturales(n - 1);
        }
    }
    
}
