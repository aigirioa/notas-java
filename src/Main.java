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

import animales.Animal; // Importar la clase Animal del paquete animales (carpeta animales)
import animales.Gato; // Importar la clase Gato del paquete animales (carpeta animales)
import animales.Perro; // Importar la clase Perro del paquete animales (carpeta animales)
import aritmetica.Aritmetica; // Importar la clase Aritmetica del paquete aritmetica (carpeta aritmetica)

public class Main {
    public static void main(String[] args) {
        ///////////////////////////////////////////
        // Variables
        ///////////////////////////////////////////
        // Convención para definir nombres
        //     Variables: camelCase
        //     Funciones: camelCase
        //     Clases: PascalCase

        // tipo nombre = valor;
        // var nombre = valor; // Tambien se puede usar var como tipo (Java 10+)
        // final tipo NOMBRE_COMPLETO = valor; // Constantes

        // Tipos primitivos
        ///////////////////////////////////////////
        // Memoria RAM (Stack/Pila) sobreescribe el valor
            // int entero = 10;         // Enteros (byte, short, int, long)
            // float decimal = 3.14F;   // Decimales (float, double)
            // char caracter = 'A';     // Caracter unicode
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
        // for (int num = 1; num <= 10; num++) {
        //     if (num % 2 == 0) {
        //         System.out.println(num);
        //     }
        // }

        // Break y Continue
        ///////////////////////////////////////////
        // for (inicializacion; condicion; actualizacion) {
        //     if (condicion) {
        //         continue; // Ejecuta la siguiente iteración sin ejecutar las líneas siguientes
        //     }
        //     break; // Finaliza la iteración
        // }

        ///////////////////////////////////////////
        // Arreglos (Array)
        ///////////////////////////////////////////
        // Todo arreglo debe tener un tamaño fijo desde el inicio
        // tipoDato[] nombreArreglo = new tipoDato[tamaño];

        // int[] enteros; // Declarar un arreglo
        // enteros = new int[3]; // Inicializar un arreglo de 3 posiciones

        // enteros[0] = 13; // Modificar un valor del arreglo
        // enteros[2] = 62;

        // System.out.println("Valor 1: " + enteros[0]); // Mostrar un valor del arreglo
        // System.out.println("Valor 3: " + enteros[2]);

        // int[] numeros = {100, 200, 300, 400, 500}; // Asignar valores a un arreglo

        // for (int i = 0; i < numeros.length; i++) { // Recorrer un arreglo
        //     System.out.println(numeros[i]);
        // }

        ///////////////////////////////////////////
        // Matrices
        ///////////////////////////////////////////
        // Arreglos de 2 dimensiones
        // Toda matriz debe tener un tamaño fijo desde el inicio
        // Primero son filas y despues columnas
        // tipoDato[][] nombreMatriz = new tipoDato[filas][columnas];

        // int[][] matriz; // Declarar una matriz
        // matriz = new int[2][3]; // Inicializar una matriz de 2x3

        // matriz[0][0] = 100; // Modificar un valor de la matriz
        // matriz[1][2] = 600;

        // System.out.println("Valor fila 1, columna 1: " + matriz[0][0]); // Mostrar un valor de la matriz
        // System.out.println("Valor fila 2, columna 3: " + matriz[1][2]);

        // int[][] matrizNumeros = { // Asignar valores a una matriz
        //     {10, 20, 30},
        //     {40, 50, 60}
        // };

        // for (int i = 0; i < matrizNumeros.length; i++) { // Recorrer una matriz, filas
        //     for (int j = 0; j < matrizNumeros[i].length; j++) { // Columnas
        //         System.out.println("Valor fila " + (i + 1) + ", columna " + (j + 1) + ": " + matrizNumeros[i][j]);
        //     }
        // }

        ///////////////////////////////////////////
        // Funciones
        ///////////////////////////////////////////
        // Entrada ----> Instrucciones ----> Salida

        // Modificadores de acceso
        ///////////////////////////////////////////
        // public = publico, puede ser accedido desde cualquier parte del programa
        // protected = protegido, puede ser accedido desde el mismo paquete (carpeta) y sus clases hijas (herencia)
        // default = sin modificador (package-private) puede ser accedido solo desde el mismo paquete (carpeta)
        // private = privado, solo puede ser accedido desde la misma clase

        // Modificadores de función
        ///////////////////////////////////////////
        // static = estatico, pertenece a la clase (contexto estático, Clase.metodo() o Clase.atributo) y no al objeto (instancia)
        // final = final, no puede modificar (variables), sobrescribir (métodos) o heredar (clases), es una constante

        // Tipo de retorno
        ///////////////////////////////////////////
        // void = vacio, no retorna ningun valor

        // modificadorAcceso tipoRetorno nombreFuncion(tipoParametro parametro) {
        //     instrucciones
        // }

        // funcionSaludar("Hola desde una función en Java");

        // Funciones recursivas
        ///////////////////////////////////////////
        // Una función que se llama a sí misma

        // funcionRecursiva(5);

        ///////////////////////////////////////////
        // Clases y objetos
        ///////////////////////////////////////////
        // Una clase es una plantilla o molde que define las propiedades (atributos) y comportamientos (métodos/funciones) de un objeto
        // Un objeto es una instancia de una clase

        // class NombreClase {
        //     TipoDato nombreAtributo; // Propiedades

        //     tipoRetorno nombreFuncion(tipoParametro parametro) { // Comportamientos
        //         instrucciones
        //     }
        // }

        // Clase package-private
        ///////////////////////////////////////////
        // Persona persona1 = new Persona("Alex", "Alzate"); // Crear un objeto de la clase Persona (instancia)
        // persona1.mostrarPersona();

        // Persona persona2 = new Persona(); // Crear otro objeto de la clase Persona usando el constructor por defecto
        // persona2.nombre = "Layla";
        // persona2.apellido = "Acosta";
        // persona2.mostrarPersona();

        // Clase pública
        ///////////////////////////////////////////
        // Aritmetica aritmetica1 = new Aritmetica(5, 7);
        // aritmetica1.sumar();
        // aritmetica1.restar();

        ///////////////////////////////////////////
        // Encapsulamiento
        ///////////////////////////////////////////
        // Aritmetica aritmetica2 = new Aritmetica(5, 7);
        // aritmetica2.setOperador1(10); // Modificar el valor del operador1 usando el método setter
        // System.out.println("Valor operador 1: " + aritmetica2.getOperador1()); // Obtener el valor del operador1 usando el método getter
        // aritmetica2.sumar();

        ///////////////////////////////////////////
        // Herencia
        ///////////////////////////////////////////
        // Animal animal1 = new Animal();
        // animal1.comer(); // ERROR, 'comer()' es un método protegido, solo puede ser accedido desde el mismo paquete (carpeta) 'animales' y sus clases hijas
        // animal1.dormir();

        // Perro perro1 = new Perro();
        // perro1.comer(); // ERROR, 'comer()' es un método protegido, solo puede ser accedido desde el mismo paquete (carpeta) 'animales' y sus clases hijas
        // perro1.probarComer(); // 'probarComer()' es un método público de la clase 'Perro' que llama al método protegido 'comer()' de la clase 'Animal'
        // perro1.dormir();
        // perro1.hacerSonido();

        ///////////////////////////////////////////
        // Sobrecarga de métodos (Override)
        ///////////////////////////////////////////
        // Perro perro2 = new Perro();
        // perro2.comer(); // El método 'comer()' de la clase 'Perro' sobrescribe el método 'comer()' de la clase 'Animal'

        ///////////////////////////////////////////
        // Polimorfismo
        ///////////////////////////////////////////
        // Animal animal2 = new Animal();
        // imprimirSonido(animal2);

        // Perro perro3 = new Perro();
        // imprimirSonido(perro3);

        // Gato gato1 = new Gato();
        // imprimirSonido(gato1);

        ///////////////////////////////////////////
        // Clase Object
        ///////////////////////////////////////////
        // Todas las clases en Java heredan de la clase 'Object' de manera implícita, lo que significa que todas las clases tienen acceso a los métodos de la clase 'Object' como:
        //     'toString()'
        //     'equals()'
        //     'hashCode()'
        //     ...

        // Persona persona3 = new Persona("Laura", "Gomez");
        // System.out.println(persona3); // 'toString()' se llama automáticamente y es un método heredado de la clase 'Object', se puede sobrescribir para personalizarlo

        ///////////////////////////////////////////
        // Contexto estático y dinámico
        ///////////////////////////////////////////
        // Las clases son el contexto estático
        // Los objetos son el contexto dinámico
        // El contexto dinámico puede acceder al contexto estático (mala práctica), pero el contexto estático no puede acceder al contexto dinámico

        // System.out.println("Contador de personas: " + Persona.contadorPersonas); // Contexto estático, accede a través de 'Persona' al atributo estático
        // Persona p1 = new Persona();
        // System.out.println("Contador de personas: " + Persona.getContadorPersonasPrivado()); // Contexto estático, accede a través de 'Persona' al método estático
    }

    static void funcionSaludar(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }

    static void funcionRecursiva(int num) {
        if (num == 1) { // Caso base para evitar una recursión infinita
            System.out.print(num + " ");
        } else { // Caso recursivo
            funcionRecursiva(num - 1); // Llamada recursiva con un valor modificado
            System.out.print(num + " ");
        }
    }

    static void imprimirSonido(Animal animal) { // Método polimórfico, puede recibir un objeto de la clase 'Animal' o de sus clases hijas 'Perro' y 'Gato'
        animal.hacerSonido(); // El método 'hacerSonido()' se comportará de manera diferente dependiendo del tipo de objeto que se le pase (Animal, Perro o Gato)
    }
}

// Clase Persona
///////////////////////////////////////////
// Solo puede haber una clase pública por archivo y el nombre del archivo debe coincidir con el nombre de la clase pública
// Esto facilita al compilador encontrar la clase y evita ambigüedad

// Las clases sin 'public' (package-private) solo pueden ser accedidas desde el mismo paquete (carpeta)
class Persona {
    static int contadorPersonas = 0; // Atributo estático (contexto estático), pertenece a la clase y es compartido por todas las instancias de la clase
    private static int contadorPersonasPrivado = 0; // Atributo estático privado, solo puede ser accedido desde la clase 'Persona'
    String nombre;
    String apellido;

    public Persona() { // Constructor por defecto (vacío)
        System.out.println("Constructor por defecto de Persona");

        Persona.contadorPersonas++; // Incrementa el contador de personas (contexto estático) cada vez que se crea un nuevo objeto de la clase 'Persona'
        Persona.contadorPersonasPrivado++;
    }

    public Persona(String param1, String apellido) { // Sobrecarga de constructores (constructor con parámetros)
        System.out.println("Constructor con parámetros de Persona");

        nombre = param1; // Nombres diferentes para evitar confusión entre el atributo y el parámetro
        this.apellido = apellido; // 'this' se refiere al objeto actual, permite acceder a los atributos y métodos de la clase

        Persona.contadorPersonas++;
        Persona.contadorPersonasPrivado++;
    }

    @Override // '@Override' es una anotación que indica que el método 'toString()' está sobrescribiendo un método de la clase padre 'Object'
    public String toString() {
        return "Nombre: " + this.nombre + ", Apellido: " + this.apellido + ", Dir. memoria: " + super.toString(); // Sobrescribe el método 'toString()' de la clase 'Object'
    }

    void mostrarPersona() { // 'default' modificador de acceso por defecto (package-private), solo puede ser accedido desde el mismo paquete (carpeta)
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    public static int getContadorPersonasPrivado() { // Método estático para obtener el valor del contador de personas privado
        return Persona.contadorPersonasPrivado;
    }
}