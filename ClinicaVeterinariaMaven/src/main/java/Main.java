import controlador.ClinicaController;

/**
 * Clase principal del proyecto.
 *
 * Su única responsabilidad es instanciar el Controlador e invocar el
 * método que arranca el flujo completo. No contiene lógica de negocio
 * ni llamados a System.out.println: toda esa responsabilidad está
 * delegada al controlador y a la vista.
 */
public class Main {

    public static void main(String[] args) {
        ClinicaController controller = new ClinicaController();
        controller.iniciar();
    }
}
