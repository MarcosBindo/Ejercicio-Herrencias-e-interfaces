/*Ejercicio de Herencia e Interfaces:
Clases:
 
SerVivo
Persona
Gato
Perro
Conejo
Tortuga
Carne (comida)
Vegetal (comida)
 
Una persona puede comer tanto carne como vegetales como otros animales.
Comparten todos algunos atributos en común.
Se pueden crear clases como Animal o Mamifero.
Crear dos interfaces que tengan que ver con los metodos compartidos (polimorfismo) 

Metodos a crear: comer, hablar, andar, respirar*/

public class App {
    public static void main(String[] args) throws Exception {
        Persona p1 = new Persona("Marcos", 19, "Comida");
        
        p1.hacerRuido();

    }
}
