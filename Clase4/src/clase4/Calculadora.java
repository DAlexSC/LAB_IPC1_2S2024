package clase4;

/**
 *
 * @author Douglas Soch
 */
public class Calculadora {

    int multiplicacion (int valor1, int valor2){
        return valor1 * valor2;        
    }
    
    double multiplicacion (double valor1, double valor2){
        return valor1 * valor2;
    }
    
    String multiplicacion (double valor1, double valor2, double valor3){
        return "Resultado: " + (valor1 * valor2 * valor3);
    }
    
}
