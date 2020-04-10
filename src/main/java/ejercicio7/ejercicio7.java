package ejercicio7;

import java.util.Random;

public class ejercicio7 {
    static Random r = new Random();
    public static int aleatorio = r.nextInt(100);
    public static int[][] ma= new int [10][10];


    public static void main(String[] args) {
        rellenoDeMatriz();
        visualizarMatriz();
    }

    public static void rellenoDeMatriz(){
        for (int x=0;x<ma.length;x++){
            for (int y=0;y<ma[0].length;y++){
                ma[x][y]= aleatorio;
                aleatorio = r.nextInt(100);
            }
        }
    }

    public static void visualizarMatriz(){
        for (int x=0;x<ma.length;x++){
            System.out.println("");
            for (int y=0;y<ma[0].length;y++){
                System.out.format("%3d ", ma[x][y]);
            }
        }
    }
}
