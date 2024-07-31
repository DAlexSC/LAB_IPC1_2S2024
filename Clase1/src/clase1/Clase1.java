/*
 * Repositorio: https://github.com/DAlexSC/LAB_IPC1_2S2024.git
 */
package clase1;

/**
 *
 * @author Douglas Soch
 */
public class Clase1 {

    /**
     * TEMAS VISTOS EN EL LABORATORIO:
     * 
     * 1. Variables
     * 2. Tipos de datos primitivos
     * 3. Casteos (implicitos y explicitos)
     */
    public static void main(String[] args) {
        
        /**
         * Una variable es un contenedor que almacena datos. Estas variables pueden inicializarse y sus valores pueden modificarse durante la ejecución de un programa.
         * 
         * La sintaxis para declarar una variable es la siguiente: tipo_dato nombre_variable;
         * Si se desea inicializar una variable durante su declaración, la sintaxis es la siguiente: tipo_dato nombre_variable = valor;
         * 
         * La diferencia entre una variable inicializada y una que no lo está, es que la variable inicializada tiene un valor predeterminado cuando se ejecuta el proyecto.
         * 
         * MAS INFORMACION: https://www.manualweb.net/java/tipos-datos-primitivos-java/
         * 
         * PREGUNTA: ¿Que sucede sino inicializo las variables que declaro?
         * RESPUESTA: Estas variables tendra valores por defecto. Es por esto que, se recomienda siempre inicializar las variables que declaramos para un mejor manejo de las variables.
         */
        
        // EJEMPLO
        char caracter; // Cada vez que ejecutemos el proyecto, la variable 'caracter' tendra el valor prederminado de 'u0000' a pesar de no haberla inicializado.
        int contador = 2; // Cada vez que ejecutemos el proyecto, la variable 'contador' tendra el valor predeterminado de 2.
        
        /**
         * Los tipos de datos primitivos que existen son 8: byte, short, int, long, char, float, double, boolean.
         * 
         * Cada tipo de dato tiene un rango aproximado de valores que se pueden utilizar. Por ejemplo, el rango de valores que se pueden utilizar en un byte es de -128 hasta 127.
         * Esto nos indica que, si declaramos una variable de tipo byte y le asignamos un valor que esté fuera de su rango, el compilador nos mostrará un error de incompatibilidad.
         * 
         * Esto pasa en todos los tipos de datos primitivos.
         * 
         * MAS INFORMACION: https://www.abrirllave.com/java/tipos-de-datos-primitivos.php
         */
        
        // EJEMPLO
        byte numero1 = -125; // Correcto
        byte numero2 = 100; // Correcto
        // byte numero3 = 128; // Error (Si descomentas esta linea de codigo verás que ocurre un error)
        // byte numero4 = -129; // Error (Si descomentas esta linea de codigo verás que ocurre un error)
        
        /**
         * Un aspecto importante al declarar y utilizar una variable es el uso de literales. 
         * En ocasiones, el compilador de Java puede mostrar un error al declarar una variable, aunque esté correctamente declarada, o puede haber inconsistencias al utilizar las variables.
         * Esto es debido a que en algunos tipos de datos necesita un literal para determinar adecuadamente el tipo de dato, como por ejemplo el long.
         * 
         * MAS INFORMACION: https://www.manualweb.net/java/literales-java/
         */
        
        // EJEMPLO:
        long numeroLargo1 = 1010252548791L; // Correcto
        // long numeroLargo2 = 1010252548791; // Error (Si descomentas esta linea de codigo verás que ocurre un error)
        
        /**
         * Un tema fundamental al programar es el casteo de variables. El casting es un procedimiento para tansformar una variable primitiva de un tipo a otro.
         * 
         * Existen 2 tipos de casteos los cuales son los siguientes:
         * Implicito: Ocurre cuando se asigna un valor de un tipo de dato mas pequeño a un tipo de dato mas grande. Este tipo de casting se realiza AUTOMATICAMENTE.
         * Explicito: Ocurre cuando se asigna un valor de un tipo de dato mas grande a un tipo de dato mas pequeño. Este tipo de casting debe ser especificado EXPLICITAMENTE.
         * 
         * IMPORTANTE LEER: https://techkrowd.com/programacion/java/java-conversion-de-tipos-casting/
         * 
         * PREGUNTA: ¿A que se refiere cuando se dice "tipo de dato mas pequeño" o "tipo de dato mas grande"?
         * RESPUESTA: Se refiere al tamanio que ocupa la variable en memoria. Esto puede verse en la tabla que se encuentra en el link: https://www.abrirllave.com/java/tipos-de-datos-primitivos.php
         */
        
        // EJEMPLO 1 CASTEO IMPLICITO - De byte a short
        byte x = 1; // Este tipo de dato es de 8 bits de memoria
        short y; // Este tipo de dato es de 16 bits de memoria
        // Como el tamaño de memoria de 'x' es menor o igual al tamaño de memoria de 'y' entonces se puede realizar el casteo implicito.
        y = x;
        // Pregunta: ¿Que ocurre si a 'x' le asigno el valor de 'y'? | Respuesta: Ocurrira un error debido a que no se puede realizar el casteo implicito.
        // x = y; // Error (Si descomentas esta linea verás que ocurre un error)
        
        // EJEMPLO 2 CASTEO IMPLICITO - De int a float
        int a = 1; // Este tipo de dato es de 32 bits de memoria
        double b; // Este tipo de dato es de 32 bits de memoria
        // Como el tamaño de memoria de 'a' es menor o igual al tamaño de memoria de 'b' entonces se puede realizar el casteo implicito.
        b = a;
        // Pregunta: ¿Que ocurre si a 'a' le asigno el valor de 'b'? | Respuesta: Ocurrira un error debido a que no se puede realizar el casteo implicito.
        // a = b; // Error (Si descomentas esta linea verás que ocurre un error)
        
        // EJEMPLO 3 CASTEO EXPLICITO
        short grande = 10; // Este tipo de dato es de 16 bits de memoria
        byte pequenio = 5; // Este tipo de dato es de 8 bits de memoria
        pequenio = (byte) grande; // Se le esta asignando el valor que tiene la variable 'grande' a la variable 'pequenio', por medio, del casteo implicito.
        
        /**
         * Un tipo de dato que NO es primitivo. pero que se utiliza comunmente al programar, es el String. Este tipo de dato permite el manejo de cadenas de caracteres (texto).
         */
        String mensaje = "Hola mundo!";
        mensaje = "Hola :D";
    }
    
}
