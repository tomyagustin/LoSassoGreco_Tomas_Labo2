public class Main {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();

        try {
            Mamifero leon = new Mamifero("Leon", 5, 12.5, Dieta.CARNIVORO);
            Reptil cocodrilo = new Reptil("Cocodrilo", 8, 500, Dieta.CARNIVORO, "queratinosa", "ectotermia");
            Ave aguila = new Ave("Aguila", 3, 6, Dieta.CARNIVORO, 54.7);
            
            zoo.agregarAnimal(leon);
            zoo.agregarAnimal(cocodrilo);
            zoo.agregarAnimal(aguila);

            // Printea los animales en el zoologico
            zoo.mostrarAnimales();

            // Vacunar a los animales
            zoo.vacunarAnimales();

        } catch (AnimalYaExisteException e) 
        {
            System.err.println(e.getMessage());
        }
    }
}

