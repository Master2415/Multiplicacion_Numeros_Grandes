package Model;

import java.io.IOException;

public class Tiempos {

    private final Metodos_Accion metodosAccion = new Metodos_Accion();

    public void tiempo() throws IOException {
        tiempo_AmericanIterativo_estatico();
        tiempo_AmericanIterativo_dinamcio();
        tiempo_AmericanRecursivo_estatico();
        tiempo_AmericanRecursivo_dinamcio();
    }

    private void tiempo_AmericanIterativo_estatico() throws IOException {

            long inicio = System.nanoTime(); // Obtener el tiempo inicial en nanosegundos
            metodosAccion.x_AmericanIterativo_estatico();
            long fin = System.nanoTime(); // Obtener el tiempo final en nanosegundos

            long tiempoEjecucion = fin - inicio; // Calcular el tiempo de ejecución en nanosegundos
            System.out.println("Tiempo de ejecución en nanosegundos AmericanIterativo_estatico : " + tiempoEjecucion);

    }

    private void tiempo_AmericanIterativo_dinamcio() throws IOException {

        long inicio = System.nanoTime(); // Obtener el tiempo inicial en nanosegundos
        metodosAccion.x_AmericanIterativo_dinamico();
        long fin = System.nanoTime(); // Obtener el tiempo final en nanosegundos

        long tiempoEjecucion = fin - inicio; // Calcular el tiempo de ejecución en nanosegundos
        System.out.println("Tiempo de ejecución en nanosegundos AmericanIterativo_dinamico : " + tiempoEjecucion);

    }

    private void tiempo_AmericanRecursivo_estatico() throws IOException {

        long inicio = System.nanoTime(); // Obtener el tiempo inicial en nanosegundos
        metodosAccion.x_AmericanRecursivo_estatico();
        long fin = System.nanoTime(); // Obtener el tiempo final en nanosegundos

        long tiempoEjecucion = fin - inicio; // Calcular el tiempo de ejecución en nanosegundos
        System.out.println("Tiempo de ejecución en nanosegundos AmericanRecursivo_estatico : " + tiempoEjecucion);

    }

    private void tiempo_AmericanRecursivo_dinamcio() throws IOException {

        long inicio = System.nanoTime(); // Obtener el tiempo inicial en nanosegundos
        metodosAccion.x_AmericanRecursivo_dinamico();
        long fin = System.nanoTime(); // Obtener el tiempo final en nanosegundos

        long tiempoEjecucion = fin - inicio; // Calcular el tiempo de ejecución en nanosegundos
        System.out.println("Tiempo de ejecución en nanosegundos AmericanRecursivo_dinamico : " + tiempoEjecucion);

    }



}
