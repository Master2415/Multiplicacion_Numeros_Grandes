package Algoritmos;

import java.util.ArrayList;

public class American_Recursivo_dinamico {

    // Se usa para el caso en que se requiera el tipo de dato int
    public int[] americanoRecursivoDinamico(int[] arreglo1, int[] arreglo2) {
        // Calcula la longitud del resultado
        int k = arreglo1.length + arreglo2.length - 1;
        // Inicializa el arreglo de resultado
        int[] resultado = new int[arreglo1.length + arreglo2.length];

        // Llama al método recursivo para realizar la multiplicación americana
        multiplicacionAmericanaRecursivaDinamica(arreglo1, arreglo2, resultado, k, 0, 0);

        return resultado;
    }

    // Método recursivo para multiplicación americana
    private void multiplicacionAmericanaRecursivaDinamica(int[] arreglo1, int[] arreglo2, int[] resultado, int k, int indice1, int indice2) {
        if (indice1 >= arreglo1.length || indice2 >= arreglo2.length) {
            // Se alcanzó el final de uno de los arreglos, termina la recursión
            return;
        }

        // Realiza la multiplicación y suma el resultado al índice correspondiente en resultado
        resultado[k] += arreglo1[indice1] * arreglo2[indice2];
        if (resultado[k] > 9) {
            resultado[k - 1] += resultado[k] / 10;
            resultado[k] %= 10;
        }

        // Llama recursivamente al método para continuar con la multiplicación
        multiplicacionAmericanaRecursivaDinamica(arreglo1, arreglo2, resultado, k - 1, indice1, indice2 + 1);
        multiplicacionAmericanaRecursivaDinamica(arreglo1, arreglo2, resultado, k - 1, indice1 + 1, indice2);
    }


    public ArrayList<Integer> AmericanaRecursivaDinamica(ArrayList<Integer> arreglo1, ArrayList<Integer> arreglo2) {
        ArrayList<Integer> resultado = new ArrayList<>();  // ArrayList para almacenar el resultado
        multiplicacionAmericanaRecursiva(arreglo1, arreglo2, resultado, 0, 0);  // Llama al método helper recursivo
        return resultado;  // Retorna el resultado de la multiplicación
    }

    // Método helper recursivo para la multiplicación americana
    private void multiplicacionAmericanaRecursiva(ArrayList<Integer> arreglo1, ArrayList<Integer> arreglo2, ArrayList<Integer> resultado, int i, int j) {
        // Caso base: si alguno de los índices llega al final del arreglo, termina la recursión
        if (i == arreglo1.size() || j == arreglo2.size()) {
            return;
        }

        // Si el tamaño del resultado es menor o igual a i + j, agrega un cero al resultado
        if (resultado.size() <= i + j) {
            resultado.add(0);
        }

        // Realiza la multiplicación y suma el resultado al valor actual en resultado
        int multiplicacion = arreglo1.get(i) * arreglo2.get(j);
        int suma = multiplicacion + resultado.get(i + j);

        resultado.set(i + j, suma % 10);  // Guarda la parte baja de la suma en resultado

        // Si el tamaño del resultado es menor o igual a i + j + 1, agrega un cero al resultado
        if (resultado.size() <= i + j + 1) {
            resultado.add(0);
        }

        resultado.set(i + j + 1, resultado.get(i + j + 1) + suma / 10);  // Guarda la parte alta de la suma en resultado

        // Llamadas recursivas para avanzar en los arreglos
        multiplicacionAmericanaRecursiva(arreglo1, arreglo2, resultado, i, j + 1);  // Siguiente iteración en arreglo2
        multiplicacionAmericanaRecursiva(arreglo1, arreglo2, resultado, i + 1, j);  // Siguiente iteración en arreglo1
    }


}
