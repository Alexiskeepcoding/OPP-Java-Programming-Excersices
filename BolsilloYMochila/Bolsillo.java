package BolsilloYMochila;

public class Bolsillo {
    private final int capacidadMaxima;
    private int capacidadRestante;
    private String[] contenido;

    public Bolsillo(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        capacidadRestante = capacidadMaxima;
        contenido = new String[capacidadMaxima];
    }


    //tratar de hacerlo - está al nivel del método
    public void guardar(String objeto) {
        //revisar si hay capacidadRestante
        if(estaLleno()) {
            System.out.println("No hay espacio");
            return;
        }
        contenido[obtenerCapacidadActual()] = objeto;
        capacidadRestante--;
        System.out.println("Se guardo el objeto " + objeto);
    }
    private int obtenerCapacidadActual() {
        return capacidadMaxima - capacidadRestante;
    }

    //Prueba de escritorio
    public String retirarDeBolsillo() {
        //revisar si hay algo
        if(!existenElementos()) {
            return "No hay nada que retirar";
        }
        capacidadRestante++;
        String itemARetirar = contenido[capacidadMaxima - capacidadRestante]; // [3 - 0]
        contenido[capacidadMaxima - capacidadRestante] = ""; //null, el valor se elimina y se iguala a null
        return itemARetirar; //borrado- debería devolver el objeto
    }

    private boolean existenElementos() {
        return capacidadRestante < capacidadMaxima;
    }

    public String[] vaciarBolsillo() { // debería devolver todos los elementos
        capacidadRestante = capacidadMaxima;
        //poner en cero todos los strings de contenido
        return contenido;
    }

    public boolean estaLleno() {
        return capacidadRestante == 0;
    }

}
