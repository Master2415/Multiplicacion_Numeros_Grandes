package Algoritmos;

public class American_Iterativo_estatico {

    // Metodo sin usar con retorno de tipo de variable int
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

    // Método que realiza la "multiplicación americana" de dos arreglos de enteros y devuelve el resultado como un arreglo de enteros.
    public static int[] multiplicacionAmericanaEstatico(int arreglo1[], int arreglo2[]) {
        // Crea un nuevo arreglo para almacenar el resultado de la multiplicación, con tamaño igual a la suma de los tamaños de arreglo1 y arreglo2.
        int resultado[] = new int[arreglo1.length + arreglo2.length];

        // Bucle externo que itera desde el último índice de arreglo2 hasta el primero (de derecha a izquierda).
        for (int i = arreglo2.length - 1; i >= 0; i--) {
            // Bucle interno que itera desde el último índice de arreglo1 hasta el primero (de derecha a izquierda).
            for (int j = arreglo1.length - 1; j >= 0; j--) {
                // Multiplica los elementos correspondientes de arreglo1 y arreglo2, y suma el resultado al elemento correspondiente en resultado.
                resultado[i + j + 1] += arreglo1[j] * arreglo2[i];
                // Añade el acarreo al elemento anterior en resultado.
                resultado[i + j] += (resultado[i + j + 1] / 10);
                // Actualiza el dígito en la posición i + j + 1 de resultado tomando el residuo de dividir entre 10 el valor en esa misma posición.
                resultado[i + j + 1] %= 10;
            }
        }
        // Devuelve el arreglo resultado con el resultado final de la multiplicación americana.
        return resultado;
    }



}
