package Model;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Graficas {

    private final Metodos_Accion metodosAccion = new Metodos_Accion();

    public void tiempo() throws IOException {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            long tiempoIterativoEstatico = obtenerTiempo(() -> {
                try {
                    metodosAccion.x_AmericanIterativo_estatico();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            long tiempoIterativoDinamico = obtenerTiempo(() -> {
                try {
                    metodosAccion.x_AmericanIterativo_dinamico();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            long tiempoRecursivoEstatico = obtenerTiempo(() -> {
                try {
                    metodosAccion.x_AmericanRecursivo_estatico();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            long tiempoRecursivoDinamico = obtenerTiempo(() -> {
                try {
                    metodosAccion.x_AmericanRecursivo_dinamico();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            long tiempoInglesaIterativaEstatico = obtenerTiempo(() -> {
            try {
                metodosAccion.x_Inglesa_Iterativo_Estatico();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
            long tiempoInglesaIterativaDinamica = obtenerTiempo(() -> {
                try {
                    metodosAccion.x_Inglesa_Iterativo_Dinamico();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            long tiempoInglesaRecursivaEstatico = obtenerTiempo(() -> {
                try {
                    metodosAccion.x_Inglesa_Recursiva_Estatica();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            long tiempoInglesaRecursivaDinamica = obtenerTiempo(() -> {
                try {
                    metodosAccion.x_Inglesa_Recursivo_Dinamico();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            long tiempoHindu_Iterativo_Estatica = obtenerTiempo(() -> {
                try {
                    metodosAccion.x_Hindu_Iterativo_Estatica();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            long tiempoDivideVenceras_Estatico = obtenerTiempo(() -> {
                try {
                    metodosAccion.x_DivideVenceras_Estatico();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            dataset.addValue(tiempoIterativoEstatico, "AmericanIterativo_estatico", "");
            dataset.addValue(tiempoIterativoDinamico, "AmericanIterativo_dinamico", "");
            dataset.addValue(tiempoRecursivoEstatico, "AmericanRecursivo_estatico", "");
            dataset.addValue(tiempoRecursivoDinamico, "AmericanRecursivo_dinamico", "");

            dataset.addValue(tiempoInglesaIterativaEstatico, "InglesaIterativa_estatico", "");
            dataset.addValue(tiempoInglesaIterativaDinamica, "InglesaIterativa_dinamico", "");
            dataset.addValue(tiempoInglesaRecursivaEstatico, "InglesaRecursivo_estatico", "");
            dataset.addValue(tiempoInglesaRecursivaDinamica, "InglesaRecursivo_dinamico", "");

            dataset.addValue(tiempoHindu_Iterativo_Estatica, "Hindu_Iterativo", "");
            dataset.addValue(tiempoDivideVenceras_Estatico, "DivideVenceras_1", "");

            // Imprimir tiempos en consola
            System.out.println("Tiempo AmericanIterativo_estatico: " + tiempoIterativoEstatico + " ns");
            System.out.println("Tiempo AmericanIterativo_dinamico: " + tiempoIterativoDinamico + " ns");
            System.out.println("Tiempo AmericanRecursivo_estatico: " + tiempoRecursivoEstatico + " ns");
            System.out.println("Tiempo AmericanRecursivo_dinamico: " + tiempoRecursivoDinamico + " ns");

            System.out.println("Tiempo InglesaIterativa_estatico: " + tiempoInglesaIterativaEstatico + " ns");
            System.out.println("Tiempo InglesaIterativa_dinamico: " + tiempoInglesaIterativaDinamica + " ns");
            System.out.println("Tiempo InglesaRecursivo_estatico: " + tiempoInglesaRecursivaEstatico + " ns");
            System.out.println("Tiempo InglesaRecursivo_dinamico: " + tiempoInglesaRecursivaDinamica + " ns");

            System.out.println("Tiempo Hindu_Iterativo: " + tiempoHindu_Iterativo_Estatica + " ns");
            System.out.println("Tiempo DivideVenceras_1: " + tiempoDivideVenceras_Estatico + " ns");



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

        JFrame frame = new JFrame("Tiempos de ejecución");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ChartPanel chartPanel = new ChartPanel(chart);
        frame.getContentPane().add(chartPanel, BorderLayout.CENTER);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    private long obtenerTiempo(Runnable metodo) throws IOException {
        long inicio = System.nanoTime();
        metodo.run();
        long fin = System.nanoTime();
        return fin - inicio;
    }
}

