package EjerciciosEnClasePOO.Casino;

public class Apuesta {

    private String apuestaA;
    private String apuestaB;
    private double fondo;

    //Inicializa en ==null== los objetos - porque son objetos
    private Apostador[] listaApuestaA;
    private Apostador[] listaApuestaB;

    //todos las cantidades inician en 0 - porque son primitivos
    private int cantidadApostadoresA;
    private int cantidadApostadoresB;

    public Apuesta(String apuestaA, String apuestaB) {
        this.apuestaA = apuestaA;
        this.apuestaB = apuestaB;
        listaApuestaA = new Apostador[10];
        listaApuestaB = new Apostador[10];
        //inicializar los contadores de apostadores
    }

    public void registrarApostador(Apostador apostador, CantidadApuesta cantidad, Equipo equipo) {
        //Revisar si el apostador tiene dinero

        if (!apostador.tieneDineroDisponible(cantidad)) {
            System.out.println(apostador + " No tiene dinero suficientes fondos para participar ");
            return;
        }

        //Se asigna el equipo

        switch (equipo) {
            case A:
                listaApuestaA[cantidadApostadoresA++] = apostador;
                break;
            case B:
                listaApuestaB[cantidadApostadoresB++] = apostador;
        }

        //De la cantidad se le resta al apostador y se le suma al fondo

        fondo += apostador.descontar(cantidad);
        System.out.println(apostador + " apostó al equipo " + equipo + " el valor de " + "$ " + cantidad + " dólares. \n Fondo total: $" + fondo);
    }


    public void notificarYDistribuirGanador(Equipo equipo) {
        //mostrar quien ganó
        System.out.println("====    ANUNCIO     ====");
        System.out.println("Ganador: " + equipo);
        //distruibuir dinero

        switch (equipo) {
            case A:
                distribuirDinero(listaApuestaA);
                break;
            case B:
                distribuirDinero(listaApuestaB);
        }

        //
    }

    private void distribuirDinero(Apostador[] apostadores) {
        //Obtengo el 100%
        double fondoDeApuesta = calcularFondoDeApuesta(apostadores);
        //vemos por regla de 3 los porcentaje- de cada uno
        //acreditamos el valor a la cuenta
        repartirFondoDeApuesta(fondoDeApuesta, apostadores);
    }

    private double calcularFondoDeApuesta(Apostador[] apostadores) {
        double fondoDeApuesta = 0;
        for (Apostador apostador : apostadores) {
            if (apostador != null) { //recuerde los 10 del tam
                fondoDeApuesta += apostador.getUltimaApuesta(); //Nunca lo hemos grabado -> Hay que recuperar el atributo
            }
        }
        return fondoDeApuesta;
    }

    private void repartirFondoDeApuesta(double fondoDeApuesta, Apostador[] apostadores) {
        for (Apostador apostador : apostadores) {
            if (apostador != null) { //recuerde los 10 del tam
                apostador.acreditar(apostador.getUltimaApuesta() * fondo / fondoDeApuesta); //70 -->  10 * 20% (50 * 100/10)
            }
        }

    }

    public void imprimirTablaDeResultados() {
        System.out.println("==== RESULTADOS ====");
        imprimirTabla(listaApuestaA);
        imprimirTabla(listaApuestaB);
    }

    private void imprimirTabla(Apostador[] apostadores) {
        for (Apostador apostador : apostadores) {
            if (apostador != null) {
                System.out.println(apostador.imprimirEstado());
            }
        }

    }
}
