package modelo;

import java.util.ArrayList;
import java.util.List;


public class Consulta {

    private int id;
    private Mascota mascota;
    private Veterinario veterinario; // ASOCIACIÓN: el veterinario que la realiza
    private String fecha;
    private String motivo;
    private List<Medicamento> medicamentos;

    public Consulta(int id, Mascota mascota, Veterinario veterinario, String fecha, String motivo) {
        this.id = id;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.fecha = fecha;
        this.motivo = motivo;
        this.medicamentos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    /**
     * Agrega un medicamento recetado dentro de esta consulta.
     * El medicamento nace y "vive" dentro de la consulta (composición).
     */
    public void agregarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }
}
