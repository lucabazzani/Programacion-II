package Funciones;

import java.util.Scanner;

public class Nivel3 {

    // Método nro. 9: Sumar múltiples números (varargs)
    public static int sumarNumeros(int... numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El texto no puede ser nulo ni vacío.");
        }
        int suma = 0;
        for (int n : numeros) {
            suma += n;
        }
        return suma;
    }

    // Método nro. 10: Promedio de un array
    public static double promedio(double[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("El array no puede ser nulo ni vacío.");
        }
        double suma = 0.0;
        for (double n : numeros) {
            suma += n;
        }
        return suma / numeros.length;
    }

    // Método nro. 11: Buscar valor en array
    public static boolean buscarEnArray(int[] numeros, int valorBuscado) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array no puede ser nulo.");
        }
        for (int n : numeros) {
            if (n == valorBuscado) {
                return true;
            }
        }
        return false;
    }

    // Método nro. 12: Contar ocurrencias
    public static int contarOcurrencias(String[] arreglo, String clave) {
        if (arreglo == null) {
            throw new IllegalArgumentException("El array de cadenas no puede ser nulo.");
        }
        if (clave == null) {
            throw new IllegalArgumentException("La clave a buscar no puede ser nula.");
        }
        int contador = 0;
        for (String s : arreglo) {
            if (clave.equals(s)) {
                contador++;
            }
        }
        return contador;
    }

    // Método main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Método 9
        System.out.println("Suma de n números");
        System.out.print("═══════════════════\n");
        System.out.print("¿Cuántos números quiere sumar?: ");
        int cantidad = scanner.nextInt();
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("n°[" + (i+ 1) + "]: ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("La suma de los valores es: " + sumarNumeros(numeros));
        scanner.nextLine();

        // Método 10
        System.out.println("\nPromedio de un array");
        System.out.print("════════════════════════\n");
        System.out.print("¿Cuántos valores quiere promediar?: ");
        int cantidad2 = scanner.nextInt();
        double[] numeros2 = new double[cantidad2];
        for (int i = 0; i < cantidad2; i++) {
            System.out.print("n°[" + (i + 1) + "]: ");
            numeros2[i] = scanner.nextDouble();
        }
        System.out.println("El promedio de los valores es: " + promedio(numeros2));
        scanner.nextLine();

        // Método 11
        System.out.println("\nBuscar valor dentro de un array");
        System.out.print("═══════════════════════════════════\n");
        System.out.print("¿Cuántos valores tiene el array?: ");
        int cantidad3 = scanner.nextInt();
        int[] busqueda = new int[cantidad3];
        for (int i = 0; i < cantidad3; i++) {
            System.out.print("n°[" + (i + 1) + "]: ");
            busqueda[i] = scanner.nextInt();
        }
        System.out.print("¿Valor a buscar?: ");
        int valor = scanner.nextInt();
        System.out.println("¿Encontrado? " + buscarEnArray(busqueda, valor));
        scanner.nextLine();

        // Método 12
        System.out.println("\nCuántas veces aparece un valor dentro de un array");
        System.out.print("═════════════════════════════════════════════════════\n");
        System.out.print("¿Cuántos valores tiene el array?: ");
        int cantidad4 = Integer.parseInt(scanner.nextLine());
        String[] array = new String[cantidad4];
        for (int i = 0; i < cantidad4; i++) {
            System.out.print("n°[" + (i + 1) + "]: ");
            array[i] = scanner.nextLine();
        }
        System.out.print("Clave a contar: ");
        String clave = scanner.nextLine();
        System.out.println("Ocurrencias: " + contarOcurrencias(array, clave));

        scanner.close();
    }
}