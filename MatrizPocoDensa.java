package Laboratorio;
public class MatrizPocoDensa {
    public static void main(String[] args) {
        // Crear matriz 5x4 llena de ceros
        int[][] matriz = new int[5][4];

        // Asignar manualmente al menos 3 valores distintos de cero en posiciones aleatorias
        matriz[0][1] = 5;
        matriz[2][3] = 9;
        matriz[4][0] = 2;

        // Recorrer la matriz e imprimir solo los elementos distintos de cero
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] != 0) {
                    System.out.println("[" + fila + ", " + columna + "] = " + matriz[fila][columna]);
                }
            }
        }
    }
}