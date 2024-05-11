package Algoritmos;

import java.util.ArrayList;
import java.util.Collections;

public class Inglesa_Iterativo_Dinamico {

    public int[] multiplicaInglesaIterativoDinamico(int[] arreglo1, int[] arreglo2) {
        // Calcula el tamaño del resultado
        int tam = arreglo1.length + arreglo2.length;
        // Inicializa el arreglo de resultado
        int[] resultado = new int[tam];

        // Itera sobre los elementos del segundo arreglo
        for (int i = 0; i < arreglo2.length; i++) {
            // Itera sobre los elementos del primer arreglo
            for (int j = 0; j < arreglo1.length; j++) {
                // Realiza la multiplicación y suma el resultado al índice correspondiente en resultado
                resultado[i + j + 1] += arreglo1[j] * arreglo2[i];
            }
        }

        // Realiza la corrección de los valores del arreglo resultado para que cada posición tenga un dígito
        for (int k = tam - 1; k > 0; k--) {
            resultado[k - 1] += resultado[k] / 10;
            resultado[k] %= 10;
        }

        // Retorna el arreglo resultado
        return resultado;
    }

    // Método que realiza la "multiplicación inglesa dinámica" de dos ArrayLists de enteros y devuelve el resultado como otro ArrayList de enteros.
    public ArrayList<Integer> multiplicacionInglesaDinamica(ArrayList<Integer> arreglo1, ArrayList<Integer> arreglo2) {
        // Calcula el tamaño necesario para el resultado sumando los tamaños de los dos arreglos de entrada.
        int tam = arreglo1.size() + arreglo2.size();
        // Crea un nuevo ArrayList llamado resultado, lleno de ceros, con un tamaño igual a tam.
        ArrayList<Integer> resultado = new ArrayList<>(Collections.nCopies(tam, 0));

        // Bucle que itera desde el último índice de arreglo2 hasta el primero (de derecha a izquierda).
        for (int i = arreglo2.size() - 1; i >= 0; i--) {
            // Bucle anidado que itera desde el último índice de arreglo1 hasta el primero (de derecha a izquierda).
            for (int j = arreglo1.size() - 1; j >= 0; j--) {
                // Actualiza el elemento en la posición i + j + 1 de resultado.
                // Multiplica el elemento actual de arreglo1 por el elemento actual de arreglo2 y suma al valor actual de resultado.
                resultado.set(i + j + 1, resultado.get(i + j + 1) + arreglo1.get(j) * arreglo2.get(i));
            }
        }

        // Bucle que ajusta el acarreo y actualiza cada dígito del resultado.
        for (int k = tam - 1; k > 0; k--) {
            // Ajusta el valor en la posición k - 1 de resultado sumándole la división entera del valor en la posición k de resultado entre 10.
            resultado.set(k - 1, resultado.get(k - 1) + resultado.get(k) / 10);
            // Actualiza el valor en la posición k de resultado tomando el residuo de dividir entre 10 el valor en esa misma posición.
            resultado.set(k, resultado.get(k) % 10);
        }

        // Devuelve el ArrayList resultado con el resultado final de la multiplicación.
        return resultado;
    }

}
