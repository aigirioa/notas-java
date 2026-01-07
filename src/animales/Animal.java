package animales;

public class Animal {
    protected void comer () { // 'protected' modificador de acceso, permite el acceso solo a las clases hijas
        System.out.println("Animal comiendo");
    }

    public void dormir () {
        System.out.println("Animal durmiendo");
    }

    public void hacerSonido () { // Polimorfismo, las clases hijas pueden sobrescribir este método para tener un comportamiento diferente
        System.out.println("Animal haciendo sonido");
    }
}

///////////////////////////////////////////
// Herencia
///////////////////////////////////////////
// IMPORTANTE, no se puede crear un objeto de la clase 'Perro' fuera del paquete (carpeta) 'animales' porque la clase 'Perro' no es pública (package-private)

// class Perro extends Animal { // 'extends' = herencia, 'Perro' es una clase hija de 'Animal'
//     public void hacerSonido () {
//         System.out.println("Ladrar");
//     }
// }