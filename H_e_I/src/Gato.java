public class Gato extends Animal{

    public Gato(String nutricion, String sexo, int edad, int cantPatas){
        super(nutricion, sexo, edad, cantPatas);
    }

    @Override
    public void respirar() {
       
    }

    @Override
    public void comer() {
        
    }

    @Override
    public void hacerRuido() {
        System.out.println("Miau");        
    }

    @Override
    public void andar() {
        
    }
    
}
