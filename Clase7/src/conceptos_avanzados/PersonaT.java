package conceptos_avanzados;

/**
 * Ejemplo - Referencia this
 * 
 * @author Douglas Soch
 */
public class PersonaT {

    String name;
    int age;

    public PersonaT(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void mostrarInfo(){
        System.out.println("Nombre: " + this.name + ", Edad: " + this.age);
    }
}
