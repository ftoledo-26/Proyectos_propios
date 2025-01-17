#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

bool esSeguro(int niveles[], int n) {
    bool creciente = true, decreciente = true;

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

int main() {

    FILE *archivo = fopen64("/Day2/datos.txt","r");
    if (archivo == NULL) {
        printf("No se pudo abrir el archivo.\n");
        return 1;
    }


    int filas = 0, columnas = 0;


    fscanf(archivo, "%d %d", &filas, &columnas);

    int **tabla = (int **)malloc(filas * sizeof(int *));
    for (int i = 0; i < filas; i++) {
        tabla[i] = (int *)malloc(columnas * sizeof(int));
    }


    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            fscanf(archivo, "%d", &tabla[i][j]);
        }
    }

    fclose(archivo);

    int seguros = 0;
    for (int i = 0; i < filas; i++) {
        if (esSeguro(tabla[i], columnas)) {
            seguros++;
        }
    }

    printf("Número de informes seguros: %d\n", seguros);

    // Liberar memoria dinámica
    for (int i = 0; i < filas; i++) {
        free(tabla[i]);
    }
    free(tabla);

    return 0;
}

