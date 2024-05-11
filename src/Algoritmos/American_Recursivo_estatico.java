package Algoritmos;

public class American_Recursivo_estatico {

    public static int[] americanaRecursivoEstatico(int[] arreglo1, int[] arreglo2) {
        // Se crea un arreglo para almacenar el resultado de la multiplicación.
        int[] resultado = new int[arreglo1.length + arreglo2.length];
        // Se llama al método auxiliar para realizar la multiplicación recursiva.
        multiplicacionAmericanaRecursiva(arreglo1, arreglo2, resultado, 0, 0);
        // Se devuelve el arreglo con el resultado de la multiplicación.
        return resultado;
    }

    // Método auxiliar para realizar la multiplicación de manera recursiva y estática.
    private static void multiplicacionAmericanaRecursiva(int[] arreglo1, int[] arreglo2, int[] resultado, int i, int j) {
        // Caso base: Si alguno de los índices llega al final del arreglo, se detiene la recursión.
        if (i == arreglo1.length || j == arreglo2.length) {
            return;
        }

        // Se calcula el producto y se suma al resultado en la posición adecuada.
        resultado[i + j] += arreglo1[i] * arreglo2[j];
        // Si el resultado en la posición actual es mayor o igual a 10, se ajusta el acarreo.
        resultado[i + j + 1] += resultado[i + j] / 10;
        resultado[i + j] %= 10;

        // Llamada recursiva para continuar con la multiplicación en las siguientes posiciones.
        multiplicacionAmericanaRecursiva(arreglo1, arreglo2, resultado, i, j + 1);  // Avanza en arreglo2.
        multiplicacionAmericanaRecursiva(arreglo1, arreglo2, resultado, i + 1, j);  // Avanza en arreglo1.
    }


}
