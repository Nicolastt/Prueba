import java.util.Comparator;

public class ComparadorIngresos implements Comparator<Registro> {
    @Override
    public int compare(Registro o1, Registro o2) {
        return (int)o1.valor - (int)o2.valor;
    }
}
