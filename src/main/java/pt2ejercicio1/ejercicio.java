package pt2ejercicio1;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char tipo;
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++)
        {
            System.out.println("ingresar Administrativo pulse 'A' o Vendedor pulse 'V' ");
            tipo = sc.next().toUpperCase().charAt(0);
            switch (tipo)
            {
                case 'A':
                    listaEmpleados.add(new Administrativo());
                    break;
                case 'V':
                    listaEmpleados.add(new Vendedor());
                    break;
                default: i=21;
                break;
            }

        }
        ///termina el loop de for
/*        listaEmpleados.forEach(empleado ->
            System.out.println(empleado.dni)
                );*/
        for(Empleado empleado: listaEmpleados){
            System.out.print("Dni= ");
            System.out.println(empleado.dni);
            System.out.print("Nombre= ");
            System.out.println(empleado.nombre);
            System.out.print("Apellido= ");
            System.out.println(empleado.apellido);
            System.out.print("Sueldo= ");
            System.out.println(empleado.calcularSueldo());
            System.out.println("");
        }
    }
}
