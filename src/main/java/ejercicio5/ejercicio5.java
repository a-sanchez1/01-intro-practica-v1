package ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {
//    Realizar un programa que cuente el número de veces que aparece cada una de las letras del alfabeto en un texto introducido por el usuario.
//    El recuento se hará mediante la función contarLetras() y se almacenará el total de cada letra en la posición correspondiente de un array.
//    Después se mostrará el resultado en pantalla mediante la función visualizarRecuento().
//    Nota: Recordad que para acceder a los caracteres individuales de un String disponemos del método .charAt().


    public static void main(String[] args) {
        System.out.println(Arrays.asList(contarLetras()));
        visualizarRecuento();

    }

    static Scanner sc = new Scanner(System.in);
    static String texto = sc.nextLine();

    //devuelve la cantidad que aparece el char(parametro) en el texto.
    //funciona
    public static int contarLetra(char l) {
        int total = 0;
        for (int i = 0; texto.length() > i; i++) {
            if (l == texto.charAt(i)) {
                total += 1;
            }
        }
        return total;
    }
////////////////////// //

        //devuelve una lista ordenada en cada uno
        public static int[] contarLetras() {

            int[] cantidades = new int [texto.length()];

            for (int i = 0; texto.length() > i; i++) {
                cantidades[i] = contarLetra(texto.charAt(i));
            }
            return cantidades;
        }


        ///// ni vean esto///
        public static void visualizarRecuento(){
            for (int i=0;texto.length() > i;i++){


                System.out.println("la letra "+
                        contarLetra(texto.charAt(i))
                                + " aparecio "+ Arrays.asList(contarLetras()) + " de veces");
            }
        }
}