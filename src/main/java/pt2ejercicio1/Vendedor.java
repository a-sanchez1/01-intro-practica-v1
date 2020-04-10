package pt2ejercicio1;

public class Vendedor extends Empleado {
    float porcenComision;
    int totalVentas;

    public Vendedor() {
        super();
        System.out.println("%COMISION= ");
        this.porcenComision= sc.nextFloat();
        System.out.println("TOTAL VENTAS= ");
        this.totalVentas= sc.nextInt();

    }
    @Override
        public double calcularSueldo(){
            return sueldoBase + (porcenComision*totalVentas/100);

    }
}
