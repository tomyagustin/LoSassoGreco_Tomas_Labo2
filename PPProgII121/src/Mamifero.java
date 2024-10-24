public class Mamifero extends Animal
{
    public Mamifero(String nombre, int edad, double peso, Dieta dieta) 
    {
        super(nombre, edad, peso, dieta);
    }
    
    public void vacunar(){
        System.out.println("Vacunado Mamifero: " + nombre);
    }
    
    @Override
    public String toString()
    {
        return "Mamifero {Nombre: " + nombre + ", Edad: " + edad + ", Peso: " + peso  + ", Dieta: " + dieta + "}";
    }
    
    
}

