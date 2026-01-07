// Interfaz (Contrato)
///////////////////////////////////////////
public interface ITraductor {

    void traducir(); // Métodos publicos y abstractos por defecto

    default void iniciarTraductor() { // Método default
        System.out.println("Iniciando traductor...");
    }
}

class Ingles implements ITraductor { // Implementación de la interfaz
    @Override
    public void traducir() { // Implementación del método traducir()
        System.out.println("Traduciendo a inglés...");
    }
}