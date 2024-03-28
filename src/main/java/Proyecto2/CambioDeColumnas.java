package Proyecto2;

public class CambioDeColumnas {

    public void cColumnas(){
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // Intercambiar las columnas 0 y 1
        intercambiarColumnas(matriz, 0, 1);

        // Mostrar la matriz después del intercambio
        System.out.println("\nMatriz después de intercambiar las columnas 0 y 1:");
        mostrarMatriz(matriz);

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // Intercambiar las filas 0 y 1
        intercambiarFilas(matriz, 0, 1);

        // Mostrar la matriz después del intercambio
        System.out.println("\nMatriz después de intercambiar las filas 0 y 1:");
        mostrarMatriz(matriz);
    }


    // Método para intercambiar columnas en una matriz
    public static void intercambiarColumnas(int[][] matriz, int columna1, int columna2) {
        for (int i = 0; i < matriz.length; i++) {
            int temp = matriz[i][columna1];
            matriz[i][columna1] = matriz[i][columna2];
            matriz[i][columna2] = temp;
        }
    }

    // Método para intercambiar filas en una matriz
    public static void intercambiarFilas(int[][] matriz, int fila1, int fila2) {
        int[] temp = matriz[fila1];
        matriz[fila1] = matriz[fila2];
        matriz[fila2] = temp;
    }

    // Método para mostrar la matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

