public class Main {
    public static void main(String[] args) {
        Formulario formularioIngresosEgresos = new Formulario();
        try {
            formularioIngresosEgresos.agregarRegistro(new Ingreso(
                    "2023-12-12", "Desc1", 40.00
            ));
            formularioIngresosEgresos.agregarRegistro(new Ingreso(
                    "2023-12-12", "Desc2", 20.00
            ));
            formularioIngresosEgresos.agregarRegistro(new Ingreso(
                    "2023-12-22", "Desc3", 60.00
            ));
            formularioIngresosEgresos.agregarRegistro(new Egreso(
                    "2030-12-12", "Desc4", 10.00
            ));
        } catch (FechaException e) {
            System.out.println("Error en alguna fecha");
        }


        System.out.println(formularioIngresosEgresos.imprimirFormulario());
        System.out.println(formularioIngresosEgresos.imprimirListaDeIngresos());
        System.out.println(formularioIngresosEgresos.imprimirUtilidad());

    }
}