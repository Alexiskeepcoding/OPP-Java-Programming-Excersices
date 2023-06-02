package EjerciciosEnClasePOO.Casino;

public class Apostador {

    private String nombre;

    private Cuenta cuenta;
    private double ultimaApuesta;

    public Apostador(String nombre, Cuenta cuenta) {
        this.nombre = nombre;
        this.cuenta = cuenta;
    }


    public boolean tieneDineroDisponible(CantidadApuesta cantidad) {
        return cuenta.verificarDinero(cantidad);
    }

    public double descontar(CantidadApuesta cantidad) {
        ultimaApuesta = cantidad.getValor();
        return cuenta.descontar(cantidad);
    }

    @Override
    public String toString() {
        return nombre;
    }

    public double getUltimaApuesta() { // Regresa el valor de cada apostador
        return ultimaApuesta;
    }

    public void acreditar(double valor) {
        cuenta.acreditar(valor);
    }

    public String imprimirEstado() {
        return nombre + " apostó " + ultimaApuesta + " saldo actual: " + cuenta;
    }
}
