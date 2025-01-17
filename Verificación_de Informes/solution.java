package Day2;


import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        int fila= 6;
        int columnas = 5;
        
        int[][] tabla = new int[fila][columnas];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los numero de tu lista");
        for(int i = 0; i < fila; i++){
            for (int j = 0; j< columnas ; j++){
                tabla [i][j] = sc.nextInt();
                int numero = tabla[i][j];
                if (tabla[i][j] > tabla[i][j -1] || tabla[i][j] <  tabla[i][j -1] +3){
                    

                }
            }
        }
        

    }
}
