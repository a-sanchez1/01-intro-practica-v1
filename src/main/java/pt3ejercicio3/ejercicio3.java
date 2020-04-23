package pt3ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio3 {
    static ArrayList<Alumno> arrayAlumnos= new ArrayList<>();
    static ArrayList<Asignatura> arrayAsignaturas= new ArrayList<>();

    public static Scanner sc = new Scanner(System.in);
    public static int num;
    public static void main(String[] args) {
        mostrarMenu();
        while (num!=6) {
            switch (num) {
                case 1:
                    crearAlumno();
                    mostrarMenu();
                    break;
                case 2:
                    crearAsignatura();
                    mostrarMenu();
                    break;
                case 3:
                    matricularAlumno();
                    mostrarMenu();
                    break;
                case 4:
                  listadoAlumnosEnAsignatura();
                   mostrarMenu();
                   break;
                default:
                    num = 6;
                    break;
            }
        }
    }
    public static void mostrarMenu(){
        System.out.printf(
                "1. Crear nuevo alumno %n" +
                        "2. Crear una nueva asignatura %n" +
                        "3. Matricular alumno en asignatura %n" +
                        "4. Listado de alumnos matriculados en una asignatura. %n" +
                        "5. Listado de asignaturas en las que está matriculado un alumno y total de horas. %n" +
                        "6. Salir %n");
        num = sc.nextInt();
    }

    public static void crearAlumno(){
        arrayAlumnos.add(new Alumno());
    }
    public static void crearAsignatura(){
        arrayAsignaturas.add(new Asignatura());
    }
    public static void matricularAlumno(){
        System.out.println("Elija el numero de id del alumno a matricular= ");

        for (int i = 0; i < arrayAlumnos.size(); i++) {
            System.out.println(i+1+". "+ arrayAlumnos.get(i).getNombre()+" "+ arrayAlumnos.get(i).getApellido());
        }
        int alum = sc.nextInt()-1;

        System.out.println("Elija el numero de id de la asignatura que lo va a asignar");
        for (int i = 0; i < arrayAsignaturas.size(); i++) {
            System.out.println(i+1+". "+ arrayAsignaturas.get(i).getNombre());
        }
        int asig = sc.nextInt()-1;

        /*aqui agrega alumno*/

        arrayAsignaturas.get(asig).agregarAlumno(arrayAlumnos.get(alum));
    }
    public static void listadoAlumnosEnAsignatura(){
        System.out.println("Elija el numero de id de la asignatura va consultar: ");
        for (int i = 0; i < arrayAsignaturas.size(); i++) {
            System.out.println(i+1+". "+ arrayAsignaturas.get(i).getNombre());
        }
        int id = sc.nextInt();

        System.out.println("de la asignatura "+arrayAsignaturas.get(id-1).getNombre()+" los alumnos son: ");
        arrayAsignaturas.get(id-1).getAlumnosInscriptos();

    }
}