package construcciones_abstractas;

/**
 *
 * @author Douglas Soch
 */
abstract class AnimalAbstracto {

    String nombre;
    
    // Metodo abstracto
    abstract public void hacerSonido();
    
    // Metodo concreto
    public void comer(){
        System.out.println("El animal esta comiendo");
    }
    
}
