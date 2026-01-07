// Java
// Página web https://www.oracle.com/co/java/technologies/downloads/

///////////////////////////////////////////
// Definiciones
///////////////////////////////////////////
// JDK -> Java Development Kit - Kit de Desarrollo de Java
    // Compilador de Java (javac) convierte a bytecode (.class) que es ejecutado por la JVM
    // JRE -> Java Runtime Environment - Entorno de Ejecución de Java
        // JVM -> Java Virtual Machine - Máquina Virtual de Java
    // Herramientas de desarrollo: jdb (Java Debugger - depurador), jar (Java Archive - empaquetador)

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo con Java");

        ///////////////////////////////////////////
        // Variables
        ///////////////////////////////////////////
        // Camel Case
        // tipo nombre = valor;
        // var nombre = valor; // Tambien se puede usar var como tipo (Java 10+)
        // final tipo NOMBRE_COMPLETO = valor; // Constantes

        // Tipos primitivos
        ///////////////////////////////////////////
        // Memoria RAM (Stack/Pila) sobreescribe el valor
            // int entero = 10; // Enteros (byte, short, int, long)
            // float decimal = 3.14F; // Decimales (float, double)
            // char caracter = 'A'; // Caracter unicode
            // boolean booleano = true; // Booleano (true, false)

        // Tipos de referencia (Objetos)
        ///////////////////////////////////////////
        // Memoria RAM (Heap) crea un nuevo valor
            // Cadenas de texto (String)
            // Numeros enteros (Integer, Long)
            // Arreglos (int[], String[])
            // Objectos de clases (instancias definidas por el usuario)

        // Manejo de cadenas
        ///////////////////////////////////////////

        // Entrada de datos por consola
        ///////////////////////////////////////////

        ///////////////////////////////////////////
        // Operadores
        ///////////////////////////////////////////

        // Aritmeticos
        ///////////////////////////////////////////
        // + // Suma
        // - // Resta
        // * // Multiplicacion
        // / // Division
        // % // Modulo

        // Unarios
        ///////////////////////////////////////////
        // Pre-incremento: primero incrementa y luego usa el valor
        // Post-incremento: primero usa el valor y luego incrementa

        // + // Positivo
        // - // Negativo
        // ++ // Incremento en 1 (pre-incremento/post-incremento)
        // -- // Decremento en 1 (pre-decremento/post-decremento)

        // Asignacion
        ///////////////////////////////////////////
        // = // Asignacion simple
        // int a = 1, b = 2, c = 3; // Asignacion multiple
        // += // Asignacion con suma
        // -= // Asignacion con resta
        // *= // Asignacion con multiplicacion
        // /= // Asignacion con division
        // %= // Asignacion con modulo

        // Comparacion
        ///////////////////////////////////////////
        // == // Igualdad
        // != // Desigualdad
        // > // Mayor que
        // < // Menor que
        // >= // Mayor o igual que
        // <= // Menor o igual que

        // Logicos
        ///////////////////////////////////////////
        // && // AND
        // || // OR
        // ! // NOT

        // Precedencia de operadores
        ///////////////////////////////////////////
        // Parentesis () y corchetes []
        // Operadores unarios ++, --, +, -
        // Operadores aritmeticos *, /, %
        // Operadores aritmeticos +, -
        // Operadores de comparacion <, >, <=, >=
        // Operadores de igualdad ==, !=
        // Operadores logicos &&, ||
        // Operadores de asignacion =, +=, -=, *=, /=, %=

        ///////////////////////////////////////////
        // Estructuras de control
        ///////////////////////////////////////////

        // If else
        ///////////////////////////////////////////
        // int edad = 20;

        // if (edad >= 18) {
        //     System.out.println("Mayor de edad");
        // } else if (edad >= 0 && edad < 18) {
        //     System.out.println("Menor de edad");
        // }  else {
        //     System.out.println("Edad invalida");
        // }

        // Operador ternario
        ///////////////////////////////////////////
        // (condicion) ? valorSiVerdadero : valorSiFalso;

        // int numero = 4;
        // String resultado = (numero % 2 == 0) ? "Par" : "Impar";
        // System.out.println(resultado);

        // Operador ternario anidado
        ///////////////////////////////////////////
        // int numero = 0;
        // String resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Cero";
        // System.out.println(resultado);

        // Switch
        ///////////////////////////////////////////
        // int dia = 5;

        // switch (dia) {
        //     case 1:
        //         System.out.println("Lunes");
        //         break;
        //     case 2:
        //         System.out.println("Martes");
        //         break;
        //     case 3:
        //         System.out.println("Miercoles");
        //         break;
        //     case 4:
        //         System.out.println("Jueves");
        //         break;
        //     case 5:
        //         System.out.println("Viernes");
        //         break;
        //     case 6:
        //         System.out.println("Sabado");
        //         break;
        //     case 7:
        //         System.out.println("Domingo");
        //         break;
        //     default:
        //         System.out.println("Dia invalido");
        //         break;
        // }

        // String diaSemana = switch (dia) { // (Java 12+)
        //     case 1 -> "Lunes";
        //     case 2 -> "Martes";
        //     case 3 -> "Miercoles";
        //     case 4 -> "Jueves";
        //     case 5 -> "Viernes";
        //     case 6 -> "Sabado";
        //     case 7 -> "Domingo";
        //     default -> {
        //         yield "Dia invalido"; // 'yield' = retornar un valor para expresiones switch
        //     }
        // };
        // System.out.println(diaSemana);

        ///////////////////////////////////////////
        // Ciclos o bucles
        ///////////////////////////////////////////

        // While
        ///////////////////////////////////////////
        // int contador = 1;

        // while (contador <= 5) {
        //     System.out.println(contador++);
        // }

        // Do while
        ///////////////////////////////////////////
        // int num = 4;

        // do {
        //     System.out.println(num++);
        // } while (num <= 3);

        // For
        ///////////////////////////////////////////
        
    }
}