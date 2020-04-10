package pt2ejercicio1;

public class Administrativo extends Empleado {
    float hsExtra;
    float hsMes;

    public Administrativo() {
        super();
        System.out.println("HORAS EXTRA= ");
        this.hsExtra= sc.nextFloat();
        System.out.println("HORAS POR MES= ");
        this.hsMes= sc.nextFloat();
    }

    @Override
    public double calcularSueldo() {
        //Si es administrativo: sueldoBase * ((hsExtra * 1.5)+hsMes) / hsMes
        return sueldoBase * ((hsExtra*1.5)+hsMes);
    }
}
