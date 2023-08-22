package Parqueadero;

class Parqueadero {
    private Carro[][] espacios;
    private double tarifaPorHora;

    public Parqueadero(int filas, int columnas, double tarifaPorHora) {
        espacios = new Carro[filas + 1][columnas + 1]; // Agregamos 1 para tener índices desde 1
        this.tarifaPorHora = tarifaPorHora;
    }

    public boolean parquearCarro(Carro carro, int fila, int columna) {
        if (fila < 0 || fila >= espacios.length || columna < 0 || columna >= espacios[0].length) {
            return false; // Límites de matriz excedidos
        }

        if (espacios[fila][columna] == null) {
            espacios[fila][columna] = carro;
            return true;
        } else {
            return false; // Espacio ocupado
        }
    }

    public double cobrarPorTiempo(Carro carro, int horas) {
        return horas * tarifaPorHora;
    }

    public void mostrarEstadoParqueadero() {
        System.out.println("Estado actual del parqueadero:");
        for (int fila = 1; fila < espacios.length; fila++) {
            for (int columna = 1; columna < espacios[0].length; columna++) {
                if (espacios[fila][columna] == null) {
                    System.out.print(" [ ] ");
                } else {
                    System.out.print(" [X] ");
                }
            }
            System.out.println();
        }
    }
}
