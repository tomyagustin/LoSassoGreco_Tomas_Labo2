import java.util.Objects;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected double peso;
    protected Dieta dieta;
    
    public Animal(String nombre, int edad, double peso, Dieta dieta)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.dieta = dieta;
    }
    
    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) // Verifica si se está comparando el mismo objeto.
        {
            return true;
        }
        
        if (obj == null || getClass() != obj.getClass()) 
        {
            return false;
        }
        
        Animal animal = (Animal) obj;
        return edad == animal.edad && nombre.equals(animal.nombre);
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(toString());
    }
}
