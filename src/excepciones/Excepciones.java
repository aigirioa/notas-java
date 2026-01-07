package excepciones;

public class Excepciones {
    public static float division(int numerador, int denominador) {
        if (denominador == 0) {
            throw new RuntimeException("No se puede dividir por cero"); // Lanzar una excepción en tiempo de ejecución
        }

        return numerador / denominador;
    }
}