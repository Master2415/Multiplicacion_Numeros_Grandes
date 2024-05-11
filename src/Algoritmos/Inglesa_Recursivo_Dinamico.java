package Algoritmos;

import java.util.ArrayList;

public class Inglesa_Recursivo_Dinamico {

    public int[] multiplicaInglesaRecursivoDinamico(int[] arreglo1, int[] arreglo2) {
        // Calcula el tamaño del resultado
        int tam = arreglo1.length + arreglo2.length;
        // Inicializa el arreglo de resultado
        int[] resultado = new int[tam];

        // Llama al método recursivo para realizar la multiplicación
        multiplicacionRecursivaDinamica(arreglo1, arreglo2, resultado, 0, 0);

        // Retorna el arreglo resultado
        return resultado;
    }

    // Método recursivo para multiplicación
    private void multiplicacionRecursivaDinamica(int[] arreglo1, int[] arreglo2, int[] resultado, int indice1, int indice2) {
        // Si se alcanza el final de uno de los arreglos, se detiene la recursión
        if (indice2 == arreglo2.length) {
            return;
        }

        // Realiza la multiplicación y suma el resultado al índice correspondiente en resultado
        for (int j = 0; j < arreglo1.length; j++) {
            resultado[indice2 + j + 1] += arreglo1[j] * arreglo2[indice2];
        }

        // Llama recursivamente al método para continuar con la multiplicación
        multiplicacionRecursivaDinamica(arreglo1, arreglo2, resultado, indice1, indice2 + 1);

        // Realiza la corrección de los valores del arreglo resultado para que cada posición tenga un dígito
        for (int k = resultado.length - 1; k > 0; k--) {
            resultado[k - 1] += resultado[k] / 10;
            resultado[k] %= 10;
        }
    }

    // Método principal que realiza la multiplicación inglesa de dos ArrayLists de enteros de manera recursiva y dinámica.
    public ArrayList<Integer> multiplicaInglesaRecursivaDinamico(ArrayList<Integer> arreglo1, ArrayList<Integer> arreglo2) {
        // Calcula el tamaño necesario para el resultado sumando los tamaños de los dos arreglos de entrada.
        int tam = arreglo1.size() + arreglo2.size();
        // Crea un nuevo ArrayList llamado resultado para almacenar el resultado final.
        ArrayList<Integer> resultado = new ArrayList<>();
        // Inicializa el ArrayList resultado con ceros, según el tamaño calculado.
        for (int i = 0; i < tam; i++) {
            resultado.add(0);
        }

        // Llama a la función auxiliar para realizar la multiplicación inglesa de manera recursiva.
        multiplicaInglesaRecursivaHelper(arreglo1, arreglo2, resultado, arreglo2.size() - 1, arreglo1.size() - 1);
        // Ajusta el resultado final para eliminar acarreos.
        ajustarResultado(resultado);
        // Devuelve el ArrayList resultado con el resultado final de la multiplicación.
        return resultado;
    }

    // Función auxiliar recursiva para realizar la multiplicación inglesa.
    private void multiplicaInglesaRecursivaHelper(ArrayList<Integer> arreglo1, ArrayList<Integer> arreglo2, ArrayList<Integer> resultado, int i, int j) {
        // Caso base: si i es menor que 0, se termina la recursión.
        if (i < 0) {
            return;
        }

        // Si j es mayor o igual a 0, realiza la multiplicación y la suma al resultado en la posición correspondiente.
        if (j >= 0) {
            resultado.set(i + j + 1, resultado.get(i + j + 1) + arreglo1.get(j) * arreglo2.get(i));
            // Llama recursivamente a la función con j decrementado.
            multiplicaInglesaRecursivaHelper(arreglo1, arreglo2, resultado, i, j - 1);
        } else {
            // Si j es menor que 0, pasa al siguiente nivel de la multiplicación llamando recursivamente con i decrementado.
            multiplicaInglesaRecursivaHelper(arreglo1, arreglo2, resultado, i - 1, arreglo1.size() - 1);
        }
    }

    // Función para ajustar el resultado final, eliminando acarreos.
    private void ajustarResultado(ArrayList<Integer> resultado) {
        // Itera sobre el resultado desde el final para ajustar los dígitos y eliminar acarreos.
        for (int k = resultado.size() - 1; k > 0; k--) {
            resultado.set(k - 1, resultado.get(k - 1) + resultado.get(k) / 10);
            resultado.set(k, resultado.get(k) % 10);
        }
    }


}
