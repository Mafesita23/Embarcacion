package Embarcacion;

// Clase abstracta que representa una Embarcación
abstract class Embarcacion implements Alquilable {
    protected Capitan capitan;
    protected double precioBase;
    protected int anioFabricacion;
    protected double eslora;

    // Constructor para crear una Embarcación con sus atributos básicos
    public Embarcacion(Capitan capitan, double precioBase, int anioFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }
}
