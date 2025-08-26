package Laboratorio;
import java.util.Scanner;

public class GestionNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir la cantidad de alumnos
        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = scanner.nextInt();

        // Validar que n sea mayor que cero
        if (n <= 0) {
            System.out.println("La cantidad de alumnos debe ser mayor que 0.");
            return;
        }

        // 2. Crear arreglo para las notas
        int[] notas = new int[n];

        // 3. Pedir las notas y almacenarlas
        for (int i = 0; i < n; i++) {
            int nota;
            do {
                System.out.print("Ingrese la nota del alumno " + (i + 1) + " (0-100): ");
                nota = scanner.nextInt();
            } while (nota < 0 || nota > 100);
            notas[i] = nota;
        }

        // 4. Calcular promedio
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        double promedio = (double) suma / n;
        System.out.printf("Promedio de la clase: %.2f%n", promedio);

        // 5. Contar aprobados y reprobados
        int aprobados = 0;
        int reprobados = 0;

        for (int nota : notas) {
            if (nota >= 70) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        System.out.println("Cantidad de alumnos que aprobaron: " + aprobados);
        System.out.println("Cantidad de alumnos que reprobaron: " + reprobados);

        // 6. Mensaje personalizado según el promedio
        if (promedio >= 90) {
            System.out.println("¡Excelente clase!");
        } else if (promedio >= 70) {
            System.out.println("Buen rendimiento.");
        } else {
            System.out.println("Necesitamos mejorar.");
        }

        scanner.close();
    }
}
