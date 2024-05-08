package Model;

import Algoritmos.*;

import java.io.IOException;

public class Metodos_Accion {

    Arreglo arreglo = new Arreglo();

    public void x_AmericanIterativo_estatico() throws IOException {

            for (int i = 1; i <= 3; i++) {
                String rutaArreglo1 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".1.txt";
                String rutaArreglo2 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".2.txt";

                long[] arreglo1 = arreglo.leerArreglo(rutaArreglo1);
                long[] arreglo2 = arreglo.leerArreglo(rutaArreglo2);

                long[] resultadoMultiplicacion = American_Iterativo_estatico.americanaIterativoEstatico(arreglo1, arreglo2);

                // Guardar el resultado de la multiplicación en un archivo
                String numeroResultado = i + ".resultado";
                //arreglo.guardarArreglos(resultadoMultiplicacion, numeroResultado);
            }

    }
}
