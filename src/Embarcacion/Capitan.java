package Embarcacion;

// Clase que representa al Capitán de una embarcación
class Capitan {
    private String nombre;
    private String apellido;
    private String matriculaNavegacion;

    // Constructor para crear un Capitán con nombre, apellido y matrícula
    public Capitan(String nombre, String apellido, String matriculaNavegacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaNavegacion = matriculaNavegacion;
    }

    // Getters para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMatriculaNavegacion() {
        return matriculaNavegacion;
    }
}

// Interfaz para definir la capacidad de calcular el monto de alquiler
interface Alquilable {
    double calcularMontoAlquiler();
}
