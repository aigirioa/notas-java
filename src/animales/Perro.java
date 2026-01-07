package animales;

public class Perro extends Animal { // 'extends' = extiende (herencia), 'Perro' es una clase hija de 'Animal'
    public void probarComer(){
        this.comer(); // 'this' se refiere a la clase actual, pero 'Perro' hereda de 'Animal' y puede acceder a los métodos de 'Animal'
    }

    @Override // '@Override' es una anotación que indica que el método 'hacerSonido()' está sobrescribiendo un método de la clase padre 'Animal'
    public void hacerSonido () {
        System.out.println("Ladrar");
    }

    @Override
    public void comer () { // Sobrescribe el método 'comer()' de la clase 'Animal'
        System.out.println("Perro comiendo");

        super.comer(); // 'super' se refiere a la clase padre y permite llamar al método 'comer()' de la clase 'Animal' desde la clase 'Perro'
    }
}