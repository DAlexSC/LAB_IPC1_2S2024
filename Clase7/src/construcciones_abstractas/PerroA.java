package construcciones_abstractas;

/**
 *
 * @author Douglas Soch
 */
public class PerroA implements AnimalInterface {

    @Override
    public void hacerSonido() {
        System.out.println("GUAU Interface");
    }

    @Override
    public void comer() {
        System.out.println("Comer");
    }

}
