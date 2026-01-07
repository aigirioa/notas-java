import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import excepciones.Excepciones;

public class Avanzado {
    public static void main(String[] args) {
        ///////////////////////////////////////////
        // Argumentos variables (Varargs)
        ///////////////////////////////////////////
        imprimirNumeros(1, 2, 3, 4, 5);

        ///////////////////////////////////////////
        // Clases abstractas
        ///////////////////////////////////////////
        FiguraGeometrica figura = new Rectangulo(); // Polimorfismo
        figura.dibujar(); // Llamada al método dibujar() de la clase Rectangulo

        ///////////////////////////////////////////
        // Interfaces
        ///////////////////////////////////////////
        ITraductor ingles = new Ingles(); // Interfaz y polimorfismo
        ingles.iniciarTraductor(); // Llamada al método iniciarTraductor() de la interfaz
        ingles.traducir(); // Llamada al método traducir() de la clase Ingles

        ///////////////////////////////////////////
        // JavaBean
        ///////////////////////////////////////////
        // Clase que sigue ciertas convenciones/características (constructor vacío, atributos privados, getters/setters y implementación de Serializable opcional)

        ///////////////////////////////////////////
        // Excepciones
        ///////////////////////////////////////////
        int valor1 = 10, valor2 = 0;

        try {
            float resultado = Excepciones.division(valor1, valor2); // Llamada al método division() de la clase Excepciones
            System.out.println("Resultado: " + resultado);

        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e);

        } finally {
            System.out.println("Bloque finally: Se ejecuta siempre, haya o no excepción");
        }

        ///////////////////////////////////////////
        // Listas
        ///////////////////////////////////////////
        List miLista = new ArrayList(); // Lista sin genérico (raw type) los elementos se manejan como Object
        miLista.add("Elemento 1");
        miLista.add("Elemento 2");

        for (Object elemento : miLista) { // Ciclo forEach
            System.out.println(elemento);
        }

        List<String> miListaGenerica = new ArrayList<>(); // Lista con genérico (tipo String)
        miListaGenerica.add("String 1");
        miListaGenerica.add("String 2");

        for (String elemento : miListaGenerica) { // Ciclo forEach
            System.out.println(elemento);
        }

        // Funcion lambda
        ///////////////////////////////////////////
        miListaGenerica.forEach(elemento -> {
            System.out.println("Elemento: " + elemento);
        });

        miListaGenerica.forEach(System.out::println); // Método de referencia

        List<Integer> miListaGenerica2 = Arrays.asList(1, 2, 3); // Crear una lista con elementos
        miListaGenerica2.forEach(System.out::println);

        ///////////////////////////////////////////
        // Sets
        ///////////////////////////////////////////
        Set<String> conjunto = new TreeSet<>(); // 'TreeSet' conjunto ordenado
        conjunto.add("Set 1");
        conjunto.add("Set 1"); // No se permiten elementos duplicados
        conjunto.add("Set 2");
        conjunto.add("Set 3");

        conjunto.forEach(System.out::println); // Método de referencia

        ///////////////////////////////////////////
        // Mapas (Diccionarios)
        ///////////////////////////////////////////
        Map<String, String> persona = new HashMap<>(); // Mapa (clave - valor)
        persona.put("nombre", "Juan");
        persona.put("apellido", "Pérez");
        persona.put("edad", "30");

        persona.forEach((clave, valor) -> { // Función lambda
            System.out.println(clave + ": " + valor);
        });

        persona.entrySet().forEach(System.out::println); // 'entrySet' devuelve un conjunto (set) de los elementos del mapa (clave = valor) SIN convertir el mapa a un conjunto
    }

    static void imprimirNumeros(int... numeros) { // 'varargs' argumentos variables
        for (int numero : numeros) { // Ciclo forEach
            System.out.print(numero + " ");
        }
    }
}

// Clase abstracta
///////////////////////////////////////////
abstract class FiguraGeometrica { // No se puede instanciar un objeto de una clase abstracta
    public abstract void dibujar(); // Método abstracto
}

class Rectangulo extends FiguraGeometrica { // Herencia
    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo");
    }
}