package pt3ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    Scanner sc = new Scanner(System.in);
    ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    String nombre;

    public Empresa(){
        System.out.println("nombre de la empresa: ");
        nombre = sc.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarEmpleado(Empleado emp){
        listaEmpleados.add(emp);
    }
}
