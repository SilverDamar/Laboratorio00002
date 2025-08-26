package Laboratorio;
import java.util.Scanner;

public class BuscadorMatriz {
    public static void main(String[] args) {
        // 1. Inicializar matriz 3x3 con valores predefinidos
        int[][] matriz = {
            {1, 4, 2},
            {5, 7, 4},
            {4, 8, 9}
        };

        Scanner scanner = new Scanner(System.in);

        // 2. Pedir al usuario el número a buscar
        System.out.print("Ingrese un número para buscar en la matriz: ");
        int numeroBuscado = scanner.nextInt();

        // 3. Recorrer la matriz con bucles for anidados
        boolean encontrado = false;

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] == numeroBuscado) {
                    System.out.println("Número encontrado en [" + fila + "][" + columna + "]");
                    encontrado = true;
                    // Si deseas seguir buscando todas las ocurrencias, no hagas break aquí
                }
            }
        }

        // 4. Mostrar mensaje si no se encontró
        if (!encontrado) {
            System.out.println("Número no encontrado.");
        }

        scanner.close();
    }
}

