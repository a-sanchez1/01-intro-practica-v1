package ejercicio6;

import java.util.Random;
import java.util.Scanner;

public class ejercicio6 {
    public static Scanner sc = new Scanner (System.in);
    public static int[][] ma= new int [3][3];

    public static void main(String[] args) {
        rellenoDeMatriz();
        visualizarMatriz();
    }

    public static void rellenoDeMatriz(){
        for (int x=0;x<3;x++){
            for (int y=0;y<3;y++){
                System.out.format("introduzca un valor dentro de x=%d e y=%d%n ",x+1,y+1);
                ma[x][y]= sc.nextInt();
            }
        }
    }
    public static void visualizarMatriz(){
        for (int x=0;x<3;x++){
            System.out.println("");
            for (int y=0;y<3;y++){
                System.out.format("%d ", ma[x][y]);
            }
        }
    }

}
