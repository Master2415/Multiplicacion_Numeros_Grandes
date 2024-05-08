package Algoritmos;

public class American_Iterativo_estatico {

    public static long[] americanaIterativoEstatico(long[] arreglo1, long[] arreglo2) {
        // Se crea un arreglo para almacenar el resultado de la multiplicación.
        long[] resultado = new long[arreglo1.length + arreglo2.length];

        // Se utiliza un bucle for para iterar a través de los elementos del arreglo2 en orden inverso.
        for (int i = arreglo2.length - 1; i >= 0; i--) {
            // Dentro del primer bucle, se utiliza otro bucle for para iterar a través de los elementos del arreglo1 en orden inverso.
            for (int j = arreglo1.length - 1; j >= 0; j--) {
                // Se realiza la multiplicación de los elementos correspondientes de arreglo1 y arreglo2, y se suma al resultado en la posición adecuada.
                resultado[i + j + 1] += arreglo1[j] * arreglo2[i];

                // Se ajusta el acarreo sumando el cociente de la división del elemento en la posición actual del resultado entre 10 a la posición anterior.
                resultado[i + j] += (resultado[i + j + 1] / 10);

                // Se obtiene el residuo de la división del elemento en la posición actual del resultado entre 10 para mantener solo la cifra en esa posición.
                resultado[i + j + 1] %= 10;
            }
        }

        // Se devuelve el arreglo que contiene el resultado de la multiplicación.
        return resultado;
    }


}
