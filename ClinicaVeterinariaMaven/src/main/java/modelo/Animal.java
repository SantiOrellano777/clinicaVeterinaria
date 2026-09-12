package modelo;

/**
 * Clase base que representa a cualquier animal registrado en la clínica.
 * Es abstracta porque en el sistema nunca se registra un "Animal" genérico,
 * siempre se registra un tipo concreto (por ahora, Mascota).
 *
 * No contiene ningún System.out.println: el modelo nunca imprime nada,
 * solo guarda datos y los entrega a quien los pida.
 */
public abstract class Animal {

    // Atributos comunes a todo animal registrado en la clínica.
    protected int id;
    private String nombre;
    protected String especie;
    String fechaRegistro; // visibilidad default (paquete): solo visible dentro de "modelo"

    public Animal(int id, String nombre, String especie, String fechaRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.fechaRegistro = fechaRegistro;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * Comportamiento común a todo animal. Cada subclase decide cómo
     * describirse; esto es lo que obliga la herencia con clase abstracta.
     */
    public abstract String describir();
}
