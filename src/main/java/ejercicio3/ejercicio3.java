package ejercicio3;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.Scanner;

public class ejercicio3 {
    //   Pide al usuario las temperaturas de un día (un valor cada hora durante 24 horas) y almacénalas en un array.
    // Usando los datos contenidos en el array, calcula la temperatura media, la máxima y la mínima.
    public static void main(String[] args) {
        float[] temp = new float[24];
        Scanner sc = new Scanner(System.in);
        for (int i= 0; i<24 ;i++){
            System.out.println("decime cuantos grados hizo a las "+ (i+1) + "hs (decimales con ',')");
            float grados = sc.nextFloat();
            temp[i] = grados;
            System.out.println(grados + "°C");
        }
        //para la maxima
        float max = temp[0];
        for (int i=0; i<24 ;i++){

            if(temp[i]>max) {
                max = temp[i];
            }
        }
        System.out.println("La maxima del dia fue: "+ max + "°C");

        float min = temp[0];
        for (int i=0; i<24 ;i++){

            if(temp[i]<min) {
                min = temp[i];
            }
        }
        System.out.println("La minimo del dia fue: "+ min + "°C");

        float prom = 0;
        for (int i=0; i<24 ;i++){
            prom += temp[i];
        }
        prom = prom / temp.length;
        System.out.println("la temperatura promedio del dia fue: "+prom + "°C");
    }
}
