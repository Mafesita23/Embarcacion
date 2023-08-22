package Parqueadero;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Parqueadero con 5 filas, 10 columnas y tarifa de $5 por hora
        Parqueadero parqueadero = new Parqueadero(5, 10, 5.0);

        // Crear objetos Carro
        Carro carro1 = new Carro("AWS233", "Renault", "Alpine");
        Carro carro2 = new Carro("DSS436", "BMW", "Mini");
        Carro carro3 = new Carro("DKS789", "Ford", "Ford");

        // Estacionar carros en el parqueadero
        if (parqueadero.parquearCarro(carro1, 1, 4)) {
            System.out.println("Carro 1 estacionado exitosamente en fila 1, columna 4.");
        } else {
            System.out.println("No se pudo estacionar Carro 1.");
        }

        if (parqueadero.parquearCarro(carro2, 2, 5)) {
            System.out.println("Carro 2 estacionado exitosamente en fila 2, columna 5.");
        } else {
            System.out.println("No se pudo estacionar Carro 2.");
        }

        if (parqueadero.parquearCarro(carro3, 1, 4)) {
            System.out.println("Carro 3 estacionado exitosamente en fila 1, columna 4.");
        } else {
            System.out.println("No se pudo estacionar Carro 3.");
        }

        // Calcular y mostrar el costo por tiempo de estacionamiento
        int horasEstacionado = 3;
        double costoCarro1 = parqueadero.cobrarPorTiempo(carro1, horasEstacionado);
        System.out.println("Costo por " + horasEstacionado + " horas para Carro 1: $" + costoCarro1);

        // Mostrar estado del parqueadero
        parqueadero.mostrarEstadoParqueadero();
        // Imprimir la placa, marca y modelo de cada carro
        System.out.println("Información de los carros:");
        System.out.println("Carro 1: Placa - " + carro1.getPlaca() + ", Marca - " + carro1.getMarca() + ", Modelo - " + carro1.getModelo());
        System.out.println("Carro 2: Placa - " + carro2.getPlaca() + ", Marca - " + carro2.getMarca() + ", Modelo - " + carro2.getModelo());
        System.out.println("Carro 3: Placa - " + carro3.getPlaca() + ", Marca - " + carro3.getMarca() + ", Modelo - " + carro3.getModelo());
    }
}