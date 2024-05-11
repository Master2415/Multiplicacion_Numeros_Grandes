package Algoritmos;

public class Inglesa_Recursiva_Estatica {

    public static int[] multiplicaInglesaRecursivoEstatico(int[] arreglo1, int[] arreglo2) {
        // Calcula el tamaño del resultado
        int tam = arreglo1.length + arreglo2.length;
        // Inicializa el arreglo de resultado
        int[] resultado = new int[tam];

        // Llama al método recursivo para realizar la multiplicación
        multiplicacionRecursivaEstatica(arreglo1, arreglo2, resultado, 0, 0);

        // Retorna el arreglo resultado
        return resultado;
    }

    // Método recursivo para multiplicación
    private static void multiplicacionRecursivaEstatica(int[] arreglo1, int[] arreglo2, int[] resultado, int indice1, int indice2) {
        // Si se alcanza el final de uno de los arreglos, se detiene la recursión
        if (indice2 == arreglo2.length) {
            return;
        }

        // Realiza la multiplicación y suma el resultado al índice correspondiente en resultado
        for (int j = 0; j < arreglo1.length; j++) {
            resultado[indice2 + j + 1] += arreglo1[j] * arreglo2[indice2];
        }

        // Llama recursivamente al método para continuar con la multiplicación
        multiplicacionRecursivaEstatica(arreglo1, arreglo2, resultado, indice1, indice2 + 1);

        // Realiza la corrección de los valores del arreglo resultado para que cada posición tenga un dígito
        for (int k = resultado.length - 1; k > 0; k--) {
            resultado[k - 1] += resultado[k] / 10;
            resultado[k] %= 10;
        }
    }

}
