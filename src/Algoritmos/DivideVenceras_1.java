package Algoritmos;

import java.util.Arrays;

public class DivideVenceras_1 {

    public int[] multiplicarDV1(int[] a, int[] b) {
        int n = a.length;  // Obtiene la longitud de uno de los arreglos (ambos deben tener la misma longitud)

        // Caso base: si ambos arreglos tienen una sola cifra, hacer la multiplicación directamente
        if (n == 1) {
            int[] resultado = new int[2];  // Arreglo para almacenar el resultado (con dos dígitos)
            resultado[1] = a[0] * b[0];  // Multiplica los dígitos y guarda el resultado en la segunda posición
            resultado[0] = resultado[1] / 10;  // Obtiene la parte alta del resultado
            resultado[1] = resultado[1] % 10;  // Obtiene la parte baja del resultado
            return resultado;  // Retorna el resultado de la multiplicación
        }

        // Dividir los arreglos en dos mitades
        int[] w = Arrays.copyOfRange(a, 0, n / 2);  // Parte alta de a
        int[] x = Arrays.copyOfRange(a, n / 2, n);  // Parte baja de a
        int[] y = Arrays.copyOfRange(b, 0, n / 2);  // Parte alta de b
        int[] z = Arrays.copyOfRange(b, n / 2, n);  // Parte baja de b

        // Multiplicar las mitades y sumar los resultados
        int[] wy = multiplicarDV1(w, y);  // Multiplicación de la parte alta de a y b
        int[] wz = multiplicarDV1(w, z);  // Multiplicación de la parte alta de a y la parte baja de b
        int[] xy = multiplicarDV1(x, y);  // Multiplicación de la parte baja de a y la parte alta de b
        int[] xz = multiplicarDV1(x, z);  // Multiplicación de la parte baja de a y b

        // Desplazar los resultados
        int[] resultado = new int[n * 2];  // Arreglo para almacenar el resultado de la multiplicación
        for (int i = 0; i < wy.length; i++) {
            resultado[i] += wy[i];  // Suma la multiplicación de la parte alta de a y b
        }
        for (int i = 0; i < wz.length; i++) {
            resultado[i + n / 2] += wz[i];  // Suma la multiplicación de la parte alta de a y la parte baja de b
        }
        for (int i = 0; i < xy.length; i++) {
            resultado[i + n / 2] += xy[i];  // Suma la multiplicación de la parte baja de a y la parte alta de b
        }
        for (int i = 0; i < xz.length; i++) {
            resultado[i + n] += xz[i];  // Suma la multiplicación de la parte baja de a y b
        }

        // Acarreos
        for (int i = 0; i < resultado.length - 1; i++) {
            resultado[i + 1] += resultado[i] / 10;  // Propaga los acarreos hacia la izquierda
            resultado[i] %= 10;  // Actualiza el dígito actual del resultado
        }

        // Eliminar ceros sobrantes
        int i = resultado.length - 1;
        while (i > 0 && resultado[i] == 0) {
            i--;  // Busca el último dígito no nulo en el resultado
        }
        int[] resultadoFinal = Arrays.copyOfRange(resultado, 0, i + 1);  // Crea un nuevo arreglo con el tamaño correcto
        return resultadoFinal;  // Retorna el resultado final de la multiplicación
    }

}
