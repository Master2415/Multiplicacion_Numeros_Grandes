package Model;

import Algoritmos.*;

import java.io.IOException;


public class Metodos_Accion {

    Arreglo arreglo = new Arreglo();
    American_Iterativo_dinamico americanIterativoDinamico = new American_Iterativo_dinamico();
    American_Recursivo_dinamico americanRecursivoDinamico = new American_Recursivo_dinamico();
    Inglesa_Iterativo_Dinamico inglesaIterativoDinamico = new Inglesa_Iterativo_Dinamico();
    Inglesa_Recursivo_Dinamico inglesaRecursivoDinamico = new Inglesa_Recursivo_Dinamico();
    DivideVenceras_1 DivideVenceras_1 = new DivideVenceras_1();
    Hindu_Iterativo HinduIterativo = new Hindu_Iterativo();

    public void x_AmericanIterativo_estatico() throws IOException {

            for (int i = 1; i <= 3; i++) {
                String rutaArreglo1 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".1.txt";
                String rutaArreglo2 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".2.txt";

                int[] arreglo1 = arreglo.leerArreglo(rutaArreglo1);
                int[] arreglo2 = arreglo.leerArreglo(rutaArreglo2);

                int[] resultadoMultiplicacion = American_Iterativo_estatico.americanoIterativoEstatico(arreglo1, arreglo2);

                // Guardar el resultado de la multiplicación en un archivo
                String numeroResultado = i + ".resultado";
                //arreglo.guardarArreglos(resultadoMultiplicacion, numeroResultado);
            }
    }

    public void x_AmericanIterativo_dinamico() throws IOException {

        for (int i = 1; i <= 3; i++) {
            String rutaArreglo1 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".1.txt";
            String rutaArreglo2 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".2.txt";

            int[] arreglo1 = arreglo.leerArreglo(rutaArreglo1);
            int[] arreglo2 = arreglo.leerArreglo(rutaArreglo2);

            int[] resultadoMultiplicacion = americanIterativoDinamico.americanoIterativoDinamico(arreglo1, arreglo2);

            // Guardar el resultado de la multiplicación en un archivo
            String numeroResultado = i + ".resultado";
            //arreglo.guardarArreglos(resultadoMultiplicacion, numeroResultado);
        }
    }

    public void x_AmericanRecursivo_estatico() throws IOException {

        for (int i = 1; i <= 3; i++) {
            String rutaArreglo1 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".1.txt";
            String rutaArreglo2 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".2.txt";

            int[] arreglo1 = arreglo.leerArreglo(rutaArreglo1);
            int[] arreglo2 = arreglo.leerArreglo(rutaArreglo2);

            int[] resultadoMultiplicacion = American_Recursivo_estatico.americanoRecursivoEstatico(arreglo1, arreglo2);

            // Guardar el resultado de la multiplicación en un archivo
            String numeroResultado = i + ".resultado";
            //arreglo.guardarArreglos(resultadoMultiplicacion, numeroResultado);
        }
    }

    public void x_AmericanRecursivo_dinamico() throws IOException {

        for (int i = 1; i <= 3; i++) {
            String rutaArreglo1 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".1.txt";
            String rutaArreglo2 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".2.txt";

            int[] arreglo1 = arreglo.leerArreglo(rutaArreglo1);
            int[] arreglo2 = arreglo.leerArreglo(rutaArreglo2);

            int[] resultadoMultiplicacion = americanRecursivoDinamico.americanoRecursivoDinamico(arreglo1, arreglo2);

            // Guardar el resultado de la multiplicación en un archivo
            String numeroResultado = i + ".resultado";
            //arreglo.guardarArreglos(resultadoMultiplicacion, numeroResultado);
        }
    }

    public void x_Inglesa_Iterativo_Estatico() throws IOException {

        for (int i = 1; i <= 3; i++) {
            String rutaArreglo1 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".1.txt";
            String rutaArreglo2 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".2.txt";

            int[] arreglo1 = arreglo.leerArreglo(rutaArreglo1);
            int[] arreglo2 = arreglo.leerArreglo(rutaArreglo2);

            int[] resultadoMultiplicacion = Inglesa_Iterativo_Estatico.multiplicaInglesaIterativoEstatico(arreglo1, arreglo2);

            // Guardar el resultado de la multiplicación en un archivo
            String numeroResultado = i + ".resultado";
            //arreglo.guardarArreglos(resultadoMultiplicacion, numeroResultado);
        }
    }

    public void x_Inglesa_Iterativo_Dinamico() throws IOException {

        for (int i = 1; i <= 3; i++) {
            String rutaArreglo1 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".1.txt";
            String rutaArreglo2 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".2.txt";

            int[] arreglo1 = arreglo.leerArreglo(rutaArreglo1);
            int[] arreglo2 = arreglo.leerArreglo(rutaArreglo2);

            int[] resultadoMultiplicacion = inglesaIterativoDinamico.multiplicaInglesaIterativoDinamico(arreglo1, arreglo2);

            // Guardar el resultado de la multiplicación en un archivo
            String numeroResultado = i + ".resultado";
            //arreglo.guardarArreglos(resultadoMultiplicacion, numeroResultado);
        }
    }

    public void x_Inglesa_Recursiva_Estatica() throws IOException {

        for (int i = 1; i <= 3; i++) {
            String rutaArreglo1 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".1.txt";
            String rutaArreglo2 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".2.txt";

            int[] arreglo1 = arreglo.leerArreglo(rutaArreglo1);
            int[] arreglo2 = arreglo.leerArreglo(rutaArreglo2);

            int[] resultadoMultiplicacion = Inglesa_Iterativo_Estatico.multiplicaInglesaIterativoEstatico(arreglo1, arreglo2);

            // Guardar el resultado de la multiplicación en un archivo
            String numeroResultado = i + ".resultado";
            //arreglo.guardarArreglos(resultadoMultiplicacion, numeroResultado);
        }
    }

    public void x_Inglesa_Recursivo_Dinamico() throws IOException {

        for (int i = 1; i <= 3; i++) {
            String rutaArreglo1 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".1.txt";
            String rutaArreglo2 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".2.txt";

            int[] arreglo1 = arreglo.leerArreglo(rutaArreglo1);
            int[] arreglo2 = arreglo.leerArreglo(rutaArreglo2);

            int[] resultadoMultiplicacion = inglesaRecursivoDinamico.multiplicaInglesaRecursivoDinamico(arreglo1, arreglo2);

            // Guardar el resultado de la multiplicación en un archivo
            String numeroResultado = i + ".resultado";
            //arreglo.guardarArreglos(resultadoMultiplicacion, numeroResultado);
        }
    }

    public void x_Hindu_Iterativo_Estatica() throws IOException {

        for (int i = 1; i <= 3; i++) {
            String rutaArreglo1 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".1.txt";
            String rutaArreglo2 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".2.txt";

            int[] arreglo1 = arreglo.leerArreglo(rutaArreglo1);
            int[] arreglo2 = arreglo.leerArreglo(rutaArreglo2);

            int[] resultadoMultiplicacion = HinduIterativo.multiplicacionHindu(arreglo1, arreglo2);

            // Guardar el resultado de la multiplicación en un archivo
            String numeroResultado = i + ".resultado";
            //arreglo.guardarArreglos(resultadoMultiplicacion, numeroResultado);
        }
    }

    public void x_DivideVenceras_Estatico() throws IOException {

        for (int i = 1; i <= 3; i++) {
            String rutaArreglo1 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".1.txt";
            String rutaArreglo2 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".2.txt";

            int[] arreglo1 = arreglo.leerArreglo(rutaArreglo1);
            int[] arreglo2 = arreglo.leerArreglo(rutaArreglo2);

            int[] resultadoMultiplicacion = DivideVenceras_1.multiplicarDV1(arreglo1, arreglo2);

            // Guardar el resultado de la multiplicación en un archivo
            String numeroResultado = i + ".resultado";
            //arreglo.guardarArreglos(resultadoMultiplicacion, numeroResultado);
        }
    }

}
