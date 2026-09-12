package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Consulta;
import modelo.Mascota;
import modelo.Medicamento;
import modelo.Propietario;
import modelo.Veterinario;
import vista.VeterinariaVista;


public class ClinicaController {

    private VeterinariaVista vista;

    // Los dos ArrayList de prueba que pide el enunciado, llenados aquí
    // (no en main, no en la vista).
    private List<Propietario> propietarios;
    private List<Consulta> consultas;

    public ClinicaController() {
        this.vista = new VeterinariaVista();
        this.propietarios = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    /**
     * Punto de entrada del flujo de la aplicación. Main solo debe llamar
     * a este método.
     */
    public void iniciar() {
        crearDatosDePrueba();
        vista.mostrarPropietariosConMascotas(propietarios);
        vista.mostrarConsultas(consultas);
        vista.mostrarMedicamentosRecetados(consultas);
    }

    /**
     * Crea y relaciona los objetos de prueba: propietarios con sus
     * mascotas, veterinarios, consultas y medicamentos recetados.
     */
    private void crearDatosDePrueba() {
        // --- Propietarios y sus mascotas (agregación) ---
        Propietario ana = new Propietario(1, "Ana Torres", "300-111-2222");
        Mascota firulais = new Mascota(1, "Firulais", "Perro", "2024-01-10", "Labrador", 22.5);
        Mascota michi = new Mascota(2, "Michi", "Gato", "2023-05-20", "Siamés", 4.2);
        ana.agregarMascota(firulais);
        ana.agregarMascota(michi);

        Propietario carlos = new Propietario(2, "Carlos Ruiz", "300-333-4444");
        Mascota rocky = new Mascota(3, "Rocky", "Perro", "2022-11-02", "Bulldog", 18.0);
        carlos.agregarMascota(rocky);

        propietarios.add(ana);
        propietarios.add(carlos);

        // --- Veterinarios ---
        Veterinario drGomez = new Veterinario(1, "Dr. Luis Gómez", "Medicina general");
        Veterinario draPena = new Veterinario(2, "Dra. Sofía Peña", "Dermatología");

        // --- Consultas (asociación con Veterinario) ---
        Consulta consulta1 = new Consulta(1, firulais, null, "2026-09-01", "Control anual");
        drGomez.atenderConsulta(consulta1);

        Consulta consulta2 = new Consulta(2, rocky, null, "2026-09-05", "Alergia en la piel");
        draPena.atenderConsulta(consulta2);

        consultas.add(consulta1);
        consultas.add(consulta2);

        // --- Medicamentos recetados (composición dentro de Consulta,
        //     usados por Veterinario solo como dependencia en recetar()) ---
        Medicamento antiparasitario = new Medicamento(1, "Antiparasitario X", "1 tableta cada 3 meses");
        Medicamento vitaminas = new Medicamento(2, "Complejo vitamínico", "5 ml diarios por 10 días");
        Medicamento antialergico = new Medicamento(3, "Antialérgico Y", "1 tableta cada 12 horas");

        drGomez.recetar(consulta1, antiparasitario);
        drGomez.recetar(consulta1, vitaminas);
        draPena.recetar(consulta2, antialergico);
    }
}
