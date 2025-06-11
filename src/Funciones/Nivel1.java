package Funciones;

import java.util.Scanner;

public class Nivel1 {

    // Método nro. 1: Saludo fijo
    public static void mostrarSaludo() {
        System.out.println("Hola mundo");
    }

    // Método nro. 2: Saludo personalizado
    public static void saludar(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo ni vacío.");
        }
        System.out.println("¡Hola " + nombre + "!");
    }

    // Método nro. 3: Área de rectángulo
    public static double areaRectangulo(double base, double altura) {
        if (base < 0) {
            throw new IllegalArgumentException("La base no puede ser negativa.");
        } else if (altura < 0) {
            throw new IllegalArgumentException("La altura no puede ser negativa.");
        }
        return base * altura;
    }

    // Método nro. 4: Conversión a mayúsculas
    public static String convertirMayusculas(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException("El texto no puede ser nulo ni vacío.");
        }
        return texto.toUpperCase();
    }

    // Método nro. 5: Mostrar menú
    public static void mostrarMenu() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║                 MENÚ DE                ║");
        System.out.println("║               DE OPCIONES              ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║            OPCIÓN NÚMERO UNO           ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║            OPCIÓN NÚMERO DOS           ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║           OPCIÓN NÚMERO TRES           ║");
        System.out.println("╚════════════════════════════════════════╝");
    }

    // Creo el método main DENTRO de la clase para poder ejecutarla en consola
    public static void main(String[] args) {

        // Creo el scanner para leer lo que ingrese el usuario
        Scanner scanner = new Scanner(System.in);

        // 1. Saludo fijo (llamo o invoco al método nro. 1: mostrarSaludo)
        System.out.println("Saludo fijo");
        System.out.print("═════════════\n");
        mostrarSaludo();

        // 2. Saludo personalizado (llamo o invoco al método nro. 2: saludar)
        System.out.println("\nSaludo personalizado");
        System.out.print("════════════════════════\n");
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        saludar(nombre);

        // 3. Área de rectángulo (llamo o invoco al método nro. 3: areaRectangulo)
        System.out.println("\nCálculo de área de un rectángulo");
        System.out.print("════════════════════════════════════\n");
        System.out.print("Introduce la base: ");
        double base = scanner.nextDouble();
        System.out.print("Introduce la altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Área calculada: " + areaRectangulo(base, altura));
        scanner.nextLine();

        // 4. Conversión a mayúsculas (llamo o invoco al método nro. 4: convertirMayusculas)
        System.out.println("\nConversión a mayúsculas");
        System.out.print("═══════════════════════════\n");
        System.out.print("Introduce un texto: ");
        String texto = scanner.nextLine();
        System.out.println("En mayúsculas: " + convertirMayusculas(texto));

        // 5. Mostrar menú (llamo o invoco al método nro. 5: mostrarMenu)
        mostrarMenu();

        // Cierro el scanner
        scanner.close();
    }
}