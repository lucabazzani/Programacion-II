package Funciones;

import java.util.Scanner;

public class Nivel4 {

    // Método nro. 13: Imprimir array de forma formateada
    public static void imprimirArray(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array no puede ser nulo.");
        }
        StringBuilder array = new StringBuilder();
        array.append("[");
        for (int i = 0; i < numeros.length; i++) {
            array.append(numeros[i]);
            if (i < numeros.length - 1) {
                array.append(", ");
            }
        }
        array.append("]");
        System.out.println(array);
    }

    // Método nro. 14: Invertir array
    public static int[] invertirArray(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array no puede ser nulo.");
        }
        int longitud = numeros.length;
        int[] invertido = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            invertido[i] = numeros[longitud - 1 - i];
        }
        return invertido;
    }

    // Método nro. 15 Estudiante con mejor nota
    public static String mejorEstudiante(String[] nombres, double[] notas) {
        if (nombres == null || notas == null) {
            throw new IllegalArgumentException("Los arrays no pueden ser nulos.");
        }
        if (nombres.length != notas.length) {
            throw new IllegalArgumentException("Los arrays de nombres y notas deben tener la misma longitud.");
        }
        if (nombres.length == 0) {
            throw new IllegalArgumentException("Los arrays no pueden estar vacíos.");
        }
        int idxMejorNota = 0;
        double mejorNota = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mejorNota) {
                mejorNota = notas[i];
                idxMejorNota = i;
            }
        }
        return nombres[idxMejorNota];
    }

    // Método main para ejecutar la clase
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Método 13
        System.out.println("\nImprimir un array");
        System.out.print("═════════════════════\n");
        System.out.print("Tamaño del array a imprimir: ");
        int tamano = scanner.nextInt();
        int[] arrayImprimir = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            System.out.print("n°[" + (i + 1) + "]: ");
            arrayImprimir[i] = scanner.nextInt();
        }
        System.out.println("\nArray impreso (o imprimido):");
        System.out.print("════════════════════════════════\n");
        imprimirArray(arrayImprimir); // Me dio risa y lo dejé

        // Método 14
        int[] invertirArrayAnterior = invertirArray(arrayImprimir);
        System.out.println("\nArray invertido");
        System.out.print("═══════════════════\n");
        imprimirArray(invertirArrayAnterior);
        scanner.nextLine();

        // Método 15
        System.out.println("\nEstudiante con mejor nota");
        System.out.print("═════════════════════════════\n");
        System.out.print("Cantidad de estudiantes: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        String[] nombres = new String[cantidad];
        double[] notas = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Nombre del estudiante nro. " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
            System.out.print("Nota del estudiante " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        System.out.println("El estudiante con mejor nota es: " + mejorEstudiante(nombres, notas));

        scanner.close();
    }
}