package Verificación_de_Informes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class solution {
    
    public static boolean esSeguro(int[] niveles, int n) {
        boolean creciente = true, decreciente = true;

        for (int i = 1; i < n; i++) {
            int diferencia = niveles[i] - niveles[i - 1];

            if (diferencia < -3 || diferencia > 3) {
                return false;
            }

            if (diferencia > 0) {
                decreciente = false;
            } else if (diferencia < 0) {
                creciente = false;
            }
        }

        return creciente || decreciente;
    }

    public static void main(String[] args) {
        String filePath = "datos.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String[] dimensions = br.readLine().split(" ");
            int filas = Integer.parseInt(dimensions[0]);
            int columnas = Integer.parseInt(dimensions[1]);

            int[][] tabla = new int[filas][columnas];

            for (int i = 0; i < filas; i++) {
                String[] line = br.readLine().split(" ");
                for (int j = 0; j < columnas; j++) {
                    tabla[i][j] = Integer.parseInt(line[j]);
                }
            }

            int seguros = 0;
            for (int i = 0; i < filas; i++) {
                if (esSeguro(tabla[i], columnas)) {
                    seguros++;
                }
            }

            System.out.println("Número de informes seguros: " + seguros);

        } catch (IOException e) {
            System.out.println("No se pudo abrir el archivo.");
            e.printStackTrace();
        }
    }
}
