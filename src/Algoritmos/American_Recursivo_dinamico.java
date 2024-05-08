package Algoritmos;

public class American_Recursivo_dinamico {

    public static long[] multiplicacionAmericanaRecursivaDinamica(long[] arreglo1, long[] arreglo2) {
        // Se obtienen las longitudes de los arreglos.
        int n = arreglo1.length;
        int m = arreglo2.length;
        // Se crea un arreglo para almacenar el resultado de la multiplicación.
        long[] resultado = new long[n + m - 1];
        // Se llama al método auxiliar para realizar la multiplicación recursiva.
        multiplicacionAmericanaRecursivaHelper(arreglo1, arreglo2, resultado, 0, 0);
        // Se devuelve el arreglo con el resultado de la multiplicación.
        return resultado;
    }

    // Método auxiliar para realizar la multiplicación de manera recursiva y dinámica.
    private static void multiplicacionAmericanaRecursivaHelper(long[] arreglo1, long[] arreglo2, long[] resultado, int i, int j) {
        // Se obtienen las longitudes de los arreglos.
        int n = arreglo1.length;
        int m = arreglo2.length;
        // Caso base: Si alguno de los índices llega al final del arreglo, se detiene la recursión.
        if (i == n || j == m) {
            return;
        }

        // Se calcula la multiplicación y la suma con el valor existente en resultado[i + j].
        long multiplicacion = arreglo1[i] * arreglo2[j];
        long suma = multiplicacion + resultado[i + j];

        // Se guarda el resultado de la suma en la posición correspondiente del arreglo resultado.
        resultado[i + j] = suma % 10;

        // Si la posición siguiente existe en el arreglo resultado, se ajusta el acarreo.
        if (resultado.length > i + j + 1) {
            resultado[i + j + 1] += suma / 10;
        }

        // Llamada recursiva para continuar con la multiplicación en las siguientes posiciones.
        multiplicacionAmericanaRecursivaHelper(arreglo1, arreglo2, resultado, i, j + 1);  // Avanza en arreglo2.
        multiplicacionAmericanaRecursivaHelper(arreglo1, arreglo2, resultado, i + 1, j);  // Avanza en arreglo1.
    }


}
