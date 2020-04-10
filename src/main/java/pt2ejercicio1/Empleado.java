package pt2ejercicio1;

import java.util.Scanner;

public class Empleado {
    Scanner sc = new Scanner(System.in);
    int dni;
    String nombre;
    String apellido;
    String email;
    float sueldoBase;

    public Empleado(){

        System.out.print("DNI= ");
        this.dni = sc.nextInt();
        System.out.print("NOMBRE= ");
        this.nombre= sc.next();
        System.out.print("APELLiDO= ");
        this.apellido= sc.next();
        System.out.print("EMAIL= ");
        this.email= sc.next();
        System.out.print("SueldoBase= ");
        this.sueldoBase= sc.nextFloat();
    }

    public double calcularSueldo(){
        return  sueldoBase;
    }
}
