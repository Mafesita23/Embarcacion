package Embarcacion;

// Subclase que representa un Embarcacion.Yate
class Yate extends Embarcacion {
    private int cantidadCamarotes;

    // Constructor para crear un Embarcacion.Yate con atributos específicos
    public Yate(Capitan capitan, double precioBase, int anioFabricacion, double eslora, int cantidadCamarotes) {
        super(capitan, precioBase, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    // Método para calcular el monto de alquiler de un Embarcacion.Yate
    @Override
    public double calcularMontoAlquiler() {
        double montoAlquiler = precioBase;
        if (anioFabricacion > 2020) {
            montoAlquiler += 20000;
        }
        return montoAlquiler;
    }

    // Método para determinar si un Embarcacion.Yate se puede comprar
    public boolean puedeComprar() {
        return cantidadCamarotes > 7;
    }
}