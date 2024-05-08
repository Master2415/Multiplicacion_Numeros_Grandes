package Algoritmos;

public class American_Iterativo_dinamico {

    public static int[] americanaIterativoDinamico(int[] arreglo1, int[] arreglo2) {
        // Se calcula la longitud del arreglo resultado.
        int k = arreglo1.length + arreglo2.length - 1;
        // Se guarda la posición inicial para el ajuste dinámico de la posición k.
        int pos = arreglo1.length + arreglo2.length - 1;
        // Se crea un arreglo para almacenar el resultado de la multiplicación.
        int[] resultado = new int[arreglo1.length + arreglo2.length];

        // Bucle externo para recorrer los elementos de arreglo1 en orden inverso.
        for (int i = arreglo1.length - 1; i >= 0; i--) {
            // Bucle interno para recorrer los elementos de arreglo2 en orden inverso.
            for (int j = arreglo2.length - 1; j >= 0; j--) {
                // Se multiplica el elemento de arreglo1 con el elemento de arreglo2 y se suma al resultado en la posición k.
                resultado[k] = resultado[k] + arreglo1[i] * arreglo2[j];
                // Si el resultado en la posición k es mayor que 9, se ajusta el acarreo.
                if (resultado[k] > 9) {
                    resultado[k - 1] += resultado[k] / 10;  // Se suma el cociente a la posición anterior.
                    resultado[k] = resultado[k] % 10;      // Se obtiene el residuo para mantener solo la cifra en k.
                }
                k--;  // Se reduce la posición k para moverse hacia la izquierda en el arreglo resultado.
            }
            // Se reinicia la posición k para el siguiente ciclo de arreglo1 y se ajusta pos.
            k = pos;
            pos--;
            k--;  // Se reduce k adicionalmente para el siguiente ciclo de arreglo1.
        }

        // Se devuelve el arreglo que contiene el resultado de la multiplicación.
        return resultado;
    }

}
