
import java.util.List;

public class ExportadorBancoCentral extends ExportadorFinanciero {

    @Override
    public void exportarDatos(List<String> registros) {

        if (validarRegistros(registros)) {
            System.out.println("Iniciando exportacion al Banco Central...");

            for (String registro : registros) {
                System.out.println("Transfiriendo: " + registro);
            }

            System.out.println("Exportacion al Banco Central completada.");
        } else {
            System.out.println("Error: no hay registros para exportar.");
        }
    }
}
