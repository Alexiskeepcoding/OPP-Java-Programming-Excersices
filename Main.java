

public class Main { //Esto es una clase- o archivo
    public static void main(String[] args) { // Esta es la firma de una función
        System.out.println("Hello and welcome!"); // Sentencia

        int a; // Reservar un tipo de dato en memoria- declaro variable
        int b = 6;
        double c = 7;
        a = 1; //asignando un valor - inicializar la variable

        char d = 'g';

        c = b;
        c = a;

        System.out.println(a + " " + b + " " + c); // solo se concatena
        System.out.println(a + " " + (b + c)); //Cambiar presedencia () con parentesis- para sumar dos concatenasiones

        System.out.println((char) ((a + d) + ' ' + (b + c)));

        // FORMAS PARA GENERAR ARREGLOS

        //arreglo estático- No va a a variar su tamaño

        int[] a2; //declaro
        a2 = new int[2]; // reservo memoria
        a2[0] = 9; // asignando

        int[] b2 = new int[3]; // declaro y como reservo memoria
        b2[0] = 9;


        int[] c2 = {9, 5, 3};

        /*
         * FORMA PARA IMPRIMIR UN ARRAY*/




        /*FOR EACH */


        /*
        * for(;;){
            System.out.println("Hola")
        * }
        * se puede imprimir, porque es un while infinito
        * */

        /*MÉTODOS */

        extracted(c2);

        imprimirArreglo(c2);

        int f = hacerOtraCosa();


    } // bloque de código

    private static int hacerOtraCosa() {
        return 0;
    }

    private static void extracted(int[] c2) { // Colocar en una función
        for (int i = 0; i < c2.length; i += 2) {  // tamaño maximo var.length
            System.out.printf(c2[i] + " ");
        }
    }

    private static void imprimirArreglo(int[] c2) {
        for (int elemento : c2) { // accede a cada valor de ese item (predeterminado)
            System.out.println(elemento);
        }
    }


    /*
   Instrucción:
   Realizar un programa que permita mantener la información de una lista de alumnos con sus dos notas:_
   Nota 1
   Nota 2
   Calcular si aprueba la asignatura
   */



}

