package vista;

import java.util.List;
import modelo.Consulta;
import modelo.Mascota;
import modelo.Medicamento;
import modelo.Propietario;

/**
 * Se encarga únicamente de mostrar información por consola.
 *
 * No crea datos, no tiene lógica de negocio y no guarda ArrayList propios:
 * solo recibe listas ya armadas por el controlador y las imprime con
 * System.out.println, con un formato ordenado.
 */
public class VeterinariaVista {

    public void mostrarPropietariosConMascotas(List<Propietario> propietarios) {
        System.out.println("========================================");
        System.out.println("   PROPIETARIOS Y SUS MASCOTAS");
        System.out.println("========================================");

        for (Propietario propietario : propietarios) {
            System.out.println("- Propietario: " + propietario.getNombre()
                    + " | Tel: " + propietario.getTelefono());

            List<Mascota> mascotas = propietario.getMascotas();
            if (mascotas.isEmpty()) {
                System.out.println("    (sin mascotas registradas)");
            } else {
                for (Mascota mascota : mascotas) {
                    System.out.println("    * " + mascota.describir());
                }
            }
        }
        System.out.println();
    }

    public void mostrarConsultas(List<Consulta> consultas) {
        System.out.println("========================================");
        System.out.println("   CONSULTAS REALIZADAS");
        System.out.println("========================================");

        for (Consulta consulta : consultas) {
            System.out.println("- Consulta #" + consulta.getId()
                    + " | Fecha: " + consulta.getFecha()
                    + " | Motivo: " + consulta.getMotivo());
            System.out.println("    Mascota: " + consulta.getMascota().getNombre()
                    + " | Veterinario: " + consulta.getVeterinario().getNombre());
        }
        System.out.println();
    }

    public void mostrarMedicamentosRecetados(List<Consulta> consultas) {
        System.out.println("========================================");
        System.out.println("   MEDICAMENTOS RECETADOS POR CONSULTA");
        System.out.println("========================================");

        for (Consulta consulta : consultas) {
            System.out.println("- Consulta #" + consulta.getId() + ":");
            List<Medicamento> medicamentos = consulta.getMedicamentos();
            if (medicamentos.isEmpty()) {
                System.out.println("    (no se recetaron medicamentos)");
            } else {
                for (Medicamento medicamento : medicamentos) {
                    System.out.println("    * " + medicamento);
                }
            }
        }
        System.out.println();
    }
}
