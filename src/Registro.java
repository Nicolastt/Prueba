public class Registro implements Comparable<Registro> {
    public String fecha;
    public String descripcion;
    public double valor;

    public Registro(String fecha, String descripcion, double valor) throws FechaException {
        if (!esValida(fecha)){
            throw new FechaException();
        }
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.valor = valor;
    }

    private boolean esValida(String fecha) {
        String[] fechaDividida = fecha.split("-");
        int dia = (Integer.parseInt((fechaDividida[2])));
        if (dia < 0 || dia > 31) {
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return fecha + "\t\t" +
                descripcion + "\t\t" +
                valor;
    }

    public double getValorMovimiento() {
        return valor;
    }

    @Override
    public int compareTo(Registro o) {
        return fecha.compareTo(o.fecha);
    }
}
