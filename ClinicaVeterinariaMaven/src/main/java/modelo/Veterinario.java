package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Profesional que atiende mascotas.
 *
 * Relación de ASOCIACIÓN con Consulta: el veterinario conoce las consultas
 * que ha realizado, pero cada una existe de forma independiente como objeto
 * (no nacen ni mueren dentro del veterinario).
 *
 * Relación de DEPENDENCIA con Medicamento: en recetar() el veterinario usa
 * un Medicamento como parámetro, sin guardarlo como atributo propio. Es una
 * dependencia porque solo lo necesita momentáneamente para hacer su trabajo.
 */
public class Veterinario {

    private int id;
    private String nombre;
    private String especialidad;
    private List<Consulta> consultasRealizadas;

    public Veterinario(int id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.consultasRealizadas = new ArrayList<>();
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Consulta> getConsultasRealizadas() {
        return consultasRealizadas;
    }

    /**
     * Asocia una consulta ya existente a este veterinario (asociación).
     */
    public void atenderConsulta(Consulta consulta) {
        consulta.setVeterinario(this);
        consultasRealizadas.add(consulta);
    }

    /**
     * Receta un medicamento dentro de una consulta.
     * Medicamento solo se usa como parámetro (DEPENDENCIA): el veterinario
     * no lo guarda como atributo suyo, solo lo entrega a la consulta.
     */
    public void recetar(Consulta consulta, Medicamento medicamento) {
        consulta.agregarMedicamento(medicamento);
    }
}
