public class Tortuga extends Animal{

    private String habitat;

    public Tortuga(String nutricion, String sexo, int edad, int cantPatas, String habitat){
        super(nutricion, sexo, edad, cantPatas);
        this.habitat = habitat;
    }


    @Override
    public void respirar() {
        
    }

    @Override
    public void comer() {
        
    }

    @Override
    public void hacerRuido() {
        System.out.println("Inserte ruido tortuga"); 
        
    }

    @Override
    public void andar() {
        
    }
}
