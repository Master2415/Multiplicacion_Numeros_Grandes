package Algoritmos;

public class Hindu_Iterativo {

    public int[] multiplicacionHindu(int[] n1, int[] n2) {
        // Obtiene la longitud de los arreglos
        int n = n1.length;
        int m = n2.length;
        // Inicializa el arreglo de resultado con la longitud máxima posible
        int[] resultado = new int[n + m];

        // Itera sobre el primer arreglo n1
        for (int i = 0; i < n; i++) {
            // Inicializa el acarreo en 0 para cada dígito de n1
            int carry = 0;
            // Itera sobre el segundo arreglo n2
            for (int j = 0; j < m; j++) {
                // Calcula el producto del dígito actual de n1 con el dígito actual de n2
                // y suma el resultado previo y el acarreo
                int producto = n1[i] * n2[j] + resultado[i + j] + carry;
                // Asigna el dígito de las unidades del producto al resultado en la posición i+j
                resultado[i + j] = producto % 10;
                // Actualiza el acarreo con la parte entera del producto
                carry = producto / 10;
            }
            // Después de terminar la multiplicación con todos los dígitos de n2,
            // asigna el acarreo restante en la posición i+m del resultado
            resultado[i + m] = carry;
        }

        // Retorna el arreglo resultado que contiene el producto de n1 y n2
        return resultado;
    }

}
