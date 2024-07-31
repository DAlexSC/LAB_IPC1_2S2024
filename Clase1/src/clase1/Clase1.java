/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
         * PREGUNTA: ¿Que sucede sino inicializo las variables que declaro?
         * RESPUESTA: Estas variables tendra valores por defecto. Es por esto que, se recomienda siempre inicializar las variables que declaramos para un mejor manejo de las variables.
         * 
         * MAS INFORMACION: https://www.manualweb.net/java/tipos-datos-primitivos-java/
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
         * Existen 2 tipos de casteos los cuales son los siguientes:
         * 
         * Implicito: Ocurre cuando se asina un valor de un tipo de dato mas pequenio a un tipo de damos mas grande. Este tipo de casting se realiza AUTOMATICAMENTE.
         * Explicito: Ocurre cuando se asigna un valor de un tipo de dato mas grande a uno mas pequenio. Este tipo de casting debe ser especificado EXPLICITAMENTE.
         * 
         * PREGUNTA: ¿A que se refiere cuando se dice "tipo de dato mas pequenio" o "tipo de dato mas grande"?
         * RESPUESTA: Se refiere al tamanio que ocupa la variable en memoria. 
         * Esto puede verse en la tabla que se encuentra en el siguiente link: https://www.abrirllave.com/java/tipos-de-datos-primitivos.php         * 
         */
        
        // EJEMPLO 1 CASO IMPLICITO
        
        // EJEMPLO 2 CASO IMPLICITO
        
        // EJEMPLO 3 CASO EXPLICITO
        
        // EJEMPLO 4 CASO EXPLICITO
        
        /**
         * Un tipo de dato que NO es primitivo pero que se utiliza comunmente al programar es el String.
         */
    }
    
}
