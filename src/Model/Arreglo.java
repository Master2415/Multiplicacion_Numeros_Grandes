package Model;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Arreglo {

    public void crearArreglosMain() throws IOException {
        for (int i = 1; i <= 3; i++) {
            int potencia = (int) Math.pow(2, i);
            for (int j = 1; j <= 2; j++) {
                crearArreglo(i + "." + j, potencia);
            }
        }
    }

    public void guardarArchivo(String ruta, String contenido, boolean flagAnexarContenido) throws IOException {
        FileWriter fw = new FileWriter(ruta, flagAnexarContenido);
        BufferedWriter bfw = new BufferedWriter(fw);
        bfw.write(contenido);
        bfw.close();
        fw.close();
    }

    public int[] leerArreglo(String ruta) {
        File archivo = new File(ruta);
        int[] arreglo = null;
        try {
            Scanner scanner = new Scanner(archivo);
            String primeraLinea = scanner.nextLine();
            String[] valores = primeraLinea.split(" ");
            int longitud = valores.length;
            arreglo = new int[longitud];
            for (int i = 0; i < longitud; i++) {
                arreglo[i] = Integer.parseInt(valores[i]);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: Archivo no encontrado");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Error: Formato de número inválido");
            e.printStackTrace();
        }
        return arreglo;
    }

    private void crearArreglo(String numeroArreglo, int n) throws IOException {
        long[] arreglo = new long[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int numero = random.nextInt(90000000) + 10000000; // Generar un número aleatorio de 8 dígitos
            arreglo[i] = numero;
        }
        guardarArreglos(arreglo, numeroArreglo);
    }

    public void guardarArreglos(long[] arreglo, String numeroArreglo) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (long value : arreglo) {
            sb.append(value);
            sb.append(" ");
        }
        String arregloEscrito = sb.toString();
        guardarArchivo("C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + numeroArreglo + ".txt", arregloEscrito, false);
    }
}
