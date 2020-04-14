package pt3ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio2de3 {

    public static Scanner sc = new Scanner(System.in);
    static ArrayList<Empresa> listaEmpresas = new ArrayList<>();
    public static ArrayList<Empleado> listaEmpleados = new ArrayList<>() ;
    public static int num = 0;

    public static void main(String[] args) {
        reset();
        agregarAListaEmpleado("jose");
        agregarAListaEmpleado("beto");
        agregarAListaEmpleado("aby");
        while (num != 5){
            switch (num) {
                case 1: {
                    listaEmpresas.add(new Empresa());
                    reset();
                    break;
                }
                case 2: {
                    System.out.println("ELIJA EL NUMERO DE ID DEL EMPLEADO A ASOCIAR: ");
                    mostrarListaEmpleados();
                    int numEmpleado = sc.nextInt();
                    System.out.println("ELIJA A LA EMPRESA QUE LO QUIERE ASOCIAR");
                    mostrarListaEmpresas();
                    int numEmpresa = sc.nextInt();
                    listaEmpresas.get(numEmpresa-1).
                        agregarEmpleado(
                            listaEmpleados.get(numEmpleado-1)
                    );
                    reset();
                    break;
                }
                case 3: {
                    mostrarListaEmpresas();
                    reset();
                    break;

                }
                case 4: {
                    detalleEmpreEmple();
                    reset();
                    break;
                }
                default: {
                    num = 5;
                }
            }
        }
    }
/*    public static ArrayList<String> getListaEmpresas() {
        int i = 0;
        ArrayList<String> nombreEmpresas = new ArrayList<>();

        for (Empresa emp: listaEmpresas) {

            System.out.println((i+1)+". "+ emp.getNombre());
            i++;

            nombreEmpresas.add(emp.getNombre());

        }
        return nombreEmpresas;
    }*/

    /* RETORNOS */
    public static void mostrarListaEmpresas() {
        int i = 0;
        System.out.println("-----------------------");
        for (Empresa emp : listaEmpresas) {

            System.out.println((i + 1) + ". " + emp.getNombre());
            i++;
        }
        System.out.println("-----------------------");
    }

    public static void mostrarListaEmpleados(){
        int i= 0;
        System.out.println();
        System.out.println("-----------------------");
        for (Empleado emp : listaEmpleados) {

            System.out.println((i + 1) + ". " + emp.getNombre());
            i++;
        }
        System.out.println("-----------------------");
    }
    public static void detalleEmpreEmple(){
        System.out.println("------------------");
        int i=1;
        for (Empresa empresa: listaEmpresas
             ) {
            System.out.println("EMPRESA:");
            System.out.println(i +". "+ empresa.getNombre());
            i++;
            if (!empresa.listaEmpleados.isEmpty()) {
                System.out.println("EMPLEADOS: ");

                for (Empleado empleado : empresa.listaEmpleados
                ) {
                    System.out.println("//// "+ empleado.getNombre());
                }
            }
            else {
                System.out.println("//// esta empresa no tiene empleados");
            }
        }
        System.out.println("------------------");
    }

    /*ACCIONES*/


    public static void agregarAListaEmpleado(String nombre){
        listaEmpleados.add(new Empleado(nombre));
    }

    public static void reset(){
        System.out.println(
                "1.Crear nueva empresa.\n" +
                        "2.Añadir empleado a empresa ya existente.\n" +
                        "3.Listado de empresas.\n" +
                        "4.Listado detallado de empresas y empleados.\n" +
                        "5.Salir");
        num = sc.nextInt();
    }
}