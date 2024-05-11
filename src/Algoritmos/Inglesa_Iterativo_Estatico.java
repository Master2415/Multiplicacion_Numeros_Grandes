package Algoritmos;

public class Inglesa_Iterativo_Estatico {

    public static int[] multiplicaInglesaIterativoEstatico(int[] arreglo1, int[] arreglo2) {
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

}
