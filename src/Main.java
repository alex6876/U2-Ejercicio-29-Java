import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> registros = new ArrayList<>();

        registros.add("Balance enero: $150000");
        registros.add("Balance febrero: $230000");
        registros.add("Balance marzo: $180000");

        ExportadorFinanciero banco = new ExportadorBancoCentral();
        ExportadorFinanciero agencia = new ExportadorAgenciaTributaria();

        System.out.println("=== BANCO CENTRAL ===");
        banco.exportarDatos(registros);

        System.out.println();

        System.out.println("=== AGENCIA TRIBUTARIA ===");
        agencia.exportarDatos(registros);

        System.out.println();

        System.out.println("=== PRUEBA DE VALIDACION ===");
        List<String> registrosVacios = new ArrayList<>();

        banco.exportarDatos(registrosVacios);
    }
}
