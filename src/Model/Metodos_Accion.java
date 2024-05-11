package Model;

import Algoritmos.*;

import java.io.IOException;
import java.util.ArrayList;


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

                int[] resultadoMultiplicacion = American_Iterativo_estatico.multiplicacionAmericanaEstatico(arreglo1, arreglo2);

                // Guardar el resultado de la multiplicación en un archivo
                String numeroResultado = i + ".resultado";
                //arreglo.guardarArreglos(resultadoMultiplicacion, numeroResultado);
            }
    }

    public void x_AmericanIterativo_dinamico() throws IOException {
        for (int i = 1; i <= 3; i++) {
            String rutaArreglo1 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".1.txt";
            String rutaArreglo2 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".2.txt";

            ArrayList<Integer>[] arreglo1 = arreglo.leerArreglo2(rutaArreglo1);  // Leer arreglo 1
            ArrayList<Integer>[] arreglo2 = arreglo.leerArreglo2(rutaArreglo2);  // Leer arreglo 2

            ArrayList<Integer> resultadoMultiplicacion = new ArrayList<>();  // ArrayList para almacenar el resultado

            // Multiplicar los arreglos de manera iterativa y dinámica
            for (int j = 0; j < arreglo1.length; j++) {
                for (int k = 0; k < arreglo2.length; k++) {
                    ArrayList<Integer> resultadoTemp = americanIterativoDinamico.multiplicacionAmericanaDinamica(arreglo1[j], arreglo2[k]);
                    // Sumar los resultados temporales al resultado final
                    resultadoMultiplicacion = sumaArreglos(resultadoMultiplicacion, resultadoTemp);
                }
            }

            // Guardar el resultado de la multiplicación en un archivo
            String numeroResultado = i + ".resultado";
            // arreglo.guardarArreglos(resultadoMultiplicacion, numeroResultado);
        }
    }

    public void x_AmericanRecursivo_estatico() throws IOException {

        for (int i = 1; i <= 3; i++) {
            String rutaArreglo1 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".1.txt";
            String rutaArreglo2 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".2.txt";

            int[] arreglo1 = arreglo.leerArreglo(rutaArreglo1);
            int[] arreglo2 = arreglo.leerArreglo(rutaArreglo2);

            int[] resultadoMultiplicacion = American_Recursivo_estatico.americanaRecursivoEstatico(arreglo1, arreglo2);

            // Guardar el resultado de la multiplicación en un archivo
            String numeroResultado = i + ".resultado";
            //arreglo.guardarArreglos(resultadoMultiplicacion, numeroResultado);
        }
    }

    public void x_AmericanRecursivo_dinamico() throws IOException {
        for (int i = 1; i <= 3; i++) {
            String rutaArreglo1 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".1.txt";
            String rutaArreglo2 = "C:/ALL/Codigos/WS_Java/Analisis_Algoritmos/Multiplicacion_Numeros_Grandes/src/Persistencia/arreglo " + i + ".2.txt";

            ArrayList<Integer>[] arreglo1 = arreglo.leerArreglo2(rutaArreglo1);  // Leer arreglo 1
            ArrayList<Integer>[] arreglo2 = arreglo.leerArreglo2(rutaArreglo2);  // Leer arreglo 2

            ArrayList<Integer> resultadoMultiplicacion = new ArrayList<>();  // ArrayList para almacenar el resultado

            // Multiplicar los arreglos de manera recursiva y dinámica
            for (int j = 0; j < arreglo1.length; j++) {
                for (int k = 0; k < arreglo2.length; k++) {
                    ArrayList<Integer> resultadoTemp = americanRecursivoDinamico.AmericanaRecursivaDinamica(arreglo1[j], arreglo2[k]);
                    // Sumar los resultados temporales al resultado final
                    resultadoMultiplicacion = sumaArreglos(resultadoMultiplicacion, resultadoTemp);
                }
            }

            // Guardar el resultado de la multiplicación en un archivo
            String numeroResultado = i + ".resultado";
            // arreglo.guardarArreglos(resultadoMultiplicacion, numeroResultado);
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

            ArrayList<Integer>[] arreglo1 = arreglo.leerArreglo2(rutaArreglo1);  // Leer arreglo 1
            ArrayList<Integer>[] arreglo2 = arreglo.leerArreglo2(rutaArreglo2);  // Leer arreglo 2

            ArrayList<Integer> resultadoMultiplicacion = new ArrayList<>();  // ArrayList para almacenar el resultado

            // Multiplicar los arreglos de manera iterativa y dinámica
            for (int j = 0; j < arreglo2.length; j++) {
                for (int k = 0; k < arreglo1.length; k++) {
                    ArrayList<Integer> resultadoTemp = inglesaIterativoDinamico.multiplicacionInglesaDinamica(arreglo1[k], arreglo2[j]);
                    // Sumar los resultados temporales al resultado final
                    resultadoMultiplicacion = sumaArreglos(resultadoMultiplicacion, resultadoTemp);
                }
            }

            // Guardar el resultado de la multiplicación en un archivo
            String numeroResultado = i + ".resultado";
            // arreglo.guardarArreglos(resultadoMultiplicacion, numeroResultado);
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

            ArrayList<Integer>[] arreglo1 = arreglo.leerArreglo2(rutaArreglo1);  // Leer arreglo 1
            ArrayList<Integer>[] arreglo2 = arreglo.leerArreglo2(rutaArreglo2);  // Leer arreglo 2

            ArrayList<Integer> resultadoMultiplicacion = new ArrayList<>();  // ArrayList para almacenar el resultado

            // Multiplicar los arreglos de manera recursiva y dinámica
            for (int j = 0; j < arreglo1.length; j++) {
                for (int k = 0; k < arreglo2.length; k++) {
                    ArrayList<Integer> resultadoTemp = inglesaRecursivoDinamico.multiplicaInglesaRecursivaDinamico(arreglo1[j], arreglo2[k]);
                    // Sumar los resultados temporales al resultado final
                    resultadoMultiplicacion = sumaArreglos(resultadoMultiplicacion, resultadoTemp);
                }
            }

            // Guardar el resultado de la multiplicación en un archivo
            String numeroResultado = i + ".resultado";
            // arreglo.guardarArreglos(resultadoMultiplicacion, numeroResultado);
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

    // Método para sumar dos arreglos de enteros
    private ArrayList<Integer> sumaArreglos(ArrayList<Integer> arreglo1, ArrayList<Integer> arreglo2) {
        ArrayList<Integer> resultado = new ArrayList<>();
        int carry = 0;
        int maxLength = Math.max(arreglo1.size(), arreglo2.size());

        for (int i = 0; i < maxLength || carry != 0; i++) {
            int sum = carry;
            if (i < arreglo1.size()) {
                sum += arreglo1.get(i);
            }
            if (i < arreglo2.size()) {
                sum += arreglo2.get(i);
            }
            resultado.add(sum % 10);
            carry = sum / 10;
        }

        return resultado;
    }

}
