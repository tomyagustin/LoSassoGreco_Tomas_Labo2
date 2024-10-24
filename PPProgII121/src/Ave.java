public class Ave extends Animal {
    private double envergaduraAlas;
    
    public Ave(String nombre, int edad, double peso, Dieta dieta, double envergaduraAlas)
    {
        super(nombre, edad, peso, dieta);
        this.envergaduraAlas = envergaduraAlas;
    }
    
    public void vacunar(){ // Printea un mensaje sobre el nombre del animal vacunado
        System.out.println("Vacunando ave: " + nombre);
    }
    
    @Override
    public String toString()
    {
        return "Ave {Envergadura alas: " + envergaduraAlas + "}";
    }
}

