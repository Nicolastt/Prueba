import java.util.ArrayList;
import java.util.Collections;

public class Formulario {
    private final ArrayList<Registro> registros;
    private double utilidad;

    public Formulario(){
        registros = new ArrayList<>();
    }

    public void agregarRegistro(Registro registro) {
        registros.add(registro);
        utilidad += registro.getValorMovimiento();
    }

    public String imprimirFormulario() {
        Collections.sort(registros);
        Collections.reverse(registros);
        StringBuilder reporte = new StringBuilder("=== REPORTE DE INGRESOS Y EGRESOS ===\n");
        for (Registro registro: registros){
            reporte.append(registro).append("\n");
        }
        return reporte.toString();
    }

    public String imprimirListaDeIngresos() {
        ArrayList<Registro> listaDeIngresos = new ArrayList<>();
        String reporte = "=== REPORTE DE INGRESOS ===\n";
        for (Registro registro : registros) {
            if (registro instanceof Ingreso) {
                listaDeIngresos.add(registro);
            }
        }
        Collections.sort(listaDeIngresos, new ComparadorIngresos());
        for (Registro registro : listaDeIngresos) {
            reporte += registro + "\n";
        }
        return reporte;
    }

    public String imprimirUtilidad() {
        return "La utilidad es: " + utilidad;
    }
}
