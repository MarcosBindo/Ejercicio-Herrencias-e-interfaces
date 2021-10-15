
public class Persona implements ISerVivo{
    private String nombre, nutricion;
    private int edad;


    public Persona( String nombre, int edad, String nutricion){
        this.nombre = nombre;
        this.nutricion = nutricion;
        this.edad = edad;
    }

    @Override
    public void respirar() {
        
    }
    @Override
    public void comer() {
        
    }

    @Override
    public void hacerRuido() {
        System.out.println("Hola!");
        
    }

    @Override
    public void andar() {
        
    }
     

}
