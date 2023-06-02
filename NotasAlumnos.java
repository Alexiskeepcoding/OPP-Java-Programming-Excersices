public class NotasAlumnos {
    /*
   Instrucción:
   Realizar un programa que permita mantener la información de una lista de alumnos con sus dos notas:_
   Nota 1
   Nota 2
   Calcular si aprueba la asignatura
   Hasta con 5 alumnos
   Solo debe mantener la lista, no debe
   */

    //Clases y Objetos
    public static void main(String[] args) {

        System.out.println("Ingrese el numero de estudiantes: ");

        Registro[] alumnos = new Registro[2]; // Separando espacios para el arreglo


        alumnos[0] = new Registro(); // Es una instanciación

        alumnos[0].crear("Pepe", 5, 7);
        alumnos[0].nombre = "Pedro Palotes";
        alumnos[0].nota1 = 4;
        alumnos[0].nota2 = 8;

        alumnos[1] = new Registro(); // Es una instanciación

        alumnos[1].crear("Pepa", 7.20,5.67 );

        alumnos[1].nombre = "Ricky Martin ";
        alumnos[1].nota1 = 8;
        alumnos[1].nota2 = 9;

        for(Registro alumno:alumnos ){
            System.out.println(alumno.imprimirEstado());
        }


        /*
        *Registro[] alumnos = new Registro[2];

        alumnos[0] = new Registro();

        alumnos[0].crear("Pepe", 5, 7);

        //alumnos[0].nombre = "Pedro Palotes";
        //alumnos[0].nota1 = 8;
        //alumnos[0].nota2 = 8;

        alumnos[1] = new Registro();

        alumnos[1].crear("Pepa", 8, 9);

        //alumnos[1].nombre = "Armando Paredes";
        //alumnos[1].nota1 = 5;
        //alumnos[1].nota2 = 8;

        for(Registro alumno: alumnos ){
            System.out.println(alumno.imprimirEstado());
        }
        */


        /*
        Registro pedro; // Clase(tipo de dato) - objeto(variable)
        pedro = new Registro(); // crea una instancia -> Asigna una instancia
        pedro.nombre = "Pedro Palotes"; // accede a una de las características de la instancia

        pedro.nota1 = 4;
        pedro.nota2 = 8;

        System.out.println(pedro.calculaPromedio()); // Este es un método);
        //Clase.objeto.método */
    }



}
