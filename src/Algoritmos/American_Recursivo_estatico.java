package Algoritmos;

public class American_Recursivo_estatico {

    public static int[] americanoRecursivoEstatico(int[] arreglo1, int[] arreglo2) {
        // Calcula la longitud del resultado
        int k = arreglo1.length + arreglo2.length - 1;
        // Inicializa el arreglo de resultado
        int[] resultado = new int[arreglo1.length + arreglo2.length];

        // Llama al método recursivo para realizar la multiplicación americana
        multiplicacionAmericanaRecursivaEstatica(arreglo1, arreglo2, resultado, k, 0, 0);

        return resultado;
    }

    // Método recursivo para multiplicación americana
    private static void multiplicacionAmericanaRecursivaEstatica(int[] arreglo1, int[] arreglo2, int[] resultado, int k, int indice1, int indice2) {
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
        multiplicacionAmericanaRecursivaEstatica(arreglo1, arreglo2, resultado, k - 1, indice1, indice2 + 1);
        multiplicacionAmericanaRecursivaEstatica(arreglo1, arreglo2, resultado, k - 1, indice1 + 1, indice2);
    }


}
