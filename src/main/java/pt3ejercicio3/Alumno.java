package pt3ejercicio3;

import java.util.Scanner;

public class Alumno {
    Scanner sc = new Scanner (System.in);
    public String nombre;
    public String apellido;
    public String email;

    public Alumno(){
        System.out.println("nombre= ");
        nombre = sc.nextLine();
        System.out.println("apellido= ");
        apellido = sc.nextLine();
        System.out.println("email= ");
        email = sc.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }
}
