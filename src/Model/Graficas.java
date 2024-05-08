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

    public void tiempo() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        try {
            long tiempoIterativoEstatico = obtenerTiempo(() -> {
                try {
                    metodosAccion.x_AmericanIterativo_estatico();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            long tiempoIterativoDinamico = obtenerTiempo(() -> {
                try {
                    metodosAccion.x_AmericanIterativo_dinamico();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            long tiempoRecursivoEstatico = obtenerTiempo(() -> {
                try {
                    metodosAccion.x_AmericanRecursivo_estatico();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            long tiempoRecursivoDinamico = obtenerTiempo(() -> {
                try {
                    metodosAccion.x_AmericanRecursivo_dinamico();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            dataset.addValue(tiempoIterativoEstatico, "AmericanIterativo_estatico", "");
            dataset.addValue(tiempoIterativoDinamico, "AmericanIterativo_dinamico", "");
            dataset.addValue(tiempoRecursivoEstatico, "AmericanRecursivo_estatico", "");
            dataset.addValue(tiempoRecursivoDinamico, "AmericanRecursivo_dinamico", "");
            // Imprimir tiempos en consola
            System.out.println("Tiempo AmericanIterativo_estatico: " + tiempoIterativoEstatico + " ns");
            System.out.println("Tiempo AmericanIterativo_dinamico: " + tiempoIterativoDinamico + " ns");
            System.out.println("Tiempo AmericanRecursivo_estatico: " + tiempoRecursivoEstatico + " ns");
            System.out.println("Tiempo AmericanRecursivo_dinamico: " + tiempoRecursivoDinamico + " ns");

        } catch (IOException e) {
            // Manejo de la excepción
            e.printStackTrace();
        }

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

