package Funciones;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Nivel1 n1 = new Nivel1();
        Nivel2 n2 = new Nivel2();
        Nivel3 n3 = new Nivel3();
        Nivel4 n4 = new Nivel4();

        String opc;
        do {
            System.out.println("=== Programa de Ejercicios POO ===");
            System.out.println("1) Nivel 1 – Fundamentos de métodos");
            System.out.println("2) Nivel 2 – Métodos con retorno y lógica");
            System.out.println("3) Nivel 3 – Métodos con varargs y arrays");
            System.out.println("4) Nivel 4 – Métodos combinados y más complejos");
            System.out.println("5) Salir");
            System.out.print("Selecciona un nivel: ");
            opc = scanner.nextLine().trim();

            switch (opc) {
                case "1":
                    System.out.println("\n--- Nivel 1 ---");
                    // 1) Mostrar saludo
                    System.out.println(n1.mostrarSaludo());

                    // 2) Saludo personalizado
                    System.out.print("Ingresa tu nombre: ");
                    String nombre = scanner.nextLine();
                    n1.saludar(nombre);

                    // 3) Área rectángulo
                    System.out.print("Base: ");
                    double base = Double.parseDouble(scanner.nextLine());
                    System.out.print("Altura: ");
                    double altura = Double.parseDouble(scanner.nextLine());
                    System.out.println("Área = " + n1.areaRectangulo(base, altura));

                    // 4) Mayúsculas
                    System.out.print("Texto a convertir: ");
                    String txt = scanner.nextLine();
                    System.out.println(n1.convertirMayusculas(txt));

                    // 5) Mostrar menú nivel1
                    n1.mostrarMenu();
                    break;

                case "2":
                    System.out.println("\n--- Nivel 2 ---");
                    // 6) Par o impar
                    System.out.print("Número entero: ");
                    int p = Integer.parseInt(scanner.nextLine());
                    System.out.println(p + " es par? " + n2.esPar(p));

                    // 7) Cuadrado
                    System.out.print("Otro entero para cuadrarlo: ");
                    int c = Integer.parseInt(scanner.nextLine());
                    System.out.println("Cuadrado = " + n2.cuadrado(c));

                    // 8) Factorial
                    System.out.print("Entero para factorial: ");
                    int f = Integer.parseInt(scanner.nextLine());
                    System.out.println("Factorial = " + n2.factorial(f));
                    break;

                case "3":
                    System.out.println("\n--- Nivel 3 ---");
                    // 9) Suma varargs
                    System.out.print("¿Cuántos números sumar? ");
                    int k = Integer.parseInt(scanner.nextLine());
                    int[] nums = new int[k];
                    for (int i = 0; i < k; i++) {
                        System.out.print("n[" + i + "]: ");
                        nums[i] = Integer.parseInt(scanner.nextLine());
                    }
                    System.out.println("Suma = " + n3.sumarNumeros(nums));

                    // 10) Promedio
                    System.out.print("¿Cuántos valores promedio? ");
                    int m = Integer.parseInt(scanner.nextLine());
                    double[] vals = new double[m];
                    for (int i = 0; i < m; i++) {
                        System.out.print("v[" + i + "]: ");
                        vals[i] = Double.parseDouble(scanner.nextLine());
                    }
                    System.out.println("Promedio = " + n3.promedio(vals));

                    // 11) Buscar en array
                    System.out.print("¿Tamaño del array de búsqueda? ");
                    int s = Integer.parseInt(scanner.nextLine());
                    int[] busq = new int[s];
                    for (int i = 0; i < s; i++) {
                        System.out.print("b[" + i + "]: ");
                        busq[i] = Integer.parseInt(scanner.nextLine());
                    }
                    System.out.print("¿Valor a buscar? ");
                    int clave = Integer.parseInt(scanner.nextLine());
                    System.out.println("¿Encontrado? " + n3.buscarEnArray(busq, clave));

                    // 12) Contar ocurrencias
                    System.out.print("¿Cuántas cadenas? ");
                    int t = Integer.parseInt(scanner.nextLine());
                    String[] arrStr = new String[t];
                    for (int i = 0; i < t; i++) {
                        System.out.print("s[" + i + "]: ");
                        arrStr[i] = scanner.nextLine();
                    }
                    System.out.print("¿Clave a contar? ");
                    String claveStr = scanner.nextLine();
                    System.out.println("Ocurrencias = " + n3.contarOcurrencias(arrStr, claveStr));
                    break;

                case "4":
                    System.out.println("\n--- Nivel 4 ---");
                    // 13) Imprimir array
                    System.out.print("Tamaño del array a imprimir: ");
                    int a = Integer.parseInt(scanner.nextLine());
                    int[] imp = new int[a];
                    for (int i = 0; i < a; i++) {
                        System.out.print("i[" + i + "]: ");
                        imp[i] = Integer.parseInt(scanner.nextLine());
                    }
                    n4.imprimirArray(imp);

                    // 14) Invertir array
                    int[] inv = n4.invertirArray(imp);
                    System.out.print("Invertido: ");
                    n4.imprimirArray(inv);

                    // 15) Mejor estudiante
                    System.out.print("¿Cuántos estudiantes? ");
                    int e = Integer.parseInt(scanner.nextLine());
                    String[] noms = new String[e];
                    double[] notas = new double[e];
                    for (int i = 0; i < e; i++) {
                        System.out.print("Nombre[" + i + "]: ");
                        noms[i] = scanner.nextLine();
                        System.out.print("Nota[" + i + "]: ");
                        notas[i] = Double.parseDouble(scanner.nextLine());
                    }
                    System.out.println("Mejor estudiante: " + n4.mejorEstudiante(noms, notas));
                    break;

                case "5":
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();
        } while (!opc.equals("5"));

        scanner.close();
    }
}