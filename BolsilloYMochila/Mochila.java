package BolsilloYMochila;

public class Mochila {
    private final Bolsillo[] bolsillos;

    /*
    Cada método tiene que tener una responsabilidad unica
    */

    public Mochila(Bolsillo... bolsillos) { //... para crear infinitos bolsillos dentro del método- Convertir a arreglos
        this.bolsillos = bolsillos;
    }

    public void guardarEnBolsillo(int numeroDeBolsillo, String objeto) {
        if (!existeBolsillo(numeroDeBolsillo)) {
            System.out.println("Ese bolsillo");
        }
        bolsillos[numeroDeBolsillo - 1].guardar(objeto);
    }

    private boolean existeBolsillo(int numeroDeBolsillo) {
        return numeroDeBolsillo > 0 && numeroDeBolsillo <= bolsillos.length;
    }

    public String retirarDeBolsillo(int numeroDeBolsillo) {
        if (!existeBolsillo(numeroDeBolsillo)) {
            System.out.println("El bolsillo no existe");
            return null;
        }
        return bolsillos[numeroDeBolsillo - 1].retirarDeBolsillo();
    }

    public String vaciarMochila() { // debería devolver todos los elementos en null
        //Vaciar el bolsillo y después vaciar la mochila
        for (Bolsillo bolsillo : bolsillos) {
            bolsillo.retirarDeBolsillo();
        }
        return "¡Se ha vaciado la mochila con éxito!";
    }
}
