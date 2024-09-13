package conceptos_avanzados;

/**
 *
 * @author Douglas Soch
 */
public class CajaPC<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
    
}
