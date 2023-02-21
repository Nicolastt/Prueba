public class Egreso extends Registro {
    public Egreso(String fecha, String descripcion, double valor) throws FechaException {
        super(fecha,descripcion,valor);
    }

    @Override
    public double getValorMovimiento() {
        return -super.getValorMovimiento();
    }

    @Override
    public String toString(){
        return fecha + "\t\t" +
                descripcion + "\t\t" +
                valor;
    }
}
