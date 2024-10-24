import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animales;
    
    public Zoologico()
    {
        this.animales = new ArrayList<>();
    }
    
    public void agregarAnimal(Animal animal) throws AnimalYaExisteException // que toma un objeto Animal como parámetro
    {
        if (animales.contains(animal))
        {
            throw new AnimalYaExisteException("El animal con el nombre " + animal.nombre + " y la edad " + animal.edad + " ya existe");
        }
        animales.add(animal);
        System.out.println("Nombre del animal agregado:" + animal.nombre);
    }
    
    public void mostrarAnimales(){ //  imprime en la consola la lista de animales
        if (animales.isEmpty()) // si esta vacio
        {
            System.out.println("no hay animales en el zoologico");
        }
        else
        {
            for (Animal animal: animales)
            {
                System.out.println(animal.toString());
            }
        }
    }
    
    public void vacunarAnimales(){ // recorre la lista de animales y aplica la vacuna segun el tipo de animal
        for (Animal animal : animales)
        {
            if (animal instanceof Mamifero)
            {
               ((Mamifero) animal).vacunar();
            }
            else if (animal instanceof Ave)
            {
                ((Ave) animal).vacunar();
            }
            else{
                System.out.println("El reptil " + animal.nombre + " no se puede vacunar");
            }
        }
    }
    
}
