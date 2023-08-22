package Embarcacion;

// Subclase que representa un Embarcacion.Velero
class Velero extends Embarcacion {
    private int cantidadMastiles;

    // Constructor para crear un Embarcacion.Velero con atributos específicos
    public Velero(Capitan capitan, double precioBase, int anioFabricacion, double eslora, int cantidadMastiles) {
        super(capitan, precioBase, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    // Método para calcular el monto de alquiler de un Embarcacion.Velero
    @Override
    public double calcularMontoAlquiler() {
        double montoAlquiler = precioBase;
        if (anioFabricacion > 2020) {
            montoAlquiler += 20000;
        }
        return montoAlquiler;
    }

    // Método para determinar si un Embarcacion.Velero es grande
    public boolean esGrande() {
        return cantidadMastiles > 4;
    }
}