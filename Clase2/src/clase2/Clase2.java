/*
 *  Repositorio: https://github.com/DAlexSC/LAB_IPC1_2S2024
 */

package clase2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Douglas Soch
 */
public class Clase2 {

     /**
     * TEMAS VISTOS EN EL LABORATORIO:
     * 
     * 1. Input & Output
     * 2. Operadores aritmeticos, relacionales y logicos
     * 3. Prioridad entre operadores
     * 4. Estructuras de control
     * 5. Ciclos
     * 6. Arreglos
     * 7. Listas dinamicas
     * 8. Procedimientos y funciones
     */
    public static void main(String[] args) {
        
        /**
         * 1. Input & Output
         * 
         * El Input (entrada) se refiere a la manera en que un programa recibe datos del usuario, mientras que el Output (salida) se refiere a cómo el programa muestra datos al usuario.
         * En Java, podemos usar la clase Scanner para obtener entradas del usuario, a traves de consola, y System.out.println para mostrar salidas, a traves de consola.
         * 
         * IMPORTANTE LEER: https://www.w3schools.com/java/java_user_input.asp
         */
        
        // ********************************************************
        // ********* EJEMPLO 1 - ENTRADA DE VALOR ENTERO **********
        // ********************************************************
        // Se crea el objeto scanner para que podamos obtener la entrada de datos a traves de consola. 
        // En este ejemplo ya se importo el paquete, puedes verlo en la linea 7 de este archivo (↑); sino importas el paquete tendrás un error y no podras utilizar el Scanner.
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Ingresa un numero entero: "); // Esta es una salida, la cual muestra un mensaje, solicitando el ingreso de un numero entero.
        int numero = scanner.nextInt(); // En esta linea ocurre la entrada del dato, en este caso para que la entrada sea valida, el usuario debe de ingresar un numero entero.
        System.out.println("Has ingresado: " + numero); // Estas es una salida la cual muestra un mensaje que nos indica que valor hemos ingresado.
        
        // **********************************************************
        // ********* EJEMPLO 2 - ENTRADA DE VALOR DECIMAL ***********
        // **********************************************************
        // En este caso como en el ejemplo 1 declaramos el objeto Scanner ya no lo volvemos a declarar sino que reutilizamos el objeto creado anteriormente.
        
        System.out.print("Ingresa un numero decimal: "); // Esta es una salida, la cual muestra un mensaje, solicitando el ingreso de un numero decimal.
        float decimal = scanner.nextFloat(); // En esta linea ocurre la entrada del dato, en este caso para que la entrada sea valida, el usuario debe de ingresar un numero decimal.
        System.out.println("Has ingresado: " + decimal); // Estas es una salida la cual muestra un mensaje que nos indica que valor hemos ingresado.
        
        
        /**
         * 2. Operadores aritmeticos, relacionales y logicos
         * 
         * Los operadores aritméticos se utilizan para realizar operaciones matemáticas como suma (+), resta (-), multiplicación (*), división (/), y módulo (%).
         * Los operadores relacionales se utilizan para comparar dos valores, devolviendo un valor booleano. Ejemplos incluyen: ==, !=, >, <, >=, <=.
         * Los operadores lógicos se utilizan para combinar expresiones booleanas. Ejemplos incluyen: && (AND), || (OR), ! (NOT).
         * 
         * MAS INFORMACION: http://profesores.fi-b.unam.mx/carlos/java/java_basico2_5.html
         * 
         * PREGUNTA 1: ¿Qué resultado devuelve la expresión 5 > 3 && 2 < 4?
         * RESPUESTA 1: Devuelve true porque ambas condiciones son verdaderas.
         * 
         * PREGUNTA 2: ¿Qué resultado devuelve la expresión 5 > 10 || 2 < 4?
         * RESPUESTA 2: Devuelve true porque la segunda condicion es verdadera.
         */
        
        // ********************************************************
        // *********** EJEMPLO - USO DE LOS OPERADORES ************
        // ********************************************************
        int a = 5;
        int b = 3;
        int c = 2;
        int d = 4;
        // En esta operacion se utiliza operadores relacionales y logicos. Lo que esta evaluando es lo siguiente: (5 > 3) && (2 < 4), en el cual, su resultado es true
        boolean resultado1 = (a > b) && (c < d); 
        // En esta operacion se utiliza operadores relacionales, logicos y aritmeticos. Lo que esta evaluando es lo siguiente: (5 + 1) < 2, en el cual, su resultado es false
        boolean resultado2 = (a + 1) < 2;
        // En esta operacion se utiliza unicamente operadores relacionales. Lo que esta evaluando es lo siguiente: 5 > 2, en el cual, su resultado es true
        boolean resultado3 = a > 2;
        // En esta operacion se utiliza unicamente operadores aritmeticos. Lo que esta evaluando es lo siguiente: 3 + 2, en el cual, su resultado es 5
        int resultado4 = b + 2;
        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
        System.out.println("Resultado 4: " + resultado4);

        /**
         * 3. Prioridad entre operadores
         * 
         * La prioridad de operadores determina el orden en que se evalúan las operaciones en una expresión. Por ejemplo, la multiplicación (*) y división (/) tienen mayor prioridad que la suma (+) y resta (-).
         * 
         * MAS INFORMACION: https://www.geeksforgeeks.org/operators-in-java/
         * 
         * PREGUNTA: ¿Cuál es el resultado de la expresión 2 + 3 * 4?
         * RESPUESTA: El resultado es 14 porque la multiplicación se realiza antes que la suma.
         */
        
        // EJEMPLO
        int resultadoPrioridad = 2 + 3 * 4; // Resultado: 14
        System.out.println("Resultado de 2 + 3 * 4: " + resultadoPrioridad);
        
        /**
         * 4. Estructuras de control
         * 
         * Las estructuras de control permiten dirigir el flujo de ejecución de un programa. Estos incluyen: if, else, else if, switch
         * 
         * MAS INFORMACION: https://programandoointentandolo.com/2017/07/estructuras-condicionales-java.html
         * 
         * PREGUNTA: ¿Qué estructura de control usarías para evaluar múltiples condiciones sobre una misma variable?
         * RESPUESTA: La estructura switch es ideal para evaluar múltiples condiciones sobre una misma variable.
         */
        
        // EJEMPLO
        int dia = 3;
        switch(dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Día inválido");
        }
        
        /**
         * 5. Ciclos
         * 
         * Los ciclos permiten repetir un bloque de código varias veces. En Java, los principales ciclos son for, while, y do-while.
         * 
         * MAS INFORMACION - FOR: https://www.programarya.com/Cursos/Java/Ciclos/Ciclo-for
         * MAS INFORMACION - WHILE: https://www.programarya.com/Cursos/Java/Ciclos#
         * MAS INFORMACION - DO WHILE: https://www.programarya.com/Cursos/Java/Ciclos/Ciclo-do-while#:~:text=Sintaxis%20del%20Ciclo%20Do%2DWhile%20en%20Java%3A
         */
        
        // EJEMPLO
        int contador = 0;
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++; // Otra forma de definir esta linea seria -> contador = contador + 1;
        }
        
        /**
         * 6. Arreglos
         * 
         * Un arreglo es una estructura de datos que almacena múltiples valores del mismo tipo en una sola variable. Los arreglos tienen un tamaño fijo una vez que se declaran.
         * 
         * IMPORTANTE LEER: https://www.manualweb.net/java/arrays-java/
         * MAS INFORMACION (LEER DEL INCISO 1 AL 6): https://oregoom.com/java/array/
         * 
         * PREGUNTA: ¿Cómo accedes al tercer elemento de un arreglo llamado 'numeros'?
         * RESPUESTA: Utilizando la sintaxis numeros[2], ya que los índices de los arreglos comienzan en 0.
         */
        
        // EJEMPLO
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Tercer elemento: " + numeros[2]);
        
        /**
         * 7. Listas dinamicas
         * 
         * Las listas dinámicas, como ArrayList, permiten almacenar un número variable de elementos. A diferencia de los arreglos, su tamaño puede cambiar durante la ejecución del programa.
         * 
         * IMPORTANTE LEER: https://www.ionos.com/es-us/digitalguide/paginas-web/desarrollo-web/java-arraylist/?srsltid=AfmBOopCpbVF-f0_Xhh7QqbYqzRRQ5seiP-P9ho0qvru9xsuHltVQgD3
         * 
         * PREGUNTA: ¿Cómo agregas un elemento a una lista dinámica llamada 'lista'?
         * RESPUESTA: Usando el método add(). Por ejemplo: lista.add(elemento);
         */
        
        // EJEMPLO
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        System.out.println("Lista: " + lista);
        
        /**
         * 8. Procedimientos y funciones
         * 
         * Los procedimientos (void) y funciones (que devuelven un valor) son bloques de código reutilizables que realizan una tarea específica.
         * 
         * IMPORTANTE LEER - FUNCIONES (LEER DEL INCISO 1 AL 4, TAMBIEN EL INCISO 6): https://oregoom.com/java/funciones/
         * MAS INFORMACION: https://openwebinars.net/blog/introduccion-a-java-metodos-parametros-y-argumentos/
         * 
         * PREGUNTA: ¿Cuál es la diferencia entre un procedimiento y una función en Java?
         * RESPUESTA: Un procedimiento (void) no devuelve un valor, mientras que una función devuelve un valor de un tipo específico.
         */
        
        procedimiento();
        int valorFuncion = funcion();
        System.out.println("Valor de la función: " + valorFuncion);
    
        
    }
    
    // EJEMPLO
    public static void procedimiento() {
        System.out.println("Este es un procedimiento.");
    }
    public static int funcion() {
        return 42;
    }
}
