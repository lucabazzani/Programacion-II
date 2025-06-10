package Funciones;

public class Nivel1 {

    // 1. Mostrar mensaje fijo
    public String mostrarSaludo() {
        return "Hola, mundo";
    }

    // 2. Saludo personalizado
    public void saludar(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo ni vacío.");
        }
        System.out.println("¡Hola " + nombre + "!");
    }

    // 3. Área de un rectángulo
    public double areaRectangulo(double base, double altura) {
        if (base < 0) {
            throw new IllegalArgumentException("La base no puede ser negativa.");
        }
        else if (altura < 0) {
            throw new IllegalArgumentException("La altura no puede ser negativa.");
        }
        return base * altura;
    }

    // 4. Convertir a mayúsculas
    public String convertirMayusculas(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException("El texto no puede ser nulo ni vacío.");
        }
        return texto.toUpperCase();
    }

    // 5. Mostrar menú
    public void mostrarMenu() {
        System.out.println("== Menú de opciones ==");
        System.out.println("1. Opción uno.");
        System.out.println("2. Opción dos.");
        System.out.println("3. Opción tres.");
    }
}