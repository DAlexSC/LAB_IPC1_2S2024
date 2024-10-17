package clase11;

import java.util.Scanner;

/**
 *
 * @author Douglas Soch
 */
public class ExceptionHandlingExample {

    public void example1() {
        Scanner leer = new Scanner(System.in);
        boolean ejecutar = true;
        int[] numbers = {1, 2, 3};

        while (ejecutar) {
            try {
                System.out.println("**********************");
                System.out.println("Eliga una opcion:");
                System.out.println("1. Cambiar valores");
                System.out.println("2. Salir");
                System.out.println("**********************");
                int opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Selecciona la posicion a modificar");
                        int posicion = leer.nextInt();
                        System.out.println("Ingresa el valor nuevo");
                        int valor = leer.nextInt();
                        numbers[posicion] = valor;
                        break;
                    case 2:
                        ejecutar = false;
                        break;
                    default:
                        throw new AssertionError();
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Has intentado acceder a un índice fuera del rango del array.");
            } catch (Throwable th) {
                System.out.println("Error: " + th + " - " + th.getMessage());
            } finally {
                System.out.println("El bloque finally siempre se ejecuta.");
            }
        }
        System.out.println("El programa continúa ejecutándose después del try-catch.");
    }

    public void example2(){
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Excepción manejada: " + e.getMessage());
        }
    }
    
    private void method1() throws Exception {
        method2();
    }

    private void method2() throws Exception {
        throw new Exception("Ocurrió una excepción en method2");
    }
    
}
