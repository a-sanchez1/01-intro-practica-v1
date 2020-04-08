package ejercicio2;

public class ejercicio2 {
    //Leer un entero y luego una lista de 20 enteros.
    //Guardar los mayores al número inicial y mostrarlos al final
    public static void main(String[] args) {
        int n = 3;
        int[] x = new int[10];
        x[1] = 1;
        x[8] = 36;
        x[3] = 4;
        x[4] = 3;

        for (int i=0 ;x.length>i ;i++){
            if(x[i]>n){
                System.out.println(x[i]);
            }
        }

    }
}
