public class Reptil extends Animal {
    private String tipoEscama;
    private String regulacionTemperatura;
    
    public Reptil(String nombre, int edad, double peso, Dieta dieta, String tipoEscama, String regulacionTemperatura)
    {
        super(nombre, edad, peso, dieta);
        this.tipoEscama = tipoEscama;
        this.regulacionTemperatura = regulacionTemperatura;
    }
    
    @Override
    public String toString()
    {
        return "Reptil {Tipo Escama: " + tipoEscama + "Regulacion Temperatura: " + regulacionTemperatura + "}";
    }
}
