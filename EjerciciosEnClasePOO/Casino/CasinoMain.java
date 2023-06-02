package EjerciciosEnClasePOO.Casino;

public class CasinoMain {
    public static void main(String[] args) {

        //Crear la lista de apostadores
        Apostador daniel = new Apostador("Daniel", new Cuenta(300));
        Apostador franchesco = new Apostador("Franchesco", new Cuenta(450));
        Apostador juanito = new Apostador("Juanito", new Cuenta(120));
        Apostador mariaAna = new Apostador("María Ana", new Cuenta(2));

        //Creación de la apuesta

        Apuesta pasaPOO = new Apuesta("Daniel no pasa POO", "Daniel si pasa POO");

        pasaPOO.registrarApostador(daniel, CantidadApuesta.DIEZ, Equipo.A);
        pasaPOO.registrarApostador(franchesco, CantidadApuesta.CUARENTA, Equipo.A);
        pasaPOO.registrarApostador(juanito, CantidadApuesta.VEINTE, Equipo.B);
        pasaPOO.registrarApostador(mariaAna, CantidadApuesta.VEINTE, Equipo.B); // Tiene que salir mensaje de no puede apostar, por la cantidad

        //fondo: 80
        System.out.println(pasaPOO);

        //Decir quien gano y Distribuir
        pasaPOO.notificarYDistribuirGanador(Equipo.B);

        //Imprimir la tabla de resultados

        pasaPOO.imprimirTablaDeResultados();




    }

}
