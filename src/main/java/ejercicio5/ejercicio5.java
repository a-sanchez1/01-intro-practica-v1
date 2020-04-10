package ejercicio5;

import jdk.nashorn.internal.objects.NativeString;

import java.util.Scanner;


public class ejercicio5 {
    private static String texto;
//    Realizar un programa que cuente el número de veces que aparece cada una de las letras del alfabeto en un texto introducido por el usuario.
//    El recuento se hará mediante la función contarLetras() y se almacenará el total de cada letra en la posición correspondiente de un array.
//    Después se mostrará el resultado en pantalla mediante la función visualizarRecuento().
//    Nota: Recordad que para acceder a los caracteres individuales de un String disponemos del método .charAt().


    public static void main(String[] args) {
        System.out.println("escribi algo: ");
        texto = sc.nextLine();
        contarLetras();
        visualizarResultado();
    }

        static Scanner sc = new Scanner(System.in);



        public static char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        public static int[] totalPorLetra = new int[alphabet.length];

        //devuelve la cantidad que aparece el char(parametro) en el texto.
        //funciona
        public static int contarLetra ( char l){
            int total = 0;
            for (int i = 0; texto.length() > i; i++) {
                if (l == texto.charAt(i)) {
                    total += 1;
                }
            }
            return total;
        }


        public static void contarLetras() {
            for (int i = 0; alphabet.length > i; i++) {
                totalPorLetra[i] = contarLetra(alphabet[i]);
            }
        }

        public static void visualizarResultado () {
            for (int i = 0; alphabet.length > i; i++) {
                if (contarLetra(alphabet[i]) != 0) {
                    System.out.println("la letra " + alphabet[i] + " se repite " + totalPorLetra[i] + " veces.");
                }
            }
        }

}