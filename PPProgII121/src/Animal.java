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
    
    public abstract String toString(); // Este metodo lo van a usar los hijos
    
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
}
