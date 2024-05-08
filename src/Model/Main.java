package Model;

import java.io.IOException;

public class Main {
    private static final Arreglo arreglo = new Arreglo();
    private static final Tiempos tiempo = new Tiempos();

    public static void main(String[] args) throws IOException {
        run();
    }

    private static void run() throws IOException {
        //arreglo.crearArreglosMain();
        tiempo.tiempo();
    }

}
