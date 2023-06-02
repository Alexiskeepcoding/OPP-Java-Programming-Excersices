public class Registro {

    public static final int NOTA_MINIMA = 7;


    public String nombre; // Clase
    public double nota1;
    public double nota2;

    public double calcularPromedio() {
        return (double) (nota1 + nota2) / 2;
    }

    public void crear(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String imprimirEstado() {
        //El estudiante X con promedio Y, aprueba/ no aprueba
        //poner el nombre del estudiante
        return "El estudiante " + nombre + " con promedio " + calcularPromedio() + " " + estaAprobado();
    }

    private String estaAprobado() {
        return (calcularPromedio() >= NOTA_MINIMA)
                ? "aprueba" : "reprueba";
    }

}
