package ejercicio4;

import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.org.apache.xpath.internal.objects.XStringForChars;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
//Pide al usuario los nombres y apellidos de todos tus compañeros de clase y almacénalos en un array.
//Después pídele usuario una letra y muestra aquellos alumnos cuyo nombre empiece por dicha letra.
//nota: El programa termina cuando se escriba FIN como búsqueda.

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = new String();
        String apellido = new String();
        ArrayList alumno = new ArrayList();


        while(letra !='e'){
           letra = sc.next();
           System.out.println("decime tu nombre : ");
           nombre = sc.next();
           System.out.println("decime tu nombre : ");
                apellido= sc.next();

                alumno.add(nombre);
        }
    }
}


