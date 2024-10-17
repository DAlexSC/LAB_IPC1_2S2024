package clase11;

import java.util.Scanner;

/**
 *
 * @author Douglas Soch
 */
public class CalculadoraDebugging {

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();
            int opcion = leerOpcion(scanner);

            if (opcion == 5) {
                System.out.println("Saliendo del programa.");
                break;
            }

            System.out.println("Introduce el primer número:");
            int num1 = scanner.nextInt();
            System.out.println("Introduce el segundo número:");
            int num2 = scanner.nextInt();

            int resultado = 0;
            switch (opcion) {
                case 1:
                    resultado = sumar(num1, num2);
                    break;
                case 2:
                    resultado = restar(num1, num2);
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = dividir(num1, num2);
                    } else {
                        System.out.println("Error: División por cero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Opción inválida.");
                    continue;
            }

            mostrarResultado(resultado);
        }
    }

    // Procedimiento para mostrar el menú
    private void mostrarMenu() {
        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");
    }

    // Procedimiento para leer la opción del usuario
    private int leerOpcion(Scanner scanner) {
        System.out.print("Introduce tu opción: ");
        return scanner.nextInt();
    }

    // Función para sumar dos números
    private int sumar(int a, int b) {
        return a + b;
    }

    // Función para restar dos números
    private int restar(int a, int b) {
        return a - b;
    }

    // Función para multiplicar dos números
    private int multiplicar(int a, int b) {
        return a * b;
    }

    // Función para dividir dos números
    private int dividir(int a, int b) {
        return a / b;
    }

    // Procedimiento para mostrar el resultado
    private void mostrarResultado(int resultado) {
        System.out.println("El resultado es: " + resultado);
    }

}
