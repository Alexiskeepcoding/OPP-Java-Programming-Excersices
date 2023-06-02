package BolsilloYMochila;

public class Main {
    public static void main(String[] args) {

        //Los atributos son las clases dentro de la clase mochila.
        Mochila mochila = new Mochila (
                new Bolsillo(3),
                new Bolsillo (2),
                new Bolsillo (1),
                new Bolsillo (1)
        );

        Mochila mochilita = new Mochila(
                new Bolsillo(2),
                new Bolsillo(1)
        );

        mochila.guardarEnBolsillo(3,"Esfero1");
        System.out.println(mochila.retirarDeBolsillo(3)); //Se quito el esfero 3
        mochila.guardarEnBolsillo(1,"Esfero2");
        mochila.guardarEnBolsillo(1,"Esfero3 ");
        mochila.guardarEnBolsillo(1,"Esfero4");
        mochila.retirarDeBolsillo(1); //Se quito el esfero 3



        System.out.println(mochila.vaciarMochila());
        //mochila.vaciarMochila();
        //la.vaciarEnBolsillo(3);


      /*Bolsillo bolsillo = new Bolsillo(5);

        bolsillo.guardar("Esfero1");
        System.out.println(bolsillo.retirarDeBolsillo());
        bolsillo.guardar("Esfero2");
        bolsillo.guardar("Esfero3");
        bolsillo.guardar("Esfero4");
        bolsillo.guardar("Esfero5");
        bolsillo.guardar("Esfero6"); // No deberia permitir ingresarlo

        System.out.println(bolsillo.retirarDeBolsillo());
        System.out.println(bolsillo.retirarDeBolsillo());
        System.out.println(bolsillo.retirarDeBolsillo());
        bolsillo.guardar("Esfero6"); //Debe permitir
        */


    }
}


