package Embarcacion;

public class Main {
    public static void main(String[] args) {
        // Crear capitanes
        Capitan capitan1 = new Capitan("Julian", "Mora", "AWZ134");
        Capitan capitan2 = new Capitan("María", "Mora", "ABD326");

        // Crear veleros y mostrar información
        Velero velero1 = new Velero(capitan1, 1500, 2022, 12.5, 5);
        System.out.println("Monto de alquiler del velero: $" + velero1.calcularMontoAlquiler());
        System.out.println("¿El velero es grande? " + (velero1.esGrande() ? "Sí" : "No"));
        System.out.println("Capitán del velero: " + capitan1.getNombre() + " " + capitan1.getApellido() + ", Matrícula: " + capitan1.getMatriculaNavegacion());

        // Crear yates y mostrar información
        Yate yate1 = new Yate(capitan2, 2500, 2023, 18.7, 10);
        System.out.println("Monto de alquiler del yate: $" + yate1.calcularMontoAlquiler());
        System.out.println("¿El yate se puede comprar? " + (yate1.puedeComprar() ? "Sí" : "No"));
        System.out.println("Capitán del yate: " + capitan2.getNombre() + " " + capitan2.getApellido() + ", Matrícula: " + capitan2.getMatriculaNavegacion());
    }
}



