public abstract class Animal implements ISerVivo {
    private String nutricion, sexo;
    private int edad, cantPatas;
    
    public Animal(String nutricion, String sexo, int edad, int cantPatas){
        this.nutricion = nutricion;
        this.sexo = sexo;
        this.edad = edad;
        this.cantPatas = cantPatas;
    }

    public int getCantPatas() {
        return cantPatas;
    }
    public int getEdad() {
        return edad;
    }
    public String getNutricion() {
        return nutricion;
    }
    public String getSexo() {
        return sexo;
    }

}
