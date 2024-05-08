package Algoritmos;

public class American_Recursivo_dinamico {

    public static int[] americanaRecursivoDinamico(int[] arreglo1, int[] arreglo2) {
        // Calculamos el tamaño del resultado
        int n = arreglo1.length + arreglo2.length;
        // Creamos un arreglo para almacenar el resultado
        int[] resultado = new int[n];
        // Llamamos a la función auxiliar recursiva para realizar la multiplicación
        multiplicacionRecursivaDinamica(arreglo1, arreglo2, resultado, 0, 0);
        return resultado;
    }

    private static void multiplicacionRecursivaDinamica(int[] arreglo1, int[] arreglo2, int[] resultado, int i, int j) {
        // Caso base: si i o j exceden los límites de los arreglos, retornamos
        if (i >= arreglo1.length || j >= arreglo2.length) {
            return;
        }
        // Realizamos la multiplicación y sumamos al resultado
        resultado[i + j] += arreglo1[i] * arreglo2[j];
        // Ajustamos el acarreo si es necesario
        resultado[i + j + 1] += resultado[i + j] / 10;
        resultado[i + j] %= 10;
        // Llamamos recursivamente a la función para seguir multiplicando
        multiplicacionRecursivaDinamica(arreglo1, arreglo2, resultado, i, j + 1);
        multiplicacionRecursivaDinamica(arreglo1, arreglo2, resultado, i + 1, j);
    }

}
