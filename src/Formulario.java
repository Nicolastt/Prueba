import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;
import java.util.Collections;

public class Formulario {
    private ArrayList<Registro> registros;
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
        String reporte = "=== REPORTE DE INGRESOS Y EGRESOS ===\n";
        for (Registro registro: registros){
            reporte += registro + "\n";
        }
        return reporte;
    }

    public String imprimirListaDeIngresos() {
        ArrayList<Registro> listaDeIngresos = new ArrayList<>();

        String reporte = "=== REPORTE DE INGRESOS ===\n";
        for (Registro registro: registros){
            if (registro instanceof Ingreso) {
                listaDeIngresos.add(registro);
                reporte += registro + "\n";
            }
        }
        return reporte;
    }

    public String imprimirUtilidad() {
        return "La utilidad es: " + utilidad;
    }
}
