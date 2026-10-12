
import java.util.List;

public class ExportadorAgenciaTributaria extends ExportadorFinanciero {

    @Override
    public void exportarDatos(List<String> registros) {

        if (validarRegistros(registros)) {
            System.out.println("Iniciando exportacion a la Agencia Tributaria...");

            for (String registro : registros) {
                System.out.println("Enviando declaracion: " + registro);
            }

            System.out.println("Exportacion a la Agencia Tributaria completada.");
        } else {
            System.out.println("Error: no hay registros para exportar.");
        }
    }
}
