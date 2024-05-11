package Model;

import java.io.IOException;

/*
 - Para ver el resultado de las matrices se debe quitar el comentario (a cada metodo) que guarda el resultado,
    en la clase metodos_accion.
 */

public class Main {
    private static final Arreglo arreglo = new Arreglo();
    private static final Tiempos tiempo = new Tiempos();
    private static final Graficas graficas = new Graficas();

    public static void main(String[] args) throws IOException {
        run();
    }

    private static void run() throws IOException {
        //arreglo.crearArreglosMain(); // Crea los arreglos
        //tiempo.tiempo(); // muestra el tiempo solo por consola
        graficas.tiempo(); // muestra el tiempo por consola y graficado
    }

}
