package pt3ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Asignatura {
    Scanner sc = new Scanner(System.in);
    public ArrayList<Alumno> alumnosInscriptos = new ArrayList<>();

    String nombre;
    int horasSemanales;

    public Asignatura() {
        System.out.println("nombre= ");
        nombre = sc.nextLine();
        System.out.println("horasSemanales= ");
        horasSemanales = sc.nextInt();
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void agregarAlumno(Alumno a) {
        alumnosInscriptos.add(a);
    }

    public ArrayList<Alumno> getAlumnosInscriptos() {
        return alumnosInscriptos;
    }
}
