package aritmetica;

public class Aritmetica {
    private int operador1; // 'private' modificador de acceso, encapsulamiento
    private int operador2;

    public Aritmetica() { // Constructor por defecto (vacío)
        System.out.println("Constructor por defecto de Aritmetica");
    }

    public Aritmetica(int operador1, int operador2) {
        System.out.println("Constructor con parámetros de Aritmetica");

        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    public void sumar() {
        int resultado = this.operador1 + this.operador2;
        System.out.println("resultado suma: " + resultado);
    }

    public void restar() {
        int resultado = this.operador1 - this.operador2;
        System.out.println("resultado resta: " + resultado);
    }

    ///////////////////////////////////////////
    // Encapsulamiento
    ///////////////////////////////////////////
    // Métodos getter y setter para operador1 y operador2

    public int getOperador1() {
        return this.operador1;
    }

    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }

    public int getOperador2() {
        return this.operador2;
    }

    public void setOperador2(int operador2) {
        this.operador2 = operador2;
    }
}