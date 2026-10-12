
import java.util.List;

public abstract class ExportadorFinanciero {

    public boolean validarRegistros(List<String> registros) {
        if (registros != null && !registros.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public abstract void exportarDatos(List<String> registros);
}
