package EjerciciosEnClasePOO.Casino;

public class Cuenta {

    private double dinero;
    public Cuenta(double dinero) {
        this.dinero = dinero;
    }

    public boolean verificarDinero(CantidadApuesta cantidad) {
        return dinero >= cantidad.getValor();
    }

    public double descontar(CantidadApuesta cantidad) {
        dinero -=cantidad.getValor();
        return cantidad.getValor();
    }

    public void acreditar(double valor) {
        dinero += valor;
    }

    @Override
    public String toString() {
        return Double.toString(dinero); // Es un primitivo por eso el toString
    }
}
