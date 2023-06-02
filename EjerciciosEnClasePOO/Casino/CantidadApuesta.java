package EjerciciosEnClasePOO.Casino;

public enum CantidadApuesta {
    //La numeracion asignaba el valor de las constantes
    DIEZ(10), VEINTE(20), TREINTA(30), CUARENTA(40);

    private double valor;

    CantidadApuesta(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
