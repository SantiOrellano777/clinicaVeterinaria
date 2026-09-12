package modelo;

/**
 * Representa la mascota concreta de un Propietario.
 * Hereda de Animal (relación de HERENCIA).
 */
public class Mascota extends Animal {

    private String raza;
    private double peso;
    private Propietario propietario; // el dueño de esta mascota

    public Mascota(int id, String nombre, String especie, String fechaRegistro,
                   String raza, double peso) {
        super(id, nombre, especie, fechaRegistro);
        this.raza = raza;
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String describir() {
        return nombreCompletoDescripcion();
    }

    private String nombreCompletoDescripcion() {
        return getNombre() + " (" + especie + ", raza " + raza + ", " + peso + " kg)";
    }
}
