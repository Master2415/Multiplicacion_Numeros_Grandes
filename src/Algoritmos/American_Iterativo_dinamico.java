package Algoritmos;

import java.util.ArrayList;
import java.util.Collections;

public class American_Iterativo_dinamico {

    // Metodo sin usar con el tipo de dato int de retorno
    public int[] americanoIterativoDinamico(int[] arreglo1, int[] arreglo2) {
        // Calcula la longitud del resultado
        int k = arreglo1.length + arreglo2.length - 1;
        // Variable para mantener la posición inicial
        int pos = arreglo1.length + arreglo2.length - 1;
        // Inicializa el arreglo de resultado
        int[] resultado = new int[arreglo1.length + arreglo2.length];

        // Itera sobre el primer arreglo en reversa
        for (int i = arreglo1.length - 1; i >= 0; i--) {
            // Itera sobre el segundo arreglo en reversa
            for (int j = arreglo2.length - 1; j >= 0; j--) {
                // Realiza la multiplicación y suma el resultado al índice correspondiente en resultado
                resultado[k] = resultado[k] + arreglo1[i] * arreglo2[j];
                // Verifica si hay acarreo
                if (resultado[k] > 9) {
                    // Realiza la corrección de acarreo
                    resultado[k - 1] += resultado[k] / 10;
                    resultado[k] = resultado[k] % 10;
                }
                k--; // Decrementa el índice de resultado
            }
            k = pos; // Reinicia la posición de resultado
            pos--; // Decrementa la posición inicial
            k--; // Decrementa el índice de resultado
        }

        // Retorna el arreglo resultado
        return resultado;
    }

    public ArrayList<Integer> multiplicacionAmericanaDinamica(ArrayList<Integer> arreglo1, ArrayList<Integer> arreglo2) {
        int m = arreglo1.size();  // Tamaño del primer arreglo
        int n = arreglo2.size();  // Tamaño del segundo arreglo
        ArrayList<Integer> resultado = new ArrayList<>(Collections.nCopies(m + n, 0));  // Inicializa el resultado con ceros

        for (int i = m - 1; i >= 0; i--) {  // Recorre el primer arreglo de derecha a izquierda
            for (int j = n - 1; j >= 0; j--) {  // Recorre el segundo arreglo de derecha a izquierda
                int multiplicacion = arreglo1.get(i) * arreglo2.get(j);  // Calcula la multiplicación de los dígitos
                int suma = multiplicacion + resultado.get(i + j + 1);  // Suma el producto con el valor actual en resultado

                resultado.set(i + j, resultado.get(i + j) + suma / 10);  // Agrega la parte alta de la suma al resultado
                resultado.set(i + j + 1, suma % 10);  // Guarda la parte baja de la suma en el resultado
            }
        }

        // Eliminar ceros no significativos al principio del resultado
        while (!resultado.isEmpty() && resultado.get(0) == 0) {
            resultado.remove(0);  // Remueve ceros del resultado
        }

        return resultado;  // Retorna el resultado de la multiplicación
    }

}
