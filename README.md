# Java

Repositorio personal de **notas, ejemplos y referencias prácticas en [Java](https://www.java.com/)**.

El objetivo principal de este repositorio es servir como:
- **Referencia rápida** para repasar conceptos del lenguaje.
- **Apoyo para resolver dudas** sobre sintaxis, POO y colecciones.
- **Recordatorio práctico** de patrones, modificadores y buenas prácticas de Java.

No pretende ser un curso completo ni una guía oficial, sino un conjunto de apuntes organizados que pueden resultar útiles tanto para mí como para cualquier persona que esté iniciando o reforzando conocimientos en Java.

## Tecnologías y Versiones

| Tecnología    | Versión | Descripción                                        |
|---------------|---------|----------------------------------------------------|
| Java          | 21      | Lenguaje principal del proyecto                    |
| JDK           | 21      | Kit de desarrollo (compilador `javac` + JVM + JRE) |

## Arquitectura

Este repositorio sigue una estructura de **archivos independientes por tema**, sin framework ni arquitectura de aplicación formal.

- Cada archivo `.java` es una **unidad temática autocontenida**.
- Los paquetes (carpetas) agrupan clases relacionadas que se usan como apoyo para demostrar conceptos como **herencia**, **encapsulamiento** y **polimorfismo**.
- Se aplica el paradigma de **Programación Orientada a Objetos (POO)** a lo largo de los temas.

## Estructura del Proyecto

```
notas-java/
│
└── src/
    ├── Main.java                     # Fundamentos: variables, operadores, control de flujo, ciclos, arreglos, POO
    ├── Avanzado.java                 # Temas avanzados: colecciones, excepciones, lambdas, clases abstractas
    ├── ITraductor.java               # Interfaces y polimorfismo
    │
    ├── animales/
    │   ├── Animal.java               # Clase base — herencia, protected, polimorfismo
    │   ├── Perro.java                # Clase hija — extends, @Override
    │   └── Gato.java                 # Clase hija — extends, @Override
    │
    ├── aritmetica/
    │   └── Aritmetica.java           # Encapsulamiento — private, getters, setters, constructores
    │
    └── excepciones/
        └── Excepciones.java          # Manejo de excepciones — throw, RuntimeException
```

## Temario

1. **Fundamentos** (`Main.java`)
   - Variables y tipos de datos: primitivos (`int`, `float`, `char`, `boolean`) y de referencia (`String`, `Arrays`, `Objects`)
   - Operadores: aritméticos, unarios, asignación, comparación, lógicos y precedencia
   - Estructuras de control: `if/else`, operador ternario, `switch` (clásico y expresión Java 12+)
   - Ciclos: `while`, `do-while`, `for`, `break`, `continue`
   - Arreglos y matrices
   - Funciones: modificadores de acceso, `static`, `void`, recursividad
   - Clases y objetos: constructores, `this`, sobrecarga, `package-private` vs `public`
   - Encapsulamiento, herencia, sobrescritura (`@Override`), polimorfismo
   - Clase `Object`: `toString()`, `equals()`, `hashCode()`
   - Contexto estático vs dinámico

2. **Temas Avanzados** (`Avanzado.java`)
   - Argumentos variables (`varargs`)
   - Clases abstractas (`abstract`)
   - Interfaces (`interface`, `default`, `implements`)
   - Excepciones: `try`, `catch`, `finally`, `throw`
   - Colecciones: `List<T>` (`ArrayList`), `Set<T>` (`TreeSet`), `Map<K,V>` (`HashMap`)
   - Funciones lambda y métodos de referencia (`::`)

3. **Interfaces** (`ITraductor.java`)
   - Definición de interfaz como contrato
   - Métodos abstractos y métodos `default`
   - Implementación con `implements`

4. **Paquete `animales`** (Herencia y Polimorfismo)
   - Clase base `Animal` con métodos `protected` y `public`
   - Clases hijas `Perro` y `Gato` con sobrescritura
   - Uso de polimorfismo: `Animal animal = new Perro()`

5. **Paquete `aritmetica`** (Encapsulamiento)
   - Atributos `private` con getters y setters
   - Sobrecarga de constructores

6. **Paquete `excepciones`** (Manejo de errores)
   - Lanzar excepciones con `throw new RuntimeException(...)`

## Notas

- Ideal para consulta rápida más que para lectura lineal.
- Los paquetes `animales`, `aritmetica` y `excepciones` son usados desde `Main.java` y `Avanzado.java` mediante `import`.
