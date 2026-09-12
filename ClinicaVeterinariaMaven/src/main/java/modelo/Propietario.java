package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Persona dueña de una o más mascotas.
 *
 * Relación de AGREGACIÓN con Mascota: el Propietario mantiene una lista de
 * mascotas, pero si el Propietario deja de existir, las mascotas podrían
 * seguir existiendo de forma independiente (por eso es agregación y no
 * composición).
 */
public class Propietario {

    private int id;
    private String nombre;
    private String telefono;
    private List<Mascota> mascotas;

    public Propietario(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.mascotas = new ArrayList<>();
    }

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    /**
     * Agrega una mascota a este propietario y, de paso, enlaza la mascota
     * con su dueño (para que la relación sea consultable en ambos sentidos).
     */
    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
        mascota.setPropietario(this);
    }
}
