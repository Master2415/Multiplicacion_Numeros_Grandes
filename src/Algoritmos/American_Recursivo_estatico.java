package Algoritmos;

public class American_Recursivo_estatico {

    public static int[] americanaRecursivoEstatico(int[] arreglo1, int[] arreglo2) {
        // Se crea un arreglo para almacenar el resultado de la multiplicación.
        int[] resultado = new int[arreglo1.length + arreglo2.length];
        // Se llama al método auxiliar para realizar la multiplicación recursiva.
        multiplicacionRecursiva(arreglo1, arreglo2, resultado, arreglo1.length - 1, arreglo2.length - 1, resultado.length - 1);
        // Se devuelve el arreglo con el resultado de la multiplicación.
        return resultado;
    }

    // Método auxiliar para realizar la multiplicación de manera recursiva.
    private static void multiplicacionRecursiva(int[] arreglo1, int[] arreglo2, int[] resultado, int i, int j, int k) {
        // Caso base: Si alguno de los índices es menor que 0, se detiene la recursión.
        if (i < 0 || j < 0) {
            return;
        }
        // Se calcula el producto y se suma al resultado en la posición k.
        resultado[k] = resultado[k] + arreglo1[i] * arreglo2[j];
        // Si el resultado en la posición k es mayor que 9, se ajusta el acarreo.
        if (resultado[k] > 9) {
            resultado[k - 1] += resultado[k] / 10;  // Se suma el cociente a la posición anterior.
            resultado[k] = resultado[k] % 10;      // Se obtiene el residuo para mantener solo la cifra en k.
        }
        // Llamada recursiva para continuar con la multiplicación.
        multiplicacionRecursiva(arreglo1, arreglo2, resultado, i, j - 1, k - 1);  // Avanza en arreglo2.
        multiplicacionRecursiva(arreglo1, arreglo2, resultado, i - 1, arreglo2.length - 1, k);  // Avanza en arreglo1.
    }

}
