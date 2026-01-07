package animales;

public class Gato extends Animal {
    @Override // '@Override' es una anotación que indica que el método 'hacerSonido()' está sobrescribiendo un método de la clase padre 'Animal'
    public void hacerSonido() {
        System.out.println("Maullar");
    }
}