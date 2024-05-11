package Algoritmos;

public class American_Iterativo_estatico {

    public static int[] americanoIterativoEstatico(int[] arreglo1, int[] arreglo2) {
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


}
