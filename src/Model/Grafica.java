package Model;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Grafica {

    public void Graficas2() throws IOException {

        // Crear un array para almacenar los tiempos de ejecución
        long[] tiempos = new long[10]; //

        Metodos_Accion metodosAccion = new Metodos_Accion();

        long americana_iterativa_estatica = obtenerTiempo(() -> {
            try {
                metodosAccion.x_AmericanIterativo_estatico();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        tiempos[0] = americana_iterativa_estatica;

        long americana_iterativa_Dinamica = obtenerTiempo(() -> {
            try {
                metodosAccion.x_AmericanIterativo_dinamico();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        tiempos[1] = americana_iterativa_Dinamica;

        long americana_Recursiva_estatica = obtenerTiempo(() -> {
            try {
                metodosAccion.x_AmericanRecursivo_estatico();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        tiempos[2] = americana_Recursiva_estatica;

        long americana_Recursiva_Dinamica = obtenerTiempo(() -> {
            try {
                metodosAccion.x_AmericanRecursivo_dinamico();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        tiempos[3] = americana_Recursiva_Dinamica;

        long tiempoInglesaIterativaEstatico = obtenerTiempo(() -> {
            try {
                metodosAccion.x_Inglesa_Iterativo_Estatico();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        tiempos[4] = tiempoInglesaIterativaEstatico;

        long tiempoInglesaIterativaDinamica = obtenerTiempo(() -> {
            try {
                metodosAccion.x_Inglesa_Iterativo_Dinamico();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        tiempos[5] = tiempoInglesaIterativaDinamica;

        long tiempoInglesaRecursivaEstatico = obtenerTiempo(() -> {
            try {
                metodosAccion.x_Inglesa_Recursiva_Estatica();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        tiempos[6] = tiempoInglesaRecursivaEstatico;

        long tiempoInglesaRecursivaDinamica = obtenerTiempo(() -> {
            try {
                metodosAccion.x_Inglesa_Recursivo_Dinamico();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        tiempos[7] = tiempoInglesaRecursivaDinamica;

        long tiempoHindu_Iterativo_Estatica = obtenerTiempo(() -> {
            try {
                metodosAccion.x_Hindu_Iterativo_Estatica();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        tiempos[8] = tiempoHindu_Iterativo_Estatica;

        long tiempoDivideVenceras_Estatico = obtenerTiempo(() -> {
            try {
                metodosAccion.x_DivideVenceras_Estatico();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        tiempos[9] = tiempoDivideVenceras_Estatico;


        // Crear el dataset para la gráfica
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(tiempos[0], "americana_iterativa_estatica", "");
        dataset.addValue(tiempos[1], "americana_iterativa_Dinamica", "");
        dataset.addValue(tiempos[2], "americana_Recursiva_estatica", "");
        dataset.addValue(tiempos[3], "americana_Recursiva_Dinamica", "");

        dataset.addValue(tiempos[4], "InglesaIterativaEstatico", "");
        dataset.addValue(tiempos[5], "InglesaIterativaDinamica", "");
        dataset.addValue(tiempos[6], "InglesaRecursivaEstatico", "");
        dataset.addValue(tiempos[7], "InglesaRecursivaDinamica", "");

        dataset.addValue(tiempos[8], "Hindu_Iterativo_Estatica", "");
        dataset.addValue(tiempos[9], "Divide_Venceras_Estatico", "");

        // Imprimir tiempos en consola
        System.out.println("Tiempo AmericanIterativo_estatico: " + americana_iterativa_estatica + " ns");
        System.out.println("Tiempo AmericanaIterativa_Dinamica: " + americana_iterativa_Dinamica + " ns");
        System.out.println("Tiempo AmericanRecursivo_estatico: " + americana_Recursiva_estatica + " ns");
        System.out.println("Tiempo AmericanRecursivo_dinamico: " + americana_Recursiva_Dinamica + " ns");

        System.out.println("Tiempo InglesaIterativa_estatico: " + tiempoInglesaIterativaEstatico + " ns");
        System.out.println("Tiempo InglesaIterativa_dinamico: " + tiempoInglesaIterativaDinamica + " ns");
        System.out.println("Tiempo InglesaRecursivo_estatico: " + tiempoInglesaRecursivaEstatico + " ns");
        System.out.println("Tiempo InglesaRecursivo_dinamico: " + tiempoInglesaRecursivaDinamica + " ns");

        System.out.println("Tiempo Hindu_Iterativo: " + tiempoHindu_Iterativo_Estatica + " ns");
        System.out.println("Tiempo DivideVenceras_1: " + tiempoDivideVenceras_Estatico + " ns");

        // Crear la gráfica de barras
        JFreeChart chart = ChartFactory.createBarChart(
                "Tiempos de ejecución de métodos", // Título del gráfico
                "Métodos", // Etiqueta del eje X
                "Tiempo (nanosegundos)", // Etiqueta del eje Y
                dataset, // Dataset con los datos
                PlotOrientation.VERTICAL, // Orientación del gráfico
                true, // Incluir leyenda
                true, // Incluir tooltips
                false // Incluir URLs
        );

        // Mostrar la gráfica en una ventana
        JFrame frame = new JFrame("Gráfica de Barras");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        frame.getContentPane().add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }


    private long obtenerTiempo(Runnable metodo) throws IOException {
        long inicio = System.nanoTime();
        metodo.run();
        long fin = System.nanoTime();
        return fin - inicio;
    }


}
