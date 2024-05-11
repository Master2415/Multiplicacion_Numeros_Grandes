package Algoritmos;

import java.util.Arrays;

public class DivideVenceras_2 {

    public static int[] multiplicarDV2(int[] a, int[] b) {
        // Obtiene el tamaño máximo entre los arreglos a y b
        int n = Math.max(a.length, b.length);
        // Caso base: si n es igual a 1, multiplica directamente los dígitos
        if (n == 1) {
            return new int[]{a[0] * b[0]};  // Retorna el producto de los dígitos
        }
        // Calcula la mitad del tamaño de los arreglos
        int m = (n + 1) / 2;

        // Divide los arreglos a y b en partes bajas y altas
        int[] aLow = Arrays.copyOfRange(a, 0, Math.min(m, a.length));  // Parte baja de a
        int[] aHigh = Arrays.copyOfRange(a, Math.min(m, a.length), a.length);  // Parte alta de a
        int[] bLow = Arrays.copyOfRange(b, 0, Math.min(m, b.length));  // Parte baja de b
        int[] bHigh = Arrays.copyOfRange(b, Math.min(m, b.length), b.length);  // Parte alta de b

        // Multiplica recursivamente las partes bajas y altas de a y b
        int[] p = multiplicarDV2(aLow, bLow);  // Producto de las partes bajas
        int[] q = multiplicarDV2(aHigh, bHigh);  // Producto de las partes altas
        int[] r = multiplicarDV2(sum(aLow, aHigh), sum(bLow, bHigh));  // Producto de las sumas de a y b
        int[] rpq = subtract(subtract(r, p), q);  // Resta de r - p - q

        // Combina los resultados en el arreglo final
        int[] result = new int[2 * n];  // Tamaño del resultado final
        System.arraycopy(p, 0, result, 0, p.length);  // Copia la parte baja del producto
        System.arraycopy(rpq, 0, result, m, rpq.length);  // Copia la resta r - p - q
        System.arraycopy(q, 0, result, 2 * m, q.length);  // Copia la parte alta del producto
        return result;  // Retorna el resultado final de la multiplicación
    }

    // Método para sumar dos arreglos de dígitos
    private static int[] sum(int[] a, int[] b) {
        // Obtiene la longitud máxima entre los arreglos a y b
        int n = Math.max(a.length, b.length);
        int[] result = new int[n];  // Arreglo para almacenar el resultado de la suma
        int carry = 0;  // Inicializa el acarreo en 0

        // Recorre los arreglos a y b y realiza la suma dígito a dígito
        for (int i = 0; i < n; i++) {
            int x = getDigit(a, i) + getDigit(b, i) + carry;  // Suma los dígitos y el acarreo anterior
            result[i] = x % 10;  // Guarda el dígito de las unidades en el resultado
            carry = x / 10;  // Actualiza el acarreo para la siguiente posición
        }

        // Si hay un acarreo al final, agrega un dígito adicional al resultado
        if (carry != 0) {
            result = Arrays.copyOf(result, n + 1);  // Crea un nuevo arreglo con un dígito más
            result[n] = carry;  // Asigna el acarreo al último dígito del resultado
        }

        return result;  // Retorna el resultado de la suma
    }

    // Método para restar dos arreglos de dígitos
    private static int[] subtract(int[] a, int[] b) {
        // Obtiene la longitud máxima entre los arreglos a y b
        int n = Math.max(a.length, b.length);
        int[] result = new int[n];  // Arreglo para almacenar el resultado de la resta
        int borrow = 0;  // Inicializa el "préstamo" en 0

        // Recorre los arreglos a y b y realiza la resta dígito a dígito
        for (int i = 0; i < n; i++) {
            int x = getDigit(a, i) - getDigit(b, i) - borrow;  // Resta los dígitos y el "préstamo" anterior
            if (x < 0) {
                x += 10;  // Si el resultado es negativo, suma 10 al resultado
                borrow = 1;  // Marca que se ha tomado prestado 1
            } else {
                borrow = 0;  // No se toma prestado
            }
            result[i] = x;  // Guarda el resultado en el arreglo de resultado
        }

        // Elimina los ceros no significativos al final del resultado
        while (result.length > 1 && result[result.length - 1] == 0) {
            result = Arrays.copyOf(result, result.length - 1);  // Reduce el tamaño del arreglo
        }

        return result;  // Retorna el resultado de la resta
    }

    // Método para obtener un dígito de un arreglo en una posición específica
    private static int getDigit(int[] a, int i) {
        if (i < a.length) {
            return a[i];  // Si la posición i está dentro del rango del arreglo, devuelve el dígito en esa posición
        } else {
            return 0;  // Si la posición i está fuera del rango del arreglo, devuelve 0 (dígito nulo)
        }
    }


}
