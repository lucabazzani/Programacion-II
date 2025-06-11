package Funciones;

import java.util.Scanner;

public class Nivel2 {

    // Método nro. 6: Número par o impar
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Método nro. 7: Calcular el cuadrado de un número
    public static int cuadrado(int numero2) {
        return numero2 * numero2;
    }

    // Método nro. 8: Factorial recursivo
    public static int factorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular el factorial de un número negativo.");
        }
        if (numero == 0 || numero == 1) {
            return 1;
        }
        return numero * factorial(numero - 1);
    }

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Método nro. 6: Número par o impar
        System.out.println("¿Número par o impar?");
        System.out.print("══════════════════════\n");
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        System.out.println("El número " + numero + " es par? " + esPar(numero));
        scanner.nextLine();

        // Método nro. 7: Calcular el cuadrado de un número
        System.out.println("\nCuadrado de un número");
        System.out.print("═════════════════════════\n");
        System.out.print("Ingrese un número entero: ");
        int numero2 = scanner.nextInt();
        System.out.println("El cuadrado de " + numero2 + " es: " + cuadrado(numero2));
        scanner.nextLine();

        // Método nro. 8: Factorial recursivo
        System.out.println("\nFactorial de un número");
        System.out.print("══════════════════════════\n");
        System.out.print("Ingrese un número entero positivo: ");
        int numero3 = scanner.nextInt();
        System.out.println("El factorial de " + numero3 + " es: " + factorial(numero3));

        scanner.close();
    }
}