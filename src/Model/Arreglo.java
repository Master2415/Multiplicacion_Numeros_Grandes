package Model;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Arreglo {

    public void crearArreglosMain() throws IOException {
        for (int i = 1; i <= 3; i++) {
            int n = 2; // Probar tamanos
            int potencia = (int) Math.pow(n, i);
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

    public ArrayList<Integer>[] leerArreglo2(String ruta) {
        File archivo = new File(ruta);
        ArrayList<Integer>[] arreglo = null;  // Arreglo de ArrayList<Integer>
        try {
            Scanner scanner = new Scanner(archivo);
            String primeraLinea = scanner.nextLine();
            String[] valores = primeraLinea.split(" ");
            int longitud = valores.length;
            arreglo = new ArrayList[longitud];  // Inicializa el arreglo con la longitud obtenida

            // Itera sobre los valores y agrega cada valor a un ArrayList en el arreglo
            for (int i = 0; i < longitud; i++) {
                arreglo[i] = new ArrayList<>();  // Inicializa cada ArrayList en el arreglo
                arreglo[i].add(Integer.parseInt(valores[i]));  // Agrega el valor convertido a entero al ArrayList
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: Archivo no encontrado");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Error: Formato de número inválido");
            e.printStackTrace();
        }
        return arreglo;  // Retorna el arreglo de ArrayList<Integer>
    }


    private void crearArreglo(String numeroArreglo, int n) throws IOException {
        long[] arreglo = new long[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int numero = random.nextInt(90000000) + 10_000_000; // Generar un número aleatorio de 8 dígitos
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
